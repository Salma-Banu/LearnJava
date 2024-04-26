package com.containmentdemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		Address addr1=new Address("Pune", "411018");
		Courier c1=new Courier(1, "Max", addr1);
		System.out.println(c1);
		
		Courier c2=new Courier(2, "John", new Address("Mumbai","411001"));
		System.out.println(c2);
	}

}
