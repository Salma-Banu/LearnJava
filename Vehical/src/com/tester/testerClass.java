package com.tester;

import java.util.Scanner;
import static com.VehicalValidation.VehicalValidateRule.findByName;
import com.CustomException.ColorNotFoundException;

public class testerClass {
	
	public static void main(String[] args) throws ColorNotFoundException
	{
//		try {
//		Scanner sc=new Scanner(System.in);
//		System.out.println(findByName(sc.next()));
//		}
//		catch (ColorNotFoundException e) {
//			// TODO: handle exception
//			throw new ColorNotFoundException("color not found");
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println(findByName(sc.next()));
		
		
	}

}
