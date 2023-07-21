package syntaxConditionalsLoops;

import java.util.Scanner;

public class l_09_sumOfOddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 1;
        int sum = 1;

        System.out.println(1);

        for (int i = 1; i < n; i++) {
            num += 2;
            sum += num;
            System.out.println(num);
        }

        System.out.println("Sum: " + sum);

    }

}
