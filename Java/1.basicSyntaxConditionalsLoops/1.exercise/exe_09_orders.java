package syntaxConditionalsLoops.exe;

import java.util.Scanner;

public class exe_09_orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <= n; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double orderPrice = price * days * capsulesCount;
            System.out.printf("The price for the coffee is: $%.02f%n", orderPrice);
            total += orderPrice;
        }
        System.out.printf("Total: $%.02f", total);
    }
}
