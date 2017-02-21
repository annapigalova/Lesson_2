import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int i = amountInput(scanner);
		calcProcess(i, scanner);

	}

	private static int amountInput(Scanner scanner) {

		int i = 0;
		boolean isInputOK = false;

		System.out.println("Enter amount of numbers: ");

		while (!isInputOK) {
			if (scanner.hasNextInt()) {
				i = scanner.nextInt();
				if (i > 0) {
					isInputOK = true;
				} else {
					System.out.println("Enter positive number! ");
				}
			} else {
				System.out.println("Incorrect number! Try again: ");
				scanner.next();
			}
		}

		return i;

	}

	private static void calcProcess(float i, Scanner scanner) {
		float x = 0, a = 0, b = 0;
		boolean isInputOK = false;

		while (!isInputOK | i > 0) {
			System.out.println("Enter the number: ");
			if (scanner.hasNextFloat()) {
				x = (int) scanner.nextFloat();
				isInputOK = true;
			} else {
				System.out.println("Incorrect number! Try again: ");
				scanner.next();
			}

			if (x % 2 == 0) {
				a = a + 1;
			}
			if (x > 15) {
				b = b + 1;

			}
			i = i - 1;
		}

		System.out.println("\n" + "Even numbers: " + a + "\n" + "# > 15: " + b);
	}
}