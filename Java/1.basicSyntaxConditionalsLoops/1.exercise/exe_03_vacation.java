package syntaxConditionalsLoops.exe;

import java.util.Scanner;

public class exe_03_vacation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (type) {
            case "Students":
                if (day.equals("Friday")) {
                    price = peopleCount * 8.45;
                } else if (day.equals("Saturday")) {
                    price = peopleCount * 9.80;
                } else if (day.equals("Sunday")) {
                    price = peopleCount * 10.46;
                }
                if (peopleCount >= 30) {
                    price -= price * 0.15;
                }
                break;
            case "Business":
                if (day.equals("Friday")) {
                    price = peopleCount * 10.9;
                } else if (day.equals("Saturday")) {
                    price = peopleCount * 15.6;
                } else if (day.equals("Sunday")) {
                    price = peopleCount * 16;
                }
                if (peopleCount >= 100) {
                    double discount = price / peopleCount;
                    price -= discount * 10;
                }
                break;
            case "Regular":
                if (day.equals("Friday")) {
                    price = peopleCount * 15;
                } else if (day.equals("Saturday")) {
                    price = peopleCount * 20;
                } else if (day.equals("Sunday")) {
                    price = peopleCount * 22.50;
                }
                if (peopleCount >= 10 && peopleCount < 21) {
                    price -= price * 0.05;
                }
                break;
        }

        System.out.printf("Total price: %.02f", price);

    }

}
