package assignments.assignment2_1;

import java.util.Scanner;

public class Task10 {
	public static int[][] multiArray;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		multiArray = new int[n][];

		for (int i = 0; i < n; i++) {
			int size = sc.nextInt();
			multiArray[i] = new int[size];
		}
	}
}
