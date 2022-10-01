package a.syntaxConditionsLoopsExe;

import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            double money = Double.parseDouble(input.nextLine());
            int students = Integer.parseInt(input.nextLine());
            double lightsaberPrice = Double.parseDouble(input.nextLine()) * Math.ceil(students + 0.10 * students);
            double robePrice = Double.parseDouble(input.nextLine()) * students;
            double belt = Double.parseDouble(input.nextLine());
            double beltPrice = 0;

            if (students >= 6) {
                int freeBelts = students / 6;
                beltPrice = (students - freeBelts) * belt;
            } else {
                beltPrice = students * belt;
            }

            double sum = lightsaberPrice + robePrice + beltPrice;

            if (sum <= money) {
                System.out.printf("The money is enough - it would cost %.2flv.", sum);
            } else {
                System.out.printf("George Lucas will need %.2flv more.", Math.abs(money - sum));
            }
    }
}
