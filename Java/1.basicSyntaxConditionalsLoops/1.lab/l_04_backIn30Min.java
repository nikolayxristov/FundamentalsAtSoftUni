package syntaxConditionalsLoops;

import java.util.Scanner;

public class l_04_backIn30Min {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes += 30;

        if (minutes >= 60) {
            minutes = minutes - 60;
            ++hours;
            if (hours == 24) {
                hours = 0;
            }
        }

        System.out.printf("%d:%02d", hours, minutes);

    }

}
