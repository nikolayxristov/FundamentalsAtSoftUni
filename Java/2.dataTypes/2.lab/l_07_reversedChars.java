package dataTypes.lab;

import java.util.Scanner;

public class l_07_reversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder chars = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char x = scanner.nextLine().charAt(0);
            chars.append(x);
        }
        for (int i = 2; i >= 0; i--) {
            System.out.print(chars.charAt(i) + " ");
        }
    }
}
