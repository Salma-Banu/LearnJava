package Searching;

import java.util.Scanner;

public class LargestelementInAnArray {
	public static int largestelement(int[] arr) {

		// to find largest element in a given array
		int temp = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > temp) {// for input 1,12,3,20,2 i=0 1>1 i=1 12>1 
				temp = arr[i];
			}
		
		}
	
		return temp;
		}
	

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of an array: ");
			int n = sc.nextInt();
			int[] arr = new int[n];

			// to take input(elements) of array from console(user)
			System.out.println("Enter the elements of an array: ");
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}

			System.out.println("The array elements are: ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");

			}
			System.out.println();
			// finding largest elemnts
			int num = largestelement(arr);
			
			System.out.println("The largest element is: " + num);
			
		}

	}

}

