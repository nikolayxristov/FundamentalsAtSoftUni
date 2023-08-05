package dataTypes.lab;

import java.util.Scanner;

public class l_02_poundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.03f", pounds * 1.36);
    }
}
