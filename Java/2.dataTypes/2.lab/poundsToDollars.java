package DataTypes.Lab;

import java.util.Scanner;

public class poundsToDollars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float pounds = Float.parseFloat(input.nextLine()) * 1.36f;

        System.out.printf("%.3f", pounds);
    }
}
