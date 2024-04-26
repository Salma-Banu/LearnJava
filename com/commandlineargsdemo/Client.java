package com.commandlineargsdemo;

public class Client {

	
	//accept a number as command line argument and display 
	//whether it is even or odd
	public static void main(String[] args) {
		//check whether arguments are passed		
		if(args.length==0)
		{
			System.out.println("No args passed");
		}
		else
		{
			//args array will store all values in string format
			//so typecase it based on requirements
			int num= Integer.parseInt(args[0]);
			//check whether even or odd
			if(num%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}

	}

}
