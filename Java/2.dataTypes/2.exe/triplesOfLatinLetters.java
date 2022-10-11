package DataTypes.Exe;

import java.util.Scanner;

public class triplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int letters = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < letters; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < letters; j++) {
                char secondChar = (char) ('a' + j);
                for (int k = 0; k < letters; k++){
                    char thirdChar = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);
                }
            }
        }
    }
}
