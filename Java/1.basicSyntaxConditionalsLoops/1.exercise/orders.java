package a.syntaxConditionsLoopsExe;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfOrders = Integer.parseInt(input.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= numberOfOrders; i++) {
            double capsulePrice = Double.parseDouble(input.nextLine());
            int days = Integer.parseInt(input.nextLine());
            int capsuleCount = Integer.parseInt(input.nextLine());

            double orderPrice = capsulePrice * capsuleCount * days;
            totalPrice += orderPrice;

            System.out.printf("The price for the coffee is: $%.2f%n", orderPrice);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
