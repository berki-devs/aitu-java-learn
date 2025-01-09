package assignments.assignment2_1;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
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

		if (N % 2 == 0) {
			for (int i = N - 1; i >= 0; i--) {
				System.out.print(numbers[i] + ", ");
			}
		} else {
			for (int i = 0; i < N; i++) {
				System.out.print(numbers[i] + ", ");
			}
		}


	}
}
