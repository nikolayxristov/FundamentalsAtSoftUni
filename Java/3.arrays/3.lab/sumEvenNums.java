import java.util.Scanner;
import java.util.Arrays;

public class sumEvenNums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		
		int evenSum = 0;
		
		for (int element : numsArr) {
			if (element % 2 == 0) {
				evenSum += element;	
			}
		}
		
		System.out.println(evenSum);	
	}
}
