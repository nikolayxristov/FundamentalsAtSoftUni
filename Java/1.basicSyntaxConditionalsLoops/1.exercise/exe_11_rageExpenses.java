package syntaxConditionalsLoops.exe;

import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;

public class exe_11_rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());
        double expenses = 0;
        double n = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0) {
                expenses += headsetPrice;
            }
            if (i % 3 == 0) {
                expenses += mousePrice;
            }
            if (i % 6 == 0) {
                expenses += keyboardPrice;
                n++;
            }
            if (n != 0 && n % 2 == 0) {
                expenses += displayPrice;
                n = 0;
            }
        }
        System.out.printf("Rage expenses: %.02f lv", expenses);
    }
}
