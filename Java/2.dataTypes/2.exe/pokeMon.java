package DataTypes.Exe;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionIdx = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int initialPower = pokePower;

        while (true) {
            pokePower -= distance;
            counter++;

            if (pokePower == initialPower / 2 && pokePower / exhaustionIdx > 0) {
                pokePower /= exhaustionIdx;
            }

            if (pokePower < distance) {
                System.out.println(pokePower);
                System.out.println(counter);
                break;
            }
        }
    }
}
