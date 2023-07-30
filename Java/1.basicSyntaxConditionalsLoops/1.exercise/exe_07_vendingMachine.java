package syntaxConditionalsLoops.exe;

import java.util.Scanner;

public class exe_07_vendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double change = 0;

        while (!input.equals("Start")) {
            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                change += money;
            } else {
                System.out.printf("Cannot accept %.02f%n", money);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            switch (input) {
                case "Nuts":
                    if (change >= 2) {
                        System.out.println("Purchased Nuts");
                        change -= 2;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (change >= 0.7) {
                        System.out.println("Purchased Water");
                        change -= 0.7;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (change >= 1.5) {
                        System.out.println("Purchased Crisps");
                        change -= 1.5;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (change >= 0.8) {
                        System.out.println("Purchased Soda");
                        change -= 0.8;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (change >= 1) {
                        System.out.println("Purchased Coke");
                        change -= 1;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }

        System.out.printf("Change: %.02f", change);
    }

}
