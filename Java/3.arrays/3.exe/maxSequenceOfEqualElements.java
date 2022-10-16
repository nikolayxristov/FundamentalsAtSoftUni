package Arrays.exe;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        int topCounter = 1;
        int topIdx = 0;

        for (int i = 0; i < inputArr.length - 1; i++) {
            int counter = 1;
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i].equals(inputArr[j])) {
                    counter++;
                } else {
                    break;
                }
            }
            if (counter > topCounter) {
                topCounter = counter;
                topIdx = i;
            }
        }
        String[] topArr = new String[topCounter];
        Arrays.fill(topArr, inputArr[topIdx]);
        System.out.println(String.join(" ", topArr));
}
}
