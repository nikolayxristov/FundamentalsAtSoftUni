package a.syntaxConditionsLoops;

import java.util.Scanner;

public class sumOfOddNubers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        int sum = 1;
        int num = 1;
        System.out.println(1);

        for (int i = 1; i < n; i += 1) {
            num += 2;
            System.out.println(num);
            sum += num;
        }

        System.out.printf("Sum: %d", sum);
    }
}
