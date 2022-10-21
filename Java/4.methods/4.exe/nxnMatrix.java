package Methods.exe;

import java.util.Scanner;

public class nxnMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        printMatrix(num);
    }

    public static void printLine(int num) {

        for (int i = 1; i <= num; i++) {
            System.out.print(num + " ");
        }
    }

    public static void printMatrix(int num) {

        for (int i = 1; i <= num; i++) {
            printLine(num);
            System.out.println();
        }
    }
}
