package Methods.exe;

import java.util.Scanner;

public class palindromeIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("END")) {
                break;
            }

            if (isPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        }

    }

    public static boolean isPalindrome(String input) {

        char[] symbolArr = input.toCharArray();
        StringBuilder backwardsNum = new StringBuilder();

        for (int i = symbolArr.length - 1; i >= 0; i--) {
            backwardsNum.append(symbolArr[i]);
        }

        String result = backwardsNum.toString();

        if (result.equals(input)) {
            return true;
        } else {
            return false;
        }

    }

}
