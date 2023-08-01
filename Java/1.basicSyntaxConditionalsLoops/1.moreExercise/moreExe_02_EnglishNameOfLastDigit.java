package syntaxConditionalsLoops.moreExe;

import java.util.Scanner;

public class moreExe_02_EnglishNameOfLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(lastDigit(num));
    }

    private static String lastDigit (int num){
        int digit = num % 10;

        switch (digit) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 0:
                return "zero";
            default:
                return "";

        }
    }
}
