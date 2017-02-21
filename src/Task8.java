import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float a, b, c;
		double exp1, exp2;

		System.out.println("Enter A: ");
		a = processInput(scanner);

		System.out.println("Enter B: ");
		b = processInput(scanner);

		if (a == b) {
			System.out.println("Cкоро Новый Год!");
		} else {
			System.out.println("Enter C ");
			c = processInput(scanner);
			exp1 = a + b + c;
			exp2 = Math.pow(a, 2) + Math.pow(b, 2);
			System.out.println("a + b + c: " + exp1);
			System.out.println("a2 + b2 " + exp2);
			System.out.println("Красно-синие цвета! Мы фанаты ЦСК!");
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
				System.out.println("Incorrect number! Try again: ");
				scanner.next();
			}

		}
		return x;

	}

}
