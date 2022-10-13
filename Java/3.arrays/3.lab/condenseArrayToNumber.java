import java.util.Scanner;
import java.util.Arrays;

public class condenseArrayToNumber {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(e -> Integer.parseInt(e))
			.toArray();
		
		if (inputArr.length == 1) {
			
			System.out.println(inputArr[0]);
		
		} else {
			
			int sum = 0;
			
			for (int i = 1; i < inputArr.length; i++) {
				
				sum += inputArr[i - 1] + inputArr[i];
			}

			System.out.println(sum);
		}
	}
}
