package a.syntaxConditionsLoopsExe;

import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0;

        while (true) {
         String money = input.nextLine();

         if (money.equals("Start")) {
             break;
         }
         double coin = Double.parseDouble(money);

         if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
             sum += coin;
         } else {
             System.out.printf("Cannot accept %.2f%n", coin);
         }
        }

        double price;

        while (true) {
            String product = input.nextLine();

            if (product.equals("End")) {
                System.out.printf("Change: %.2f", sum);
                break;
            }

            switch (product) {
                case "Nuts":
                    price = 2;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    price = 0.7;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    price = 1.5;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    price = 0.8;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    price = 1;
                    if (sum >= price) {
                        System.out.printf("Purchased %s%n", product);
                        sum -= price;
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            }
        }
    }

