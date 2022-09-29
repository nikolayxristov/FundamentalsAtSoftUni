package a.syntaxConditionsLoopsExe;

import java.util.Scanner;

public class printAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startNum = Integer.parseInt(input.nextLine());
        int stopNum = Integer.parseInt(input.nextLine());

        int sum = 0;

        for (int i = startNum; i <= stopNum; i++) {
            System.out.printf("%d ", i);
            sum += i;
        }

        System.out.printf("%nSum: %d", sum);
    }
}
