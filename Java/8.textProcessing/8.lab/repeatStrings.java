package TextProcessing.lab;

import java.util.Scanner;

public class repeatStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] wordArr = scanner.nextLine().split(" ");
        String output = "";

        for (String word : wordArr) {
            char[] symbolArr = word.toCharArray();

            for (int count = 0; count < symbolArr.length; count++) {
                System.out.print(output.concat(word));
            }

        }

    }

}
