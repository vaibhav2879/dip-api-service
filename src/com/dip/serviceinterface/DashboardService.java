package com.dip.serviceinterface;

import com.dip.exception.SystemServiceException;
import com.dip.model.dashboard.PickupsBooked;
import com.dip.model.dashboard.ShipmentsCreated;
import com.dip.model.dashboard.manifest.GetManifestResponse;
import com.dip.model.dashboard.manifest.ManifestSearchParam;
import com.dip.model.dashboard.pickup.GetPickupResponse;
import com.dip.model.dashboard.pickup.PickupSearchParam;
import com.dip.model.dashboard.shipment.ShipmentList;
import com.dip.model.dashboard.watchlist.WatchListResponse;
import com.dip.exception.DipPortletException;

/**
 * @author HCL
 *
 */
public interface DashboardService {
	
	public ShipmentsCreated  getShipmentsCreated(String myTollIdentity) throws DipPortletException, SystemServiceException;

	public PickupsBooked getPickupsBooked(String myTollIdentity) throws DipPortletException, SystemServiceException;
	
	public GetPickupResponse getPickUpsList(String myTollIdentity, int offset, int limit, PickupSearchParam searchParam) 
			throws DipPortletException, SystemServiceException;

	public ShipmentList getDraftShipmentList(String myTollIdentity) throws DipPortletException,	SystemServiceException;

	public GetManifestResponse getManifestList(String myTollIdentity, int offset, int limit, ManifestSearchParam searchParam)
			throws DipPortletException, SystemServiceException;
	
	public WatchListResponse getShipmentWatchList(String myTollIdentity, String customerID) 
			throws DipPortletException, SystemServiceException;
	
}
