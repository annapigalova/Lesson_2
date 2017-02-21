import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		float a = processInput(scanner);

		System.out.print("Enter b: ");
		float b = processInput(scanner);

		System.out.print("Enter c: ");
		float c = processInput(scanner);

		System.out.print("Enter d: ");
		float d = processInput(scanner);
		
		pointA(a, b, c);
		pointB(a, b, c, d);
	}

	private static float processInput(Scanner scanner) {

		boolean isInputOK = false;
		float x = 0;

		while (!isInputOK) {
			if (scanner.hasNextFloat()) {
				x = scanner.nextFloat();

				isInputOK = true;
			} else {
				System.out.println("That's not a number! Try again:");
				scanner.next();
			}
		}
		return x;
	}

	private static void pointA(float a, float b, float c) {
		double result;

		result = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;

		System.out.println("a)" + result);

	}

	private static void pointB(float a, float b, float c, float d) {
		double result;

		result = (a * b) / (c * d) - (a * b - c) / (c * d);

		System.out.println("b)" + result);

	}
}
