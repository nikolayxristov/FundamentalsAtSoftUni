package Methods.exe;

import java.util.Scanner;

public class factorialDivision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long firstFactorial = factorial(num1);
        long secondFactorial = factorial(num2);

        double result = firstFactorial * 1.0 / secondFactorial;

        System.out.printf("%.2f", result);

    }

    public static Long factorial(int num) {

        long sum = 1;

        for (int i = 1; i <= num; i++) {

            sum *= i;

        }

        return sum;
    }

}
