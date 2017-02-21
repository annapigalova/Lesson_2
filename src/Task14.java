import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		double[] nums = new double[3];

		System.out.print("Enter numbers (use Enter as separator): ");
		int i = 0;
		while (i < nums.length) {
			if (scanner.hasNextFloat()) {
				nums[i] = scanner.nextFloat();
				i++;
			} else {
				System.out.println("That's not a number! Try again:");
				scanner.next();
			}

		}

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] >= 0) {nums[j] = Math.pow(nums[j], 2);}
			else{nums[j] = Math.pow(nums[j], 4);}
			System.out.println(nums[j]);
		}
		//System.out.println();

	}

}
