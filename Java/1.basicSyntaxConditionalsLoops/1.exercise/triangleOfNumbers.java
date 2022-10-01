package a.syntaxConditionsLoopsExe;

import java.util.Scanner;

public class triangleOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= num; i++) {
            int base = i;
            String triangle = "";
            while (true) {
                triangle += i + " ";
                base -= 1;
                if (base == 0) {
                    System.out.println( triangle);
                    break;
                }
            }
        }
    }
}
