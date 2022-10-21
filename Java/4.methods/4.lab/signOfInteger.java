package Methods.lab;

import java.util.Scanner;

public class signOfInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        defineNumberSign(Integer.parseInt(scanner.nextLine()));
    }

    public static void defineNumberSign(int num) {

        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        } else if (num == 0) {
            System.out.printf("The number %d is zero.", num);
        } else if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        }
    }
}
