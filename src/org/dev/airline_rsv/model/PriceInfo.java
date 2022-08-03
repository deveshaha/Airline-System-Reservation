package org.dev.airline_rsv.model;

public class PriceInfo {
	
	private String seat_category; //first class, business, etc
	private String customer_name;
	private String seat_num;
	private String price;
	
	public PriceInfo(String seat_category, String customer_name, String seat_num, String price) {
		this.seat_category = seat_category;
		this.customer_name = customer_name;
		this.seat_num = seat_num;
		this.price = price;
	}

	@Override
	public String toString() {
		return "PriceInfo [seat_category=" + seat_category + ", customer_name=" + customer_name + ", seat_num="
				+ seat_num + ", price=" + price + "]";
	}
	
	
	
	

}
