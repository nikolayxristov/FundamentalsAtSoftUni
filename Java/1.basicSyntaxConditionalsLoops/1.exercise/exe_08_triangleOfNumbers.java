package syntaxConditionalsLoops.exe;

import java.util.Scanner;

public class exe_08_triangleOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (j == i - 1) {
                    System.out.printf("%d%n", i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
    
}
