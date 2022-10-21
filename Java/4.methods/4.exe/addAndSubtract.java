package Methods.exe;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(intSubtraction(firstNum, secondNum, thirdNum));
    }

    public static int intSum(int firstNum, int secondNum) {

        return firstNum + secondNum;
    }

    public static int intSubtraction(int firstNum, int secondNum, int thirdNum) {

        return intSum(firstNum, secondNum) - thirdNum;
    }
}
