package com.dip.service;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.dip.constant.DashboardConstant;
import com.dip.exception.DipPortletException;
import com.dip.exception.SystemServiceException;
import com.dip.handler.ApiHandler;
import com.dip.model.cars.Cars;
import com.dip.serviceinterface.RequestQuoteService;
import com.dip.util.ErrorCodes;
import com.dip.util.LoggingWrapper;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;


@Component
public class RequestQuoteServiceImpl implements RequestQuoteService {

	private static Log log = LogFactoryUtil.getLog(RequestQuoteServiceImpl.class);
	private String CLASS_NAME = RequestQuoteServiceImpl.class.getName();

	public final static String PICKUPSLIST_API_URL = "http://localhost:8989/requestQuoteFromData";
	public final static String SHIPMENTLIST_API_URL = PropsUtil.get("dashboard.draftshipment.endpoint.url");
	public final static String MANIFEST_API_URL = PropsUtil.get("dashboard.manifests.endpoint.url");
	public final static String WATCHLIST_MULE_API_URL = PropsUtil.get("dashboard.watchlist.mule.endpoint.url");
	public final static String WATCHLIST_CONSIGNMENT_API_URL = PropsUtil.get("dashboard.watchlist.consignment.endpoint.url");
	
	
	
	@Override
	public Cars getCarsMasterData(String countryId) throws DipPortletException, SystemServiceException { 
		String signature = CLASS_NAME + "#getPickUpsList()";
		Cars cars= null;
		StringBuilder apiURL = new StringBuilder(PICKUPSLIST_API_URL);

		apiURL.append(StringPool.FORWARD_SLASH);
		
		/*apiURL.append(StringPool.QUESTION).append(DashboardConstant.FROM_PICKUP_SIZE).append(StringPool.EQUAL).append(offset);
					
		apiURL.append(StringPool.AMPERSAND).append(DashboardConstant.TO_PICKUP_SIZE).append(StringPool.EQUAL).append(limit);
		
		apiURL.append(StringPool.AMPERSAND).append(PICKUP_SORT).append(StringPool.EQUAL).append(PICKUP_DATE);*/
		
		/*if(null != searchParam){
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
     		  
     	  }*/
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
			JSONObject jSONObject = (JSONObject) new ApiHandler().getDataForDashboardAPI(apiURL.toString(), "GET", "", "");
			cars = mapper.reader(Cars.class).readValue(jSONObject.toString());
			
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
		
		return cars;
	}
	
}
