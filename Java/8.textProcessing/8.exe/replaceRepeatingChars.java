package TextProcessing.exe;

import java.util.List;
import java.util.Scanner;

public class replaceRepeatingChars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char[] symbolArr = input.toCharArray();

        StringBuilder filteredOutput = new StringBuilder();

        for (int i = 0; i < symbolArr.length - 1; i++) {

            if (symbolArr[i] != symbolArr[i + 1]) {
                filteredOutput.append(symbolArr[i]);
            }

        }

        filteredOutput.append(symbolArr[symbolArr.length - 1]);

        System.out.println(filteredOutput);

    }

}
