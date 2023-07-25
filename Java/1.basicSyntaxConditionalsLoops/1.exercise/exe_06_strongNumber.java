package syntaxConditionalsLoops.exe;

import java.util.Scanner;

public class exe_06_strongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int base = num;
        int result = 0;

        while (base % 10 >= 1 ) {
            int sum = base % 10;

            for (int i = base % 10; i > 1 ; i--) {
                sum *= i - 1;
            }
            result += sum;
            base /= 10;
        }
        if (result == num) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}
