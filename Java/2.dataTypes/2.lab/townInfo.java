package DataTypes.Lab;

import java.util.Scanner;

public class townInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String town = input.nextLine();
        String population = input.nextLine();
        String area = input.nextLine();

        System.out.printf("Town %s has population of %s and area %s square km.", town, population, area);
    }
}
