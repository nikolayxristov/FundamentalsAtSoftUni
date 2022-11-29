package Methods.exe;

import java.util.Scanner;

public class middleChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] word = scanner.nextLine().toCharArray();

        printMiddleChar(word);
    }

    public static void printMiddleChar(char[] word) {

        if (word.length % 2 == 0) {
            for (int i = 0; i <= word.length / 2 + 1; i++) {
                if (i == word.length / 2 + 1) {
                    System.out.println(word[i - 2] + "" + word[i - 1]);
                }
            }
        } else {
            for (int i = 0; i <= word.length / 2 + 1; i++) {
                if (i == word.length / 2 + 1) {
                    System.out.println(word[i - 1]);
                }
            }
        }
    }
}
