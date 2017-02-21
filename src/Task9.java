import java.util.Scanner;

public class Task9 {

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

	private static void calcProcess(int i, Scanner scanner) {
		int x = 0, a = 0, b = 0, c = 0;
		boolean isInputOK = false;

		while (!isInputOK | i > 0) {
			System.out.println("Enter the number: ");
			if (scanner.hasNextInt()) {
				x = scanner.nextInt();
				isInputOK = true;
			} else {
				System.out.println("Incorrect number! Try again: ");
				scanner.next();
			}

			if (x % 2 == 0) {
				a = a + 1;
			}
			if (x % 3 == 0) {
				b = b + x;

			}
			if (Math.abs(x) < 3) {
				c = c + 1;
			}
			i = i - 1;
		}

		System.out.println("\n" + "Amount of Even numbers: " + a + "\n" + "Sum of numbers multiple 3: " + b + "\n"
				+ "Mod < 3: " + c);
	}
}
