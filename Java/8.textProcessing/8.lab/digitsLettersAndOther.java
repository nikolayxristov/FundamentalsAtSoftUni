package TextProcessing.lab;

import java.util.Scanner;

public class digitsLettersAndOther {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] symbolArr = scanner.nextLine().toCharArray();
        StringBuilder digitSB = new StringBuilder();
        StringBuilder letterSB = new StringBuilder();
        StringBuilder specialSB = new StringBuilder();

        for (char symbol : symbolArr) {

            if (Character.isDigit(symbol)) {

                digitSB.append(symbol);

            } else if (Character.isLetter(symbol)) {

                letterSB.append(symbol);

            } else {

                specialSB.append(symbol);

            }
        }

        System.out.println(digitSB);
        System.out.println(letterSB);
        System.out.println(specialSB);

    }

}
