package Searching;

import java.util.Scanner;

public class MissingNumber {

    // Function to find the missing number in the array
    public static int missingNum(int[] nums) {
    	int n=nums.length;
       
    	// Calculate the sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the sum of elements in the array
        int actualSum = 0;
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }
        
        // The missing number is the difference between expected and actual sums
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Get the size of the array from user input
            System.out.print("Enter the value of n (size of the array): ");
            int n = sc.nextInt();

            // Create an array with size n-1 (since one number is missing)
            int[] nums = new int[n - 1];

            System.out.println("Enter " + (n - 1) + " numbers:");
            for (int i = 0; i < n - 1; i++) {
                nums[i] = sc.nextInt();
            }

            // Find the missing number
            int missing = missingNum(nums);
            System.out.println("The missing number is: " + missing);
        }
    }
}
