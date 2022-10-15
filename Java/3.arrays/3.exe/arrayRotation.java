package Arrays.exe;

import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int counter = 0;
            String firstElement = inputArr[0];
            while (true) {
                inputArr[counter] = inputArr[counter + 1];
                counter++;
                if (counter == inputArr.length - 1) {
                    inputArr[inputArr.length - 1] = firstElement;
                    break;
                }
            }
            }
        System.out.println(String.join(" ", inputArr));
        }
    }
