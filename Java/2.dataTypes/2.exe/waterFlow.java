package DataTypes.Exe;

import java.util.Scanner;

public class waterFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int waterInTank = 0;

        for (int i = 1; i <= n; i++) {
            int water = Integer.parseInt(scanner.nextLine());
            waterInTank += water;

            if (waterInTank > 255) {
                System.out.println("Insufficient capacity!");
                waterInTank -= water;
            }
        }

        System.out.println(waterInTank);
    }
}
