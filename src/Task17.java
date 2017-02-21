import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float x = processInput(scanner);
		calcFunction(x);

	}

	private static float processInput(Scanner scanner) {

		boolean isInputOK = false;
		float x = 0;
		System.out.print("Enter x: ");
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

	private static void calcFunction(float x) {
		double f;

		if (x <= -3) {
			f = 9;
			System.out.println("F(x) = " + f);
		} else if (x > 3) {
			f = 1 / (Math.pow(x, 2) + 1);
			System.out.println("F(x) = " + f);
		} else {
			System.out.println("Not define");
		}

	}

}
