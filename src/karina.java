import java.util.Scanner;

public class karina {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		double temperature = scanner.nextDouble();


		boolean isHigh;
		boolean isLow;


		isHigh = temperature > 36.6;
		isLow = temperature <= 36.6;


		if (isHigh) {
			System.out.println("The body temperature is high.");
		} else if (isLow) {
			System.out.println("The body temperature is low.");
		}
	}

}
