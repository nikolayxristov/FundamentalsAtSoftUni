package Methods.lab;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operator = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        operation(operator, firstNum, secondNum);
    }

    public static void operation(String calculation, int num1, int num2) {

        switch (calculation) {
            case "add":
                System.out.println(num1 + num2);
                break;
            case "subtract":
                System.out.println(num1 - num2);
                break;
            case "multiply":
                System.out.println(num1 * num2);
                break;
            case "divide":
                System.out.println(num1 / num2);
                break;
            default:
                break;
        }
    }
}
