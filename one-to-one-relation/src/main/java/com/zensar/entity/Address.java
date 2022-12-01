package com.zensar.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int houseNo;
	private String city;
	private String State;
	private int pincode;

	public Address() {
		super();
	}

	public Address(int houseNo, String city, String state, int pincode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		State = state;
		this.pincode = pincode;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", city=" + city + ", State=" + State + ", pincode=" + pincode + "]";
	}

}
