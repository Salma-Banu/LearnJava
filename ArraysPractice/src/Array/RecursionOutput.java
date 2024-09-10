package Array;

import java.util.Scanner;

public class RecursionOutput {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		pzz(n);
		
	}

	public static void pzz(int n) {
		if(n==0) {
			return ;
			
		}
	System.out.print("Pre"+n);
	pzz(n-1);
	System.out.print("in"+n);
	pzz(n-1);
	System.out.print("post"+n);
		
		
	}

}
	
