package syntaxConditionalsLoops;

import java.util.Scanner;

public class l_10_multiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer. parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", num, i, num * i);
        }

    }

}
