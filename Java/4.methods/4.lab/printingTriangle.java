package Methods.lab;

import java.util.Scanner;

public class printingTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= inputNum; i++) {
            firstHalf(1, i);
        }
        for (int j = 0; j < inputNum - 1; j++) {
            secondHalf(inputNum - j);
        }
    }
    public static void firstHalf(int start, int finish) {

        for (int i = start; i <= finish; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void  secondHalf(int finish) {
        for (int i = 1; i < finish; i++ ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
