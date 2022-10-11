package DataTypes.Exe;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int dayCounter = 0;
        int collectedYield = 0;

        if (startingYield < 100) {
            System.out.println(dayCounter);
            System.out.println(collectedYield);
        } else {
            while (true) {

                dayCounter++;
                collectedYield += startingYield;
                startingYield -= 10;
                collectedYield -= 26;

                if (startingYield < 100) {
                    collectedYield -= 26;
                    System.out.println(dayCounter);
                    System.out.println(collectedYield);
                    break;
                }
            }
        }
    }
}
