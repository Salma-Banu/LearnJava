package Array;

import java.util.Scanner;

public class PrintIndicesOfNoWhoseSumIsDone {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int N = sc.nextInt();
		int[] arr=new int[N];
		int i;
		int sum=0;
		
		System.out.println("Enter the elements of an array: ");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum is:"+sum);
		System.out.println("ReverseElements of an array are: ");
		for(i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	}


