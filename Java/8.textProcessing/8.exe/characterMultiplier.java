package TextProcessing.exe;

import java.util.Scanner;

public class characterMultiplier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        char[] firstWord = inputArr[0].toCharArray();
        char[] secondWord = inputArr[1].toCharArray();
        int sum = 0;

        if (firstWord.length > secondWord.length) {

            for (int i = 0; i < firstWord.length; i++) {

                sum += firstWord[i] * secondWord[i];

                if (i == secondWord.length - 1) {

                    for (int j = i + 1; j < firstWord.length; j++) {

                        sum += firstWord[j];

                    }
                    break;
                }
            }

        } else if (secondWord.length > firstWord.length){

            for (int i = 0; i < secondWord.length; i++) {

                sum += firstWord[i] * secondWord[i];

                if (i == firstWord.length - 1) {

                    for (int j = i + 1; j < secondWord.length; j++) {

                        sum += secondWord[j];

                    }
                    break;

                }
            }
        } else {

            for (int i = 0; i < firstWord.length; i++) {

                sum += firstWord[i] * secondWord[i];

            }

        }

        System.out.println(sum);

    }
}
