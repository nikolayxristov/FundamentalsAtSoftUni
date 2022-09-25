//package syntaxConditionsLoops;
//
//import java.util.Scanner;
//
//public class studentInformation {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        String name = input.nextLine();
//        int age = Integer.parseInt(input.nextLine());
//        double grade = Double.parseDouble(input.nextLine());
//
//        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
//    }
//}


package a.syntaxConditionsLoops;

import java.util.Scanner;

public class studentInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        double grade = Double.parseDouble(input.nextLine());

        String result = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

        System.out.print(result);
    }
}