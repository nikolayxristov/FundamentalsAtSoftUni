package DataTypes.Lab;

import java.util.Scanner;

public class convertMetersToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int meters = Integer.parseInt(input.nextLine());

        double kilometers = meters / 1000.0;

        System.out.printf("%.2f", kilometers);
    }
}
