package assignments.assignment2_1;

import java.util.Objects;
import java.util.Scanner;

public class Task7 {
	public static String[] strings;


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strings = new String[6];

		for (int i = 0; i < 6; i++) {
			strings[i] = sc.nextLine();
		}

		for (int i = 0; i < strings.length; i++) {
			if (strings[i] != null) {
				for (int j = i + 1; j < strings.length; j++) {
					String temp = strings[i];
					if (Objects.equals(temp, strings[j])) {
						strings[i] = null;
						strings[j] = null;
					}
				}
			}
		}

		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + ", ");
		}
	}
}
