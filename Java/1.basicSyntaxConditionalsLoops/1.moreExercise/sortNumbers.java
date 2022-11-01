package basicSyntaxMoreExe;

import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int lowestNum = 0;
        int highestNum = 0;

        if (num1 <= num2 && num1 <= num3) {
            lowestNum = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            lowestNum = num2;
        } else {
            lowestNum = num3;
        }

        if (num1 >= num2 && num1 >= num3) {
            highestNum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            highestNum = num2;
        } else {
            highestNum = num3;
        }

        System.out.println(highestNum);

        if (num1 != lowestNum && num1 != highestNum) {
            System.out.println(num1);
        } else if (num2 != lowestNum && num2 != highestNum) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

        System.out.println(lowestNum);
    }
}
