package Arrays.exe;

import java.util.Arrays;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] inputArr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int wagon = Integer.parseInt(scanner.nextLine());
            inputArr[i] = wagon;
            sum += wagon;
        }

        for (int j = 0; j < n; j++) {
            int passengers = inputArr[j];
            System.out.print(passengers + " ");
        }

        System.out.printf("%n%d", sum);

    }
}
