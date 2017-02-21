public class Task12 {

	public static void main(String[] args) {

		System.out.println("Massive length " + args.length);
		if (args.length <= 0) {
			System.out.println("No arguments");
			return;
		}

		int arg;
		int totalSum = 0;

		for (int j = 0; j < args.length; j++) {

			try {
				arg = Integer.parseInt(args[j]);
				totalSum = totalSum + arg;
			} catch (NumberFormatException e) {
				System.err.println("Argument" + args[j] + " must be an integer.");
				System.exit(1);
			}

		}

		System.out.println("TotalSum: " + totalSum);
	}

}
