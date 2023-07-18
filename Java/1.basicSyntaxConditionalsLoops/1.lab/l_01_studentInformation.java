package syntaxConditionalsLoops;

import java.util.Scanner;

public class l_01_studentInformation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.02f", name, age, grade);

    }

}
