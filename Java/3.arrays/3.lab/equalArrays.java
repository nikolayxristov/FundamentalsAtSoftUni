import java.util.Scanner;
import java.util.Arrays;

public class equalArrays {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(e -> Integer.parseInt(e))
			.toArray();

		int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(e -> Integer.parseInt(e))
			.toArray();

		int sum = 0;

		for (int i = 0; i < firstArr.length; i++) {
			
			if (firstArr[i] == secondArr[i]) {
				
				sum += firstArr[i];
				
			} else {
				
				System.out.printf("Arrays are not identical. Found difference at %d index.", i);
				
				break;
			}

			if (i == firstArr.length - 1) {
				System.out.printf("Arrays are identical. Sum: %d", sum);
			}
		}
	}
}
