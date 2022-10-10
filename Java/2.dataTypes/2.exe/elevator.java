package DataTypes.Exe;

import java.util.Scanner;

public class elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        System.out.println((int) Math.ceil((double) people / capacity));
    }
}
