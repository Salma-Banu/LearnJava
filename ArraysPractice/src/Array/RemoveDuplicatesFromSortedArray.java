package Array;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int temp = 1; // Start from 1 since the first element is always unique
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) { // Compare with the previous element
                nums[temp] = nums[i]; // Move the unique element forward
                temp++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums;
        int n;

        System.out.println("Enter the size of n:");
        n = sc.nextInt();
        nums = new int[n];

        // Take input values from the user
        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Create an instance of RemoveDuplicatesFromSortedArray
        RemoveDuplicatesFromSortedArray rd = new RemoveDuplicatesFromSortedArray();
        int newLength = rd.removeDuplicates(nums);

        // Print the array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
