package a.syntaxConditionsLoopsExe;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());
        int base = num;
        int sum = 0;

        while (num > 0) {

            int element = num % 10;
            int factorial = 1;

            for (int idx = 1; idx < element; idx++) {
                factorial = factorial * idx;
            }

            sum += factorial;

            num = num / 10;
        }

        if (sum == base) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
