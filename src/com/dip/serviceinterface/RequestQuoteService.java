package com.dip.serviceinterface;

import com.dip.exception.DipPortletException;
import com.dip.exception.SystemServiceException;
import com.dip.model.cars.Cars;

/**
 * @author Vaibhav Agarwal
 *
 */
public interface RequestQuoteService {
	
	public Cars  getCarsMasterData(String countryId) throws DipPortletException, SystemServiceException;

}
