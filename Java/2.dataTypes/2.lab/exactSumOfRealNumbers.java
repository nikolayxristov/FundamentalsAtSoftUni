package DataTypes.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class exactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= n; i++) {
            BigDecimal num = new BigDecimal(input.nextLine());
            sum = sum.add(num);
        }

        System.out.println(sum);
    }
}
