package DataTypes.Exe;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String biggestModel = "";
        double biggestVolume = 0;

        for (int i = 1; i <= n; i++) {
            String kegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;

            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestModel = kegModel;
            }
        }
        System.out.println(biggestModel);
    }
}
