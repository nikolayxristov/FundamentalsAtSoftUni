package a.syntaxConditionsLoops;

import java.util.Scanner;

public class theatrePromotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String day = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        int price;

        if (day.equals("Weekday")) {
            if (0 <= age && age <= 18) {
                System.out.println("12$");
            } else if (age > 18 && age <= 64) {
                System.out.println("18$");
            } else if (age > 64 && age <= 122) {
                System.out.println("12$");
            } else {
                System.out.println("Error!");
            }
        } else if (day.equals("Weekend")) {
            if (0 <= age && age <= 18) {
                System.out.println("15$");
            } else if (age > 18 && age <= 64) {
                System.out.println("20$");
            } else if (age > 64 && age <= 122) {
                System.out.println("15$");
            } else {
                System.out.println("Error!");
            }
        } else {
            if (0 <= age && age <= 18) {
                System.out.println("5$");
            } else if (age > 18 && age <= 64) {
                System.out.println("12$");
            } else if (age > 64 && age <= 122) {
                System.out.println("10$");
            } else {
                System.out.println("Error!");
            }
        }
    }
}