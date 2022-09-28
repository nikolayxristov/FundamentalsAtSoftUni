package a.syntaxConditionsLoops;

import java.util.Scanner;

public class foreignLanguages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String country = input.nextLine();

        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
