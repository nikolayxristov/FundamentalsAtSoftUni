package Methods.lab;

import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        gradeScale(Double.parseDouble(scanner.nextLine()));
    }
    public static void gradeScale(double grade) {

        if (grade >= 2 && grade < 3 ) {
            System.out.println("Fail");
        } else if (grade >= 3 && grade < 4) {
            System.out.println("Poor");
        } else if (grade >= 4 && grade < 4.5) {
            System.out.println("Good");
        } else if (grade >= 4.5 && grade < 5.5) {
            System.out.println("Very good");
        } else if (grade >= 5.5 && grade <= 6) {
            System.out.println("Excellent");
        }
    }
}
