package assignments.assignment2_1;

import java.util.Scanner;

public class Task16 {
	public static char[][] array;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		array = new char[height][2 * height - 1];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = ' ';
			}

			for (int j = height - 1 - i; j <= height - 1 + i; j++) {
				array[i][j] = '#';
			}
		}

		for (int i = 0; i < height; i++) {
			System.out.println(array[i]);
		}
	}
}
