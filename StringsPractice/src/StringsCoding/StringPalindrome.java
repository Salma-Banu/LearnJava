package StringsCoding;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check palindrome: ");
		int n=sc.nextInt();
		int temp=n,r;
		int sum=0;
		while(n!=0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not palindrome number");
		}
		
		
		
		
	}

}
