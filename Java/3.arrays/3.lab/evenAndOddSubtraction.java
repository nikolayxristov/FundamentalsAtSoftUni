import java.util.Scanner;
import java.util.Arrays;

public class evenAndOddSubtraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(e -> Integer.parseInt(e))
			.toArray();
		
		int evenSum = 0;
	       
		int oddSum = 0;

		for (int element : inputArr) {
			if (element % 2 == 0) {
				evenSum += element;
			} else {
				oddSum += element;
			}
		}

		System.out.println(evenSum - oddSum);
	}
}
