import java.util.Scanner;

public class printNumsInReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int[] numsArr = new int[n];
		for (int i = 0; i < n; i++) {
			numsArr[i] = Integer.parseInt(scanner.nextLine());	
		}
		
		for (int j = numsArr.length - 1; j >= 0; j--) {
			System.out.print(numsArr[j] + " ");
		}
	}
}
