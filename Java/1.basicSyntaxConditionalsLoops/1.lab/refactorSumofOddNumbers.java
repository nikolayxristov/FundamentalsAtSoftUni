package a.syntaxConditionsLoops;

import java.util.Scanner;

public class refactorSumofOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("%d%n",2 * i + 1);
            sum += 2 * i + 1;
        }
        System.out.printf("Sum: %d", sum);

    }
}
