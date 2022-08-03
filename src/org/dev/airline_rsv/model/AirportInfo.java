package org.dev.airline_rsv.model;

public class AirportInfo {

	private String country;
	private String airport_name;
	
	public AirportInfo(String country, String airport_name) {
		this.country = country;
		this.airport_name = airport_name;
	}
	
	@Override
	public String toString() {
		return "AirportInfo [country=" + country + ", airport_name=" + airport_name + "]";
	}
	
	
	
	
}
