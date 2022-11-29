package Methods.exe;

import java.util.Scanner;

public class topNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int idx = 1; idx <= Integer.parseInt(input); idx++) {
            if (isDivisibleByEight(idx) && hasOddDigit(idx)) {
                System.out.println(idx);
            }
        }
    }

    public static boolean isDivisibleByEight(int idx) {

        int sum = 0;
        String input = String.valueOf(idx);
        char[] symbolArr = input.toCharArray();

        for (char symbol : symbolArr) {
            sum += Integer.parseInt(String.valueOf(symbol));
        }

        return sum % 8 == 0;

    }

    public static boolean hasOddDigit(int idx) {

        String input = String.valueOf(idx);
        char[] digitArr = input.toCharArray();

        for (char digit : digitArr) {
            int figure = Integer.parseInt(String.valueOf(digit));

            if (figure % 2 != 0) {
                return true;
            }
        }

        return false;
    }

}
