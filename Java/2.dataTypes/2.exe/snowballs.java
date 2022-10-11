package DataTypes.Exe;

import java.util.Scanner;

public class snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int highestValue = 0;
        int highestSnow = 0;
        int highestTime = 0;
        int highestQuality = 0;

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int snowballValue = (int) Math.pow((double) (snowballSnow / snowballTime), snowballQuality);

            if (snowballValue >= highestValue) {
                highestValue = snowballValue;
                highestSnow = snowballSnow;
                highestTime = snowballTime;
                highestQuality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %d (%d)", highestSnow, highestTime, highestValue, highestQuality);
    }
}
