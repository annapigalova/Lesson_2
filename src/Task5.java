import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 1;
		float var;
		float sumResult = 0;
		
		while (i < 5) {
			System.out.println("Enter the number #" + i);
			var = processInput(scanner);
			sumResult += var;
			i++;
		}
		System.out.print("SumResult: " + sumResult);
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
}
