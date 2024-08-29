package StringsCoding;

import java.util.HashSet;

public class FindDuplicates {
//	public static void main(String[] args) {
//		//write a java program to find duplicates
//		int[] arr= {1,2,1,3,4,2,5,1,2};
//		int count =0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					//System.out.println(arr[i]);//it will give only 
//											//duplicates who are of number two not more than that
//				//so for this we are taking count number to calculate duplicat who are suppose
//					//like 3 (1,1,1) 
//				
//				count++;
//				}
//			
//			if(count==1) {
//				System.out.println(arr[i]);
//				count=0;
//			}
//			}
//		}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1, 3, 4,2, 2, 5, 1, 2, 2,4};
		HashSet<Integer> duplicates = new HashSet<>();
		HashSet<Integer> seen = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (seen.contains(arr[i])) {
				duplicates.add(arr[i]);
			} else {
				seen.add(arr[i]);
			}
		}

		System.out.println("Duplicate elements: " + duplicates);
	}
}
