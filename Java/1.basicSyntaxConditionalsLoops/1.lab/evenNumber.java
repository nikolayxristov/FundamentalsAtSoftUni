package a.syntaxConditionsLoops;

import java.util.Scanner;

public class evenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());

        if (num % 2 != 0) {
            while (num % 2 != 0) {
                System.out.println("Please write an even number.");
                int nextNum = Integer.parseInt(input.nextLine());
                if (nextNum % 2 == 0) {
                    System.out.printf("The number is: %d", Math.abs(nextNum));
                    break;
                }
            }
        } else {
            System.out.printf("The number is: %d", Math.abs(num));
        }
    }
}
