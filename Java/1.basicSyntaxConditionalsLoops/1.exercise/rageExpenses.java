package a.syntaxConditionsLoopsExe;

import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lostGames = Integer.parseInt(input.nextLine());
        double headsetPrice = Double.parseDouble(input.nextLine());
        double mousePrice = Double.parseDouble(input.nextLine());
        double keyboardPrice = Double.parseDouble(input.nextLine());
        double displayPrice = Double.parseDouble(input.nextLine());

        double headsetExpense = Math.floor(lostGames / 2) * headsetPrice;
        double mouseExpense = Math.floor(lostGames / 3) * mousePrice;
        double keyboardExpense = Math.floor(lostGames / 6) * keyboardPrice;
        double displayExpense = Math.floor(lostGames / 12) * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", headsetExpense + mouseExpense + keyboardExpense + displayExpense);

    }
}
