package dataTypes.lab;

import java.util.Scanner;

public class l_08_LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = scanner.nextLine().charAt(0);
        if (Character.isUpperCase(x)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(x)){
            System.out.println("lower-case");
        }
    }
}
