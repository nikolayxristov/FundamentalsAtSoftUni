package dataTypes.lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class l_03_exactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal nextNumber = new BigDecimal(scanner.nextLine());
            sum = sum.add(nextNumber);
        }

        System.out.println(sum);
    }
}
