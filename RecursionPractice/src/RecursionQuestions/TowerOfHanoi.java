package RecursionQuestions;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void towerofhanoi(int n, String src, String helper, String dest) {
		if (n == 1) {

			System.out.println("transferdisk " + n + " from " + src + " to " + dest);
			return;
		}
		towerofhanoi(n - 1, src, dest, helper);
		
		System.out.println("transfer disk " + n + " from " + src + " to " + dest);
		towerofhanoi(n - 1, helper, src, dest);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of disks in source: ");
		int n = sc.nextInt();
		towerofhanoi(n, "A", "B", "C");
		sc.close();

	}

}
