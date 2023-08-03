package syntaxConditionalsLoops.moreExe;

import java.util.Scanner;

public class moreExe_03_gamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double totalSpent = 0;

        while (!input.equals("Game Time")) {
            switch (input) {
                case "OutFall 4":
                    if (budget >= 39.99) {
                        System.out.println("Bought OutFall 4");
                        budget -= 39.99;
                        totalSpent += 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "CS: OG":
                    if (budget >= 15.99) {
                        System.out.println("Bought CS OG");
                        budget -= 15.99;
                        totalSpent += 15.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (budget >= 19.99) {
                        System.out.println("Bought Zplinter Zell");
                        budget -= 19.99;
                        totalSpent += 19.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (budget >= 59.99) {
                        System.out.println("Bought Honored 2");
                        budget -= 59.99;
                        totalSpent += 59.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (budget >= 29.99) {
                        System.out.println("Bought RoverWatch");
                        budget -= 29.99;
                        totalSpent += 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (budget >= 39.99) {
                        System.out.println("Bought RoverWatch Origins Edition");
                        budget -= 39.99;
                        totalSpent += 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
            }

            if (budget == 0) {
                System.out.println("Out of money!");
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Game Time")) {
            System.out.printf("Total spent: $%.02f. Remaining: $%.02f", totalSpent, budget);
        }
    }
}
