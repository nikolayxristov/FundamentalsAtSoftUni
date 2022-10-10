package DataTypes.Exe;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (num > 0) {
            int currentNum = num % 10;
            sum += currentNum;
            num /= 10;
        }
        System.out.println(sum);
    }
}
