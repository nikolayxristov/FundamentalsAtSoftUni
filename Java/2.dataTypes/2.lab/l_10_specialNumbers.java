package dataTypes.lab;

import java.util.Scanner;

public class l_10_specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= num; i++) {
            int sum = 0;

            if (i >= 10) {
                int x = i;
                while (x != 0) {
                    sum += x % 10;
                    x /= 10;
                }
            } else {
                sum = i;
            }

            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
        }
    }
}
