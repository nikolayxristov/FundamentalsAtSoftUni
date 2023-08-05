package dataTypes.lab;

import java.util.Scanner;

public class l_01_convertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meters = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.02f", (double) meters / 1000);
    }
}
