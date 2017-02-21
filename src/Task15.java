import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a, b, h;

		System.out.println("Enter a");
		a = enterParam(sc);

		System.out.println("Enter b");
		b = enterParam(sc);

		System.out.println("Enter h");
		h = enterParam(sc);

		calcFunctionPoint(a, b, h);
	}

	private static float enterParam(Scanner sc) {

		boolean isInputOK = false;
		float x = 0;

		while (!isInputOK) {
			if (sc.hasNextFloat()) {
				x = sc.nextFloat();
				isInputOK = true;
			} else {
				System.out.println("That's not a number! Try again:");
				sc.next();
			}
		}
		return x;

	}

	private static void calcFunctionPoint(float a, float b, float h) {
		double f;
		float x = a;
		System.out.println(String.format("%10s%15s", "x", "F(x)"));
		while (x <= b) {
			f = 2 * Math.tan(x / 2) + 1;
			System.out.println(String.format("%10.2f%15.4f", x, f));
			x += h;
		}

	}
}
