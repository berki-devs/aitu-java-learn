//import java.util.Scanner;

// Assignment 1.1

//public class Main {
//	public static void main(String[] args) {
//		String name = "Erdaulet";
//		int age = 17;
//		String city = "Astana";
//
//		System.out.println(name + " " + age + " " + city);
//
//		int a = 5;
//		int b = 10;
//
//		System.out.println(a + b);
//
//		int year = 3126;
//		int born = 8;
//		int yearOfBirth = year - born;
//
//		System.out.println(yearOfBirth);
//
//		String word = "Hello";
//		String phrase = "Hello, World!";
//		String line = "Hello, World! I am Erdaulet";
//		String text = "Hello, World! I am Erdaulet. I am 17 years old. I am from Astana";
//
//		System.out.println(word + phrase + line + text);
//	}
//}


// Assignment 1.2

//public class Main {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		int temperature = scanner.nextInt();
//
//		if (temperature >= 0) {
//			System.out.println("it’s warm outside.");
//		} else {
//			System.out.println("it’s cold outside.");
//		}
//
//		String name = scanner.nextLine();
//		int age = scanner.nextInt();
//
//		if (age >= 18 && age <= 28) {
//			System.out.println(name + ", come to the military registration and enlistment office");
//		}
//
//		int bodyTemp = scanner.nextInt();
//		boolean isHigh = bodyTemp > 36;
//		boolean isLow = bodyTemp < 36;
//
//		if (isLow) {
//			System.out.println("is Low");
//		} else if (isHigh) {
//			System.out.print("is High");
//		}
//
//		int age = scanner.nextInt();
//
//		if (!(age >= 20 && age <= 60)) {
//			System.out.println("you don’t have to work.");
//		}
//
//		String quote = "I will never work for pennies.";
//		int i = 0;
//		while (i < 100) {
//			System.out.println(quote);
//			i++;
//		}
//
//		boolean continuous = true;
//		int integer;
//		int sum = 0;
//
//		while (continuous) {
//			if (scanner.hasNextInt()) {
//				integer = scanner.nextInt();
//				sum += integer;
//			} else if (scanner.hasNext("ENTER")) {
//				continuous = false;
//			}
//		}
//		System.out.println(sum);
//
//		int i = 0;
//		while (i < 5) {
//			int j = 1;
//			while (j < 10) {
//				System.out.print('Q');
//				j++;
//			}
//			System.out.println('Q');
//			i++;
//		}
//
//		int n = 0;
//		while (n < 100) {
//			if (!(n % 3 == 0)) {
//				System.out.println(n);
//			}
//			n++;
//		}
//
//		for (int i = 1; i <= 15; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
//
//		int start = scanner.nextInt();
//		int end = scanner.nextInt();
//		int multiple = scanner.nextInt();
//		int sum = 0;
//
//		for (; start <= end - 1; start++) {
//			if (start % multiple == 0) {
//				sum += start;
//			}
//		}
//		System.out.println(sum);
//
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(8);
//			}
//			System.out.println(8);
//		}
//
//	}
//
//}