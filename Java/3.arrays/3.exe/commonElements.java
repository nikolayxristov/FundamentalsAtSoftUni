package Arrays.exe;

import java.awt.*;
import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] firstArr = scanner.nextLine().split(" ");
        String [] secondArr = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < firstArr.length; j++) {

                if (secondArr[i].equals(firstArr[j])) {
                    System.out.print(secondArr[i] + " ");
                }
            }
        }
    }
}
