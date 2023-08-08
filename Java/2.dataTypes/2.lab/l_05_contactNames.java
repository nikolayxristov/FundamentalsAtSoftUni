package dataTypes.lab;

import java.util.Scanner;

public class l_05_contactNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(name1 + delimiter + name2);
    }
}
