package Methods.exe;

import java.util.Scanner;

public class smallestOfThreeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(returnSmallestNum(firstNum, secondNum, thirdNum));
    }

    public static int returnSmallestNum(int firstNum, int secondNum, int thirdNum) {

        if (firstNum < secondNum && firstNum < thirdNum) {
            return firstNum;
        } else if (secondNum < firstNum && secondNum < thirdNum) {
            return secondNum;
        } else {
            return thirdNum;
        }
    }
}
