package com.containmentdemo;

public class Address {
	
	private String city;
	private String pincode;
	
	public Address(String city,String pincode)
	{
		this.city=city;
		this.pincode=pincode;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "City- "+this.city+" Pincode-"+this.pincode;
	}

}
