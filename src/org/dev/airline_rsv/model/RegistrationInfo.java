package org.dev.airline_rsv.model;

public class RegistrationInfo {
	private String firstName;
	private String lastName;
	private String address;
	private String tlf;
	private String city;
	private String state;
	private String gender;
	private String email;
	private String id;
	private String costumer_id;
	
	public RegistrationInfo(String firstName, String lastName, String address, String tlf, String city, String state,
			String gender, String email, String id, String costumer_id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.tlf = tlf;
		this.city = city;
		this.state = state;
		this.gender = gender;
		this.email = email;
		this.id = id;
		this.costumer_id = costumer_id;
	}

	@Override
	public String toString() {
		return "RegistrationInfo [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", tlf="
				+ tlf + ", city=" + city + ", state=" + state + ", gender=" + gender + ", email=" + email + ", id=" + id
				+ ", costumer_id=" + costumer_id + "]";
	}

		

}
