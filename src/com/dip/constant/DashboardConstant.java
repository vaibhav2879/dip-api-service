package com.dip.constant;

import com.liferay.portal.kernel.util.PropsUtil;

public class DashboardConstant {

	public static final String QUICK_RATE_ENQUIREY = "quick.rate.enquiry";
	public static final String BOOK_A_PICKUP = "book.a.pickup";
	public static final String HTTP_PROXY_NAME = "proxy name";
	public static final String HTTP_PROXY_PORT = "8080";
	public final static String PICKUP_API_URL = "dashboard.pickup.created.count.endpoint.url";
	public final static String SHIPMENT_CREATED_COUNT_API_URL = "dashboard.shipment.created.count.endpoint.url";
	public final static String FROM_PICKUP_SIZE = "Start";
	public final static String  TO_PICKUP_SIZE = "Size";
	public final static String FROM_PICKUP_SIZE_VALUE = "0";
	public final static String  TO_PICKUP_SIZE_VALUE = PropsUtil.get("dashboard.pickup.numberofresults.limit");
	public final static String MANIFEST_OFFSET = "offset";
	public final static String MANIFEST_LIMIT = "limit";
	public final static String MANIFEST_OFFSET_VALUE = "1";
	public final static String MANIFEST_LIMIT_VALUE = PropsUtil.get("dashboard.manifest.numberofresults.limit");
	public final static String WATCHLIST_API_ACTION = "Fetch Watchlist for user";
}
