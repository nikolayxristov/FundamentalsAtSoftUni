package TextProcessing.exe;

import java.util.Scanner;

public class stringExplosion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();
        int skip = 0;
        char[] inputArr = input.toCharArray();

        for (int i = 0; i < inputArr.length - 1; i++) {

            char symbol = inputArr[i];

            if (symbol == '>') {

                output.append(symbol);
                String addSkips = Character.toString(inputArr[i + 1]);
                skip += Integer.parseInt(addSkips);

            } else {
                if (skip > 0) {
                    skip -= 1;
                } else {
                    output.append(symbol);
                }
            }
        }

        output.append(inputArr[inputArr.length - 1]);

        System.out.println(output);

    }

}
