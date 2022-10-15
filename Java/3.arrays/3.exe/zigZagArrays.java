package Arrays.exe;

import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        int counter = 1;

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");

            if (counter % 2 == 0) {

                firstArr[i] = input[1];
                secondArr[i] = input[0];
            } else {
                firstArr[i] = input[0];
                secondArr[i] = input[1];
            }

            counter++;
        }

        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));

    }
}
