package com.containmentdemo;

public class Courier {
	
	private int cid;
	private String name;
	private Address caddress;
	
	public Courier(int cid,String name,Address caddress)
	{
		this.cid=cid;
		this.name=name;
		this.caddress=caddress;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cid- "+this.cid
				+" Name-"+this.name
				+caddress.toString();
	}
}
