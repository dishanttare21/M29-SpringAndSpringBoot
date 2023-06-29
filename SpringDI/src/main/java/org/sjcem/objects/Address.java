package org.sjcem.objects;

public class Address {
	
	//private data members
	private String city ="Mumbai";
	private String area ="Borivali";
	private long pincode = 401501;
	
	//getters and setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
	//methods
	public void display() {
		System.out.println("city: "+city+" area: "+area+" pincode: "+pincode);
	}
	
	
}
