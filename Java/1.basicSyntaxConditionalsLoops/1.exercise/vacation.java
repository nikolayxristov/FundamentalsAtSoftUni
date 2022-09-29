package a.syntaxConditionsLoopsExe;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = Integer.parseInt(input.nextLine());
        String type = input.nextLine();
        String day = input.nextLine();

        double price = 0;

        if (type.equals("Students")) {
            if (day.equals("Friday")) {
                price = count * 8.45;
            } else if (day.equals("Saturday")) {
                price = count * 9.8;
            } else if (day.equals("Sunday")) {
                price = count * 10.46;
            }
            if (count >= 30) {
                price -= price * 0.15;
            }
        } else if (type.equals("Business")) {
            if (count >= 100) {
                count -= 10;
            }
            if (day.equals("Friday")) {
                price = count * 10.9;
            } else if (day.equals("Saturday")) {
                price = count * 15.6;
            } else if (day.equals("Sunday")) {
                price = count * 16;
            }
        } else if (type.equals("Regular")) {
            if (day.equals("Friday")) {
                price = count * 15;
            } else if (day.equals("Saturday")) {
                price = count * 20;
            } else if (day.equals("Sunday")) {
                price = count * 22.5;
            }
            if (count >= 10 && count <= 20) {
                price -= price * 0.05;
            }
        }

        System.out.printf("Total price: %.2f", price);
    }
}
