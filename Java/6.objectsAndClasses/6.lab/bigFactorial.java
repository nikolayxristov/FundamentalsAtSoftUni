package objectsAndClasses.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class bigFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= num; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }
}
