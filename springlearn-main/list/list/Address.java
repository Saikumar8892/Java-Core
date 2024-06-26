package com.mphasis.list;

public class Address {
	  private int houseNo;
	  private String street;
	  private String city;
	  
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "\nAddress [houseNo=" + houseNo + ", street=" + street + ", city=" + city + "]";
	}
}
