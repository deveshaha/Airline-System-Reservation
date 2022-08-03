package org.dev.airline_rsv.model;

public class FlightCancellation {
	
	private String costumer_id;
	private String flight_id;
	private String origin;
	private String destination;
	private String flight_name;
	private String departure;
	private String arrival;
	private String seat_num;
	
	public FlightCancellation(String costumer_id, String flight_id, String origin, String destination,
			String flight_name, String departure, String arrival, String seat_num) {
		this.costumer_id = costumer_id;
		this.flight_id = flight_id;
		this.origin = origin;
		this.destination = destination;
		this.flight_name = flight_name;
		this.departure = departure;
		this.arrival = arrival;
		this.seat_num = seat_num;
	}

	@Override
	public String toString() {
		return "FlightCancellation [costumer_id=" + costumer_id + ", flight_id=" + flight_id + ", origin=" + origin
				+ ", destination=" + destination + ", flight_name=" + flight_name + ", departure=" + departure
				+ ", arrival=" + arrival + ", seat_num=" + seat_num + "]";
	}
	
	
	

}
