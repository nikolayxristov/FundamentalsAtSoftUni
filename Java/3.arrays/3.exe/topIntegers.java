package Arrays.exe;

import java.util.Scanner;
import java.util.Arrays;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i] < inputArr[j]) {
                    break;
                }
                if (j == inputArr.length - 1) {
                    System.out.print(inputArr[i] + " ");
                }
            }
        }
        System.out.print(inputArr[inputArr.length - 1]);
    }
}
