package Methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(returnPower(num, power)));

    }

    public static double returnPower(double num, int power) {
        return Math.pow(num, power);
    }
}
