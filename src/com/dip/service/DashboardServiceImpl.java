package com.dip.service;

import com.dip.exception.SystemServiceException;
import com.dip.constant.DashboardConstant;
import com.dip.exception.DipPortletException;
import com.dip.handler.ApiHandler;
import com.dip.model.dashboard.PickupsBooked;
import com.dip.model.dashboard.ShipmentsCreated;
import com.dip.model.dashboard.manifest.GetManifestResponse;
import com.dip.model.dashboard.manifest.ManifestSearchParam;
import com.dip.model.dashboard.pickup.GetPickupResponse;
import com.dip.model.dashboard.pickup.PickupSearchParam;
import com.dip.model.dashboard.shipment.ShipmentList;
import com.dip.model.dashboard.watchlist.WatchListConsignment;
import com.dip.model.dashboard.watchlist.WatchListResponse;
import com.dip.serviceinterface.DashboardService;
import com.dip.util.ErrorCodes;
import com.dip.util.LoggingWrapper;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;


@Component
public class DashboardServiceImpl implements DashboardService {

	private static Log log = LogFactoryUtil.getLog(DashboardServiceImpl.class);
	private String CLASS_NAME = DashboardServiceImpl.class.getName();
	public static final String SHIPMENT_CREATED_COUNT_API_URL = PropsUtil.get(DashboardConstant.SHIPMENT_CREATED_COUNT_API_URL);
	public static final String PICKUP_API_URL = PropsUtil.get(DashboardConstant.PICKUP_API_URL);
	public final static String PICKUPSLIST_API_URL = PropsUtil.get("dashboard.mypickups.endpoint.url");
	public final static String SHIPMENTLIST_API_URL = PropsUtil.get("dashboard.draftshipment.endpoint.url");
	public final static String MANIFEST_API_URL = PropsUtil.get("dashboard.manifests.endpoint.url");
	public final static String WATCHLIST_MULE_API_URL = PropsUtil.get("dashboard.watchlist.mule.endpoint.url");
	public final static String WATCHLIST_CONSIGNMENT_API_URL = PropsUtil.get("dashboard.watchlist.consignment.endpoint.url");
	public final static String TOLL_CARRIER = "tollCarrier";
	public final static String CARRIER_CODE = "CarrierCode";
	public final static String PICKUP_FROM_DATE_PARAM = "FromDate"; 
	public final static String PICKUP_TO_DATE_PARAM = "ToDate";
	public final static String MANIFEST_FROM_DATE_PARAM = "fromDate";
	public final static String MANIFEST_TO_DATE_PARAM = "toDate";
	public final static String SHIPMENT_NUMBER = "shipmentNumber";
	public final static String CHANNEL_API = "ces";
	public final static String PICKUP_SORT = "Sort";
	public final static String PICKUP_DATE = "PickupDate";
	
	
	@Override
	public GetPickupResponse getPickUpsList(String myTollIdentity, int offset, int limit, PickupSearchParam searchParam) throws DipPortletException, SystemServiceException { 
		String signature = CLASS_NAME + "#getPickUpsList()";
		GetPickupResponse myPickups= null;
		StringBuilder apiURL = new StringBuilder(PICKUPSLIST_API_URL);

		apiURL.append(StringPool.FORWARD_SLASH);
		
		apiURL.append(StringPool.QUESTION).append(DashboardConstant.FROM_PICKUP_SIZE).append(StringPool.EQUAL).append(offset);
					
		apiURL.append(StringPool.AMPERSAND).append(DashboardConstant.TO_PICKUP_SIZE).append(StringPool.EQUAL).append(limit);
		
		apiURL.append(StringPool.AMPERSAND).append(PICKUP_SORT).append(StringPool.EQUAL).append(PICKUP_DATE);
		
		if(null != searchParam){
     		  if(StringUtils.isNotBlank(searchParam.getPickupTollCarrier())){
     			apiURL.append(StringPool.AMPERSAND).append(CARRIER_CODE).append(StringPool.EQUAL).append(searchParam.getPickupTollCarrier().trim());
     		  }
     		  
     		  if(StringUtils.isNotBlank(searchParam.getFromDateFmt()) && StringUtils.isNotBlank(searchParam.getToDateFmt())){
     			apiURL.append(StringPool.AMPERSAND).append(PICKUP_FROM_DATE_PARAM).append(StringPool.EQUAL).append(searchParam.getFromDateFmt().trim());
     			apiURL.append(StringPool.AMPERSAND).append(PICKUP_TO_DATE_PARAM).append(StringPool.EQUAL).append(searchParam.getToDateFmt().trim());
     		  }
     		  
     		  if(StringUtils.isNotBlank(searchParam.getPickupNameId())){
     			apiURL.append(StringPool.AMPERSAND).append("BookingRefNo").append(StringPool.EQUAL).append(searchParam.getPickupNameId().trim());
     		  }
     		  
     	  }
		try {
			JSONObject jSONObject = (JSONObject) new ApiHandler().getDataForDashboardAPI(apiURL.toString(), "GET", CHANNEL_API, myTollIdentity);
			myPickups = new ObjectMapper().reader(GetPickupResponse.class).readValue(jSONObject.toString());
			
		} catch (DipPortletException e) {
			DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
			portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
			LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
					portletException.getErrorKey(), portletException);
			throw portletException;
		}catch (SystemServiceException e) {
			DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
			portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
			LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
					portletException.getErrorKey(), portletException);
			throw portletException;
		}catch (JsonParseException e) {
			DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
			portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
			LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
					portletException.getErrorKey(), portletException);
			throw portletException;
		}catch (JsonMappingException e) {
			DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
			portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
			LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
					portletException.getErrorKey(), portletException);
			throw portletException;
		}catch (IOException e) {
			DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
			portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
			LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
					portletException.getErrorKey(), portletException);
			throw portletException;
		} catch (Exception e) {
			DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
			portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
			LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
					portletException.getErrorKey(), portletException);
			throw portletException;
		}
		
		return myPickups;
	}
	
	@Override
	public ShipmentList getDraftShipmentList(String myTollIdentity) throws DipPortletException, SystemServiceException {
		String signature = CLASS_NAME + "#getShipmentList()";
		Date entranceTimestamp = LoggingWrapper.logEntrance(log, signature,
				new String[] { }, new Object[] {}, null,
				null);
		ShipmentList draftShipments= null;
		StringBuilder apiURL = new StringBuilder(SHIPMENTLIST_API_URL);
		apiURL.append(StringPool.FORWARD_SLASH);
		apiURL.append(StringPool.QUESTION).append("carrier").append(StringPool.EQUAL).append("TNQX");
		
		JSONObject jSONObject = (JSONObject) new ApiHandler().getDataForDashboardAPI(apiURL.toString(), "GET", CHANNEL_API, myTollIdentity);
		
		try {
			draftShipments = new ObjectMapper().reader(ShipmentList.class).readValue(jSONObject.toString());
		} catch (IOException e) {
			DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
			portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
			LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
					portletException.getErrorKey(), portletException);
			throw portletException;
		}
		LoggingWrapper.logExit(log, signature, new Object[] { draftShipments }, entranceTimestamp);
		return draftShipments;
	}
	
	@Override
    public GetManifestResponse getManifestList(String myTollIdentity, int offset, int limit, ManifestSearchParam searchParam) 
    		throws DipPortletException, SystemServiceException { 
          String signature = CLASS_NAME + "#getManifestList()";
          Date entranceTimestamp = LoggingWrapper.logEntrance(log, signature,
                      new String[] { }, new Object[] {}, null,
                      null);
          GetManifestResponse manifestList= null;
          StringBuilder apiURL = new StringBuilder(MANIFEST_API_URL);
          apiURL.append(StringPool.FORWARD_SLASH);
       	  
          
       	  if(null != searchParam){
       		  if(StringUtils.isNotBlank(searchParam.getTollCarrier())){
       			apiURL.append(StringPool.QUESTION).append(TOLL_CARRIER).append(StringPool.EQUAL).append(searchParam.getTollCarrier().trim());
       		  }else{
       			apiURL.append(StringPool.QUESTION).append(TOLL_CARRIER).append(StringPool.EQUAL).append("ALL");
       		  }
       		  if(StringUtils.isNotBlank(searchParam.getFromDateFmt()) && StringUtils.isNotBlank(searchParam.getToDateFmt())){
       			apiURL.append(StringPool.AMPERSAND).append(MANIFEST_FROM_DATE_PARAM).append(StringPool.EQUAL).append(searchParam.getFromDateFmt().trim());
       			apiURL.append(StringPool.AMPERSAND).append(MANIFEST_TO_DATE_PARAM).append(StringPool.EQUAL).append(searchParam.getToDateFmt().trim());
       		  }
       		  
       		  /*if(StringUtils.isNotBlank(searchParam.getManifestNameId())){
       			apiURL.append(StringPool.AMPERSAND).append("manifestId").append(StringPool.EQUAL).append(searchParam.getManifestNameId().trim());
       		  }*/
       	  }else{
       		apiURL.append(StringPool.QUESTION).append(TOLL_CARRIER).append(StringPool.EQUAL).append("ALL");
       	  }
       	  
       	  
     	  apiURL.append(StringPool.AMPERSAND).append(DashboardConstant.MANIFEST_OFFSET).append(StringPool.EQUAL).append(offset);
     	  apiURL.append(StringPool.AMPERSAND).append(DashboardConstant.MANIFEST_LIMIT).append(StringPool.EQUAL).append(limit);
     	  apiURL.append(StringPool.AMPERSAND).append("sort").append(StringPool.EQUAL).append("desc");
     	 
     	 try {
     		 	JSONObject jSONObject = (JSONObject) new ApiHandler().getDataForDashboardAPI(apiURL.toString(), "GET", CHANNEL_API, myTollIdentity);
                manifestList = new ObjectMapper().reader(GetManifestResponse.class).readValue(jSONObject.toString());
          } catch (JsonProcessingException e) {
				DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
				portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
				LoggingWrapper.logException(log, signature, portletException.getSecretCode(),portletException.getErrorKey(), e);
				throw portletException;
			} catch (IOException e) {
				DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
				portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
				LoggingWrapper.logException(log, signature, portletException.getSecretCode(),portletException.getErrorKey(), e);
				throw portletException;
			}catch (Exception e) {
				DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
				portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
				LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
						portletException.getErrorKey(), portletException);
				throw portletException;
			}
          LoggingWrapper.logExit(log, signature, new Object[] { manifestList }, entranceTimestamp);
          return manifestList;
    }
	
	@Override
	public ShipmentsCreated getShipmentsCreated(String myTollIdentity) throws DipPortletException, SystemServiceException {
		String signature = CLASS_NAME + "#getShipmentsCreated()";
		Date entranceTimestamp = LoggingWrapper.logEntrance(log, signature,
				new String[] { }, new Object[] {}, null,
				null);
		ShipmentsCreated shipmentsCreated = null;
		StringBuilder apiURL = new StringBuilder(SHIPMENT_CREATED_COUNT_API_URL);
		
		JSONObject jSONObject = (JSONObject) new ApiHandler().getDataForDashboardAPI(apiURL.toString(), "GET", CHANNEL_API, myTollIdentity);
		
		try {
			shipmentsCreated = new ObjectMapper().reader(ShipmentsCreated.class)
					.readValue(jSONObject.toString());
		} catch (IOException e) {
			DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
			portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
			LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
					portletException.getErrorKey(), portletException);
			throw portletException;
		}
		LoggingWrapper.logExit(log, signature, new Object[] { shipmentsCreated }, entranceTimestamp);
		return shipmentsCreated;
	}

	@Override
	public PickupsBooked getPickupsBooked(String myTollIdentity) throws DipPortletException, SystemServiceException {
		String signature = CLASS_NAME + "#getPickupsBooked()";
		Date entranceTimestamp = LoggingWrapper.logEntrance(log, signature,
				new String[] { }, new Object[] { }, null,
				null);
		PickupsBooked pickupsBooked = null;
		StringBuilder apiURL = new StringBuilder(PICKUP_API_URL);
		JSONObject jSONObject = (JSONObject) new ApiHandler().getDataForDashboardAPI(apiURL.toString(), "GET", CHANNEL_API, myTollIdentity);
		try {
			pickupsBooked = new ObjectMapper().reader(PickupsBooked.class)
					.readValue(jSONObject.toString());
		} catch (IOException e) {
			DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
			portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
			LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
					portletException.getErrorKey(), portletException);
			throw portletException;
		}
		LoggingWrapper.logExit(log, signature, new Object[] { pickupsBooked }, entranceTimestamp);
		return pickupsBooked;
	}

	
	@Override
	public WatchListResponse getShipmentWatchList(String myTollIdentity, String customerId) throws DipPortletException, SystemServiceException {
		String signature = CLASS_NAME + "#getShipmentWatchList(String userId, String startRow, String maxResult, String customerId, String CESTag) ";
		Date entranceTimestamp = LoggingWrapper.logEntrance(log, signature, new String[] { "userId", "customerId"},
				new Object[] { myTollIdentity, customerId }, null, null);
				
		//******** Getting WatchListConsignment Id's **********************/
		
		//WatchListConsignment[] watchlistCons = null;
		
		List<WatchListConsignment> watchListConsignment = null;
		
		WatchListResponse watchlistResponse= null;
		ApiHandler apiHandler = new ApiHandler();
		ObjectMapper objectMapper = new ObjectMapper();
		JSONArray responseArray = null;
		JSONObject responseObject = null;
		
		//if (Validator.isNotNull(userId)) {
			StringBuilder apiURL = new StringBuilder(WATCHLIST_CONSIGNMENT_API_URL);
			log.info("Start executing getShipmentWatchList for myTollIdentity : "+myTollIdentity);
			try {
				log.info("getShipmentWatchList --> execute API - "+apiURL.toString());
				Object obj = apiHandler.getDataForDashboardAPI(apiURL.toString(), "GET", CHANNEL_API, myTollIdentity);
				if (obj instanceof JSONObject) {
					responseObject = (JSONObject) obj;
					if (responseObject.has("code") && responseObject.getString("code").equalsIgnoreCase("404")) {
						watchListConsignment = new ArrayList<WatchListConsignment>();
					}
					// addList =
					// objectMapper.readValue(responseObject.toString(), new
					// TypeReference<List<Address>>() {});
				}
				if(obj instanceof JSONArray){
					responseArray = (JSONArray) obj;
					watchListConsignment = objectMapper.readValue(responseArray.toString(), new TypeReference<List<WatchListConsignment>>() {});
					
					List<String> consignmentList = new ArrayList<String>();
	                if(watchListConsignment !=null && watchListConsignment.size()>0){
	                      for(WatchListConsignment consignmentStr : watchListConsignment){
	                            consignmentList.add(consignmentStr.getObject());
	                      }
	                }
	                
					JSONObject consignmentObj = JSONFactoryUtil.createJSONObject();
					if(StringUtils.isNotBlank(customerId)){
						consignmentObj.put("customerid", customerId);
					}
					//consignmentObj.put("noOfRecordToFetch", consignmentList.size());
					//consignmentObj.put("startRecord", 1);
					consignmentObj.put("consignmentId", consignmentList);
					
					log.debug("Mule API parameter JSON - "+consignmentObj.toJSONString());
				
				
					if (watchListConsignment.size() > 0){
						//watchlistCons = new ObjectMapper().reader(WatchListConsignment[].class).readValue(jsonArray.toString());
		                
						//log.info("Mule API parameter JSON String - "+consignmentObj.toString());
						//******************************************* Getting Watchlist ******************************************************	
						StringBuilder watchlistApiURL = new StringBuilder(WATCHLIST_MULE_API_URL);
						log.info("GetShipmentWatchList --> call Mule API url --> "+watchlistApiURL.toString());
						JSONObject response = apiHandler.getPostDataFromAPI(watchlistApiURL.toString(), consignmentObj.toString(),DashboardConstant.WATCHLIST_API_ACTION, CHANNEL_API);	
						
						log.debug("WatchList Response == "+response.toString());
						
						watchlistResponse = new ObjectMapper().reader(WatchListResponse.class).readValue(response.toString());
					}
				}
			} catch (JsonProcessingException e) {
				DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
				portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
				LoggingWrapper.logException(log, signature, portletException.getSecretCode(),portletException.getErrorKey(), e);
				throw portletException;
			} catch (IOException e) {
				DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
				portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
				LoggingWrapper.logException(log, signature, portletException.getSecretCode(),portletException.getErrorKey(), e);
				throw portletException;
			}catch (Exception e) {
				DipPortletException portletException = new DipPortletException(ErrorCodes.DIP_ERR_00002, e);
				portletException.setMessage(ErrorCodes.map.get(ErrorCodes.DIP_ERR_00002) + e.getMessage());
				LoggingWrapper.logException(log, signature, portletException.getSecretCode(),
						portletException.getErrorKey(), portletException);
				throw portletException;
			}
		
		return watchlistResponse;
	}

}
