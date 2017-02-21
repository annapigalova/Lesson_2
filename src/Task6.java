
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		float a, b, c;
		double result;

		System.out.println("Enter A: ");
		a = processInput(scanner);

		System.out.println("Enter B: ");
		b = processInput(scanner);

		System.out.println("Enter C: ");
		c = processInput(scanner);

		result = Math.pow(a, 2) - Math.pow((b - c), 2) + Math.log(Math.pow(b, 2) + 1);

		System.out.println("Result: " + result);

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
