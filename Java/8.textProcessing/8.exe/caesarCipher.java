package TextProcessing.exe;

import java.util.Scanner;

public class caesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] symbolArr = input.toCharArray();

        StringBuilder output = new StringBuilder();

        for (char symbol : symbolArr) {

            char currentChar = (char) (symbol + 3);
            output.append(currentChar);

        }

        System.out.println(output);

    }
}
