import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first side: ");
		float a = processInput(scanner);

		System.out.print("Enter the second side: ");
		float b = processInput(scanner);

		System.out.println("You entered " + a + ", " + b);

		triangleCalc(a, b);

	}

	private static float processInput(Scanner scanner) {
		float lengthSide = -1;
		boolean isInputOK = false;

		while (!isInputOK) {
			if (scanner.hasNextFloat()) {
				lengthSide = scanner.nextFloat();

				if (lengthSide < 0) {
					System.out.println("Enter a positive number!!! ");
				} else {
					isInputOK = true;
				}
			} else {
				System.out.println("That's not a number! Try again:");
				scanner.next();
			}
		}

		return lengthSide;
	}

	private static void triangleCalc(float a, float b) {
		double hypotenuse;
		double square;

		hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		square = a * b / 2;

		System.out.println("Hypotenuse: " + hypotenuse + "\n" + "Triangle Square: " + square);

	}
}
