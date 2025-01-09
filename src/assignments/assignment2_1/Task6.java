package assignments.assignment2_1;

import java.util.Arrays;
import java.util.Scanner;

// TODO: fix some issues in this code

public class Task6 {
	public static int[] array;

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		int N;
		do {
			while (!scanner.hasNextInt()) {
				System.out.println("N must be an integer");
				scanner.next();
			}
			N = scanner.nextInt();
		} while (N <= 0);

		int[] numbers = new int[N];

		for (int i = 0; i < N; i++) {
			while (!scanner.hasNextInt()) {
				System.out.println("Please enter an integer");
				scanner.next();
			}
			numbers[i] = scanner.nextInt();
		}

		System.out.println(Arrays.stream(numbers).max());
	}
}
