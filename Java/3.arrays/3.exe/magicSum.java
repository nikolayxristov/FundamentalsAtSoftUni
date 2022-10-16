package Arrays.exe;

import java.util.Scanner;
import java.util.Arrays;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(c -> Integer.parseInt(c))
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {

                if (inputArr[i] + inputArr[j] == n) {
                    System.out.println(inputArr[i] + " " + inputArr[j]);
                }
            }
        }
    }
}
