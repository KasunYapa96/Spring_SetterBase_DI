package com.hcl.beans;

public class Address {
	
	String lane1;
	String city;
	String pin;
	
	public Address() {}

	public String getLane1() {
		return lane1;
	}

	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
	@Override
	public String toString() {

		return lane1 +"\t"+city+"\t"+pin;
	}

}
