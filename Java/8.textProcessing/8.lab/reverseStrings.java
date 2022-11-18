package TextProcessing.lab;


import java.util.Scanner;

public class reverseStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String word = scanner.nextLine();

            if (word.equals("end")) {
                break;
            }

            char[] charsArr = word.toCharArray();
            String wordBackwards = "";

            for (int i = charsArr.length - 1; i >= 0; i--) {
                wordBackwards += charsArr[i];
            }

            System.out.printf("%s = %s%n", word, wordBackwards);

        }
    }
}
