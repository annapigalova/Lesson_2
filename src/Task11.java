import java.util.Scanner;

public class Task11 {

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
		int x = 0, a = 0, b = 0;
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

			if (x < 2 | x > 15) {
				a = a + 1;
			}
			if (x%5 == 4) {
				b = b + x;

			}
			
			i = i - 1;
		}

		System.out.println("\n" + "Quantity of Numbers > 15 and < 2: " + a + "\n" + "Sum of numbers with remainder equals to 4: " + b);
	}
}
