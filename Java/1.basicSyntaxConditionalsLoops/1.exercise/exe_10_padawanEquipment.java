package syntaxConditionalsLoops.exe;

import java.util.Scanner;

public class exe_10_padawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());

        double totalPrice = lightsaberPrice * studentsCount + beltPrice * studentsCount + robePrice * studentsCount;
        totalPrice += (Math.ceil(studentsCount * 0.1)) * lightsaberPrice;
        int freeBelts = studentsCount / 6;
        totalPrice -= beltPrice * freeBelts;

        if (budget >= totalPrice) {
            System.out.printf("The money is enough - it would cost %.02flv.", totalPrice);
        } else {
            System.out.printf("George Lucas will need %.02flv more.", totalPrice - budget);
        }
    }

}
