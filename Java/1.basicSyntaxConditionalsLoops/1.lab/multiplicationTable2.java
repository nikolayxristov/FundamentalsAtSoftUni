package a.syntaxConditionsLoops;

import java.util.Scanner;

public class multiplicationTable2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());
        int multiplyer = Integer.parseInt(input.nextLine());

        int base = num;
        int result = num * multiplyer;

        if (multiplyer <= 10) {
            while (multiplyer <= 10) {
                System.out.printf("%d X %d = %d%n", base, multiplyer, result);
                result += base;
                ++multiplyer;
            }
        } else {
            System.out.printf("%d X %d = %d", num, multiplyer, result);
        }
    }
}
