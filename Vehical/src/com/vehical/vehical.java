package com.vehical;
 
import java.util.Date;

import com.enumd.color;

public class vehical {
//	Add non static fields -- chasisNo (string) : Unique ID , 
//	color : enum Color(WHITE , SILVER , BLACK , RED , BLUE) , 
//	price , manufactureDate: Date , insuranceExpDate : Date  , pollutionLevel : double
	private String chasisNo;
	private String UniqueId;
	private double price;
	private Date mfgdate;
	private  Date insexpdate;
	private double pollutionlevel;
	private color cr;
	
	public vehical(String chasisNo,String UniqueId, double price,Date mfgdate,Date insexpdate, double pollutionlevel,color cr)
	{
		this.chasisNo=chasisNo;
		this.UniqueId=UniqueId;
		this.price=price;
		this.mfgdate=mfgdate;
		this.insexpdate=insexpdate;
		this.pollutionlevel=pollutionlevel;
		this.cr=cr;
		
	
	}
	
	
}
