package syntaxConditionalsLoops.moreExe;

import java.util.Scanner;

public class moreExe_04_reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
}
