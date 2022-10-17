package Arrays.exe;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            } else if (input.contains("swap")) {
                int firstSwapIdx = Integer.parseInt(input.split(" ")[1]);
                int secondSwapIdx = Integer.parseInt(input.split(" ")[2]);
                int idxHolder = inputArr[firstSwapIdx];
                inputArr[firstSwapIdx] = inputArr[secondSwapIdx];
                inputArr[secondSwapIdx] = idxHolder;
            } else if (input.contains("multiply")) {
                int firstMultiplyIdx = Integer.parseInt(input.split(" ")[1]);
                int secondMultiplyIdx = Integer.parseInt(input.split(" ")[2]);
                inputArr[firstMultiplyIdx] *= inputArr[secondMultiplyIdx];
            } else if (input.equals("decrease")) {
                for (int i = 0; i < inputArr.length; i++) {
                    inputArr[i]--;
                }
            }
        }
        for (int j = 0; j < inputArr.length; j++) {
            int currentNum = inputArr[j];
            if (j != inputArr.length - 1) {
                System.out.print(currentNum + ", ");
            } else {
                System.out.print(currentNum);
            }
        }
    }
}
