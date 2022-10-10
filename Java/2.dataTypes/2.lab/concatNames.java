package DataTypes.Lab;

import java.util.Scanner;

public class concatNames{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String delimiter = input.nextLine();

        System.out.println(name1 + delimiter + name2);
    }
}
