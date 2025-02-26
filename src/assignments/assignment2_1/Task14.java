package assignments.assignment2_1;

import java.util.Scanner;

public class Task14 {
	public static int[][] array = new int[3][3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		int[] rowSums = new int[3];
		int[] colSums = new int[3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				rowSums[i] += array[i][j];
				colSums[j] += array[i][j];
			}
		}

		int min = rowSums[0];
		for (int i = 1; i < rowSums.length; i++) {
			if (rowSums[i] < min) {
				min = rowSums[i];
			}
		}
		for (int j = 0; j < colSums.length; j++) {
			if (colSums[j] < min) {
				min = colSums[j];
			}
		}

		System.out.println(min);
	}
}
