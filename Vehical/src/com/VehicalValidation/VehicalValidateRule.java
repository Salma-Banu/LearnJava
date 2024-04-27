package com.VehicalValidation;

import com.CustomException.ColorNotFoundException;
import com.enumd.color;

public class VehicalValidateRule 
{
public static final color cr = null;
//public static final double MAX_POL;
static {
	
}
	public static color findByName(String name) throws ColorNotFoundException
	
	{
		 for(color c:color.values()) {
			 if(c.name().equalsIgnoreCase(name))
			 {
				 return c;
			 }

				
		 }
	    throw new ColorNotFoundException("color not found");
	}
	
}
