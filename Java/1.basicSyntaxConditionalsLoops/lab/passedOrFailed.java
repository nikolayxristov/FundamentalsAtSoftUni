package a.syntaxConditionsLoops;

import java.util.Scanner;

public class passedOrFailed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double grade = Double.parseDouble(input.nextLine());

        if (grade >= 3) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
