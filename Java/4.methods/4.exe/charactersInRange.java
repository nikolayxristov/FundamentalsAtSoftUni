package Methods.exe;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startChar = scanner.nextLine().charAt(0);
        char endChar = scanner.nextLine().charAt(0);

        printChars(startChar, endChar);


    }

    public static void printChars(char symbol1, char symbol2) {

        if (symbol1 < symbol2) {
            for (int i = symbol1; i < symbol2; i++) {

                if (i == symbol1) {
                    continue;
                }
                System.out.printf("%c ", i);
            }
        } else {
            for (int i = symbol2; i < symbol1; i++) {

                if (i == symbol2) {
                    continue;
                }
                System.out.printf("%c ", i);
            }
        }
    }
}
