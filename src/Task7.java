import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float a, b, c, result;

		System.out.println("Enter A: ");
		a = processInput(scanner);

		System.out.println("Enter B: ");
		b = processInput(scanner);

		if (a > b) {
			System.out.println("Enter C: ");
			c = processInput(scanner);
			result = b + c;
			System.out.println("Result: " + result);
		} else if (a < b) {
			System.out.println("Enter C: ");
			c = processInput(scanner);
			result = a + b + c;
			System.out.println("Result: " + result + "\n" + "New Year!");
		} else {
			System.out.println("The End!");
		}

	}

	private static float processInput(Scanner scanner) {
		boolean isInputOK = false;
		float x = 0;

		while (!isInputOK) {
			if (scanner.hasNextFloat()) {
				x = scanner.nextFloat();
				isInputOK = true;

			} else {
				System.out.println("Incorrect nuber! Try again: ");
				scanner.next();
			}

		}
		return x;

	}
}
