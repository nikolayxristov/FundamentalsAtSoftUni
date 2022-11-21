package TextProcessing.exe;

import java.math.BigInteger;
import java.util.Scanner;

public class multiplyBigNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger number = new BigInteger(scanner.nextLine());

        BigInteger sum = number.multiply(new BigInteger(scanner.nextLine()));

        System.out.println(sum);

    }
}
