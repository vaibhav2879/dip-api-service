package com.dip.model;

/**
 * @author HCL
 *
 */
public class CustomLocation {
	private Location location;
	private StringBuilder fullAddress;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public StringBuilder getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(StringBuilder fullAddress) {
		this.fullAddress = fullAddress;
	}
	 /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
	@Override
	public String toString() {
		return "CustomLocation [location=" + location + ", fullAddress=" + fullAddress + "]";
	}

}
