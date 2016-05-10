package ems.com.model;

public class Address {

	String city;
	String state;
	long zipCode;
	String street;
	int addSeqId;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getAddSeqId() {
		return addSeqId;
	}
	public void setAddSeqId(int addSeqId) {
		this.addSeqId = addSeqId;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + ", street=" + street + ", addSeqId=" + addSeqId
				+ "]";
	}
	
	
}
