package a.syntaxConditionsLoops;

import java.util.Scanner;

public class backIn30Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hours = Integer.parseInt(input.nextLine());
        int minutes = Integer.parseInt(input.nextLine());

        int totalMins = minutes + 30;

        if (totalMins > 59) {
            ++hours;
            totalMins -= 60;
            if (hours == 24) {
                hours = 0;
            }
        }

        System.out.printf("%d:%02d", hours, totalMins);
    }
}
