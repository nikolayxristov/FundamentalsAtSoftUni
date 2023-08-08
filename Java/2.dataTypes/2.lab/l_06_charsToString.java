package dataTypes.lab;

import java.util.Scanner;

public class l_06_charsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char x = scanner.nextLine().charAt(0);
            stringBuilder.append(x);
        }
        System.out.println(stringBuilder);
    }
}
