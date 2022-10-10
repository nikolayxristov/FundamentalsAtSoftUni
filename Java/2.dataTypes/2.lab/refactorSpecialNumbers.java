package DataTypes.Lab;

import java.util.Scanner;

public class refactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= number; i++) {
            int currentNum = i;
            int sum = 0;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            boolean specialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", i, specialNum);
        }

    }
}
