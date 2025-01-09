package assignments.assignment2_1;

public class Task8 {
	public static int[][] MULTIPLICATION_TABLE = new int[10][10];

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				MULTIPLICATION_TABLE[i][j] = (i + 1) * (j + 1);
			}
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
			}
			System.out.println();
		}
	}
}
