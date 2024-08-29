package Array;

import java.util.Scanner;

public class RemoveGivenValueAndReturnNoOfElementsINArray {
	
	public void removeelement(int[] nums,int value) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=value) {
				nums[count]=nums[i];
				count++;
			}
		}
		 System.out.println("The count of after removing elements is:"+count);
				
	
	 System.out.println("Array after removal:");
     for (int i = 0; i < count; i++) {
         System.out.print(nums[i] + " ");
     }
}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size of an array");
		 int n=sc.nextInt();
			int count=0;
		 int[] nums=new int[n];
		 
		 System.out.println("Enter the elements of Array:");
		 for(int i=0;i<nums.length;i++) {
			 nums[i]=sc.nextInt();
		 }
		  System.out.println("Enter the value to remove:");
	        int value = sc.nextInt();
	 
	        RemoveGivenValueAndReturnNoOfElementsINArray re = new RemoveGivenValueAndReturnNoOfElementsINArray();
	        re.removeelement(nums, value);
	    }
		}

	


