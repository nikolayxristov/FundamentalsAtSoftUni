package TextProcessing.lab;

import java.util.Scanner;

public class textFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] banArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : banArr) {

            String asterisk = createAsterisk(word);
            text = text.replace(word, asterisk);

        }

        System.out.println(text);

    }

    public static String createAsterisk(String word) {
        String asterisk = "";

        for (int count = 1; count <= word.length(); count++) {
            asterisk = asterisk.concat("*");
        }

        return asterisk;
    }

}
