package Arrays.exe;

import java.util.Scanner;
import java.util.Arrays;

public class equalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        boolean idxExist = false;

        for (int i = 0; i < inputArr.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;
            int counter = i;
            while (true) {
                if (counter == 0) {
                    counter = i;
                    break;
                }
                leftSum += inputArr[counter - 1];
                counter--;
            }
            while (true) {
                if (counter == inputArr.length - 1) {
                    break;
                }
                rightSum += inputArr[counter + 1];
                counter++;
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                idxExist = true;
            }
        }
        if (inputArr.length == 1) {
            System.out.println("0");
        } else if (!idxExist) {
            System.out.println("no");
        }
    }
}
