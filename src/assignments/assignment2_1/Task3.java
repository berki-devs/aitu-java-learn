package assignments.assignment2_1;

public class Task3 {
	public static int[] array = new int[]{-1, 2, 3, -4, -5};

	public static void main(String[] args) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				array[i] = -array[i];
			}
		}

		for (int i : array) {
			System.out.println(i);
		}
	}
}
