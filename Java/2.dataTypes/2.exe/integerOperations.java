package DataTypes.Exe;

import java.util.Scanner;

public class integerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        int fourthNum = Integer.parseInt(scanner.nextLine());

        int sum = ((firstNum + secondNum) / thirdNum) * fourthNum;

        System.out.println(sum);
    }
}
