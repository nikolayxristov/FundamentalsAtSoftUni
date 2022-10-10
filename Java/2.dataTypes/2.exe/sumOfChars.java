package DataTypes.Exe;

import java.util.Scanner;

public class sumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += scanner.nextLine().charAt(0);
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
