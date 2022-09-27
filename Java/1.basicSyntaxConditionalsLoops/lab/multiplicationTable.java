package a.syntaxConditionsLoops;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());
        int counter = 1;
        int base = num;

        while (counter <= 10) {
            System.out.printf("%d X %d = %d%n", base, counter, num);
            ++counter;
            num += base;
        }
    }
}
