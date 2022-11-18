package TextProcessing.lab;

import java.util.Scanner;

public class substring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String symbolsToRemove = scanner.nextLine();
        String word = scanner.nextLine();

        while(word.contains(symbolsToRemove)) {

            word = word.replace(symbolsToRemove, "");

        }

        System.out.println(word);

    }
}
