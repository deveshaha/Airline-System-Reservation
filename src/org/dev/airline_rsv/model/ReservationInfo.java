package org.dev.airline_rsv.model;

public class ReservationInfo {
	
	private String costumer_id;
	private String flight_num;
	private String flight_name;
	private String departure_time;
	private String arrival_time;
	private String status;
	private String origin;
	private String destination;
	private String num_of_seats;
	
	public ReservationInfo(String costumer_id, String flight_num, String flight_name, String departure_time,
			String arrival_time, String status, String origin, String destination, String num_of_seats) {
		this.costumer_id = costumer_id;
		this.flight_num = flight_num;
		this.flight_name = flight_name;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.status = status;
		this.origin = origin;
		this.destination = destination;
		this.num_of_seats = num_of_seats;
	}

	@Override
	public String toString() {
		return "ReservationInfo [costumer_id=" + costumer_id + ", flight_num=" + flight_num + ", flight_name="
				+ flight_name + ", departure_time=" + departure_time + ", arrival_time=" + arrival_time + ", status="
				+ status + ", origin=" + origin + ", destination=" + destination + ", num_of_seats=" + num_of_seats
				+ "]";
	}
	
	
	

}
