package TextProcessing.exe;

import java.util.Scanner;

public class validUsernames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(", ");

        for (String username : inputArr) {

            if (validLength(username) && validSymbols(username)) {
                System.out.println(username);
            }

        }

    }

    public static boolean validLength(String username) {

        return username.length() > 2 && username.length() < 17;

    }

    public static boolean validSymbols(String username) {

        char[] symbolArr = username.toCharArray();
        boolean verified = true;

        for (char symbol : symbolArr) {

            if (!Character.isLetterOrDigit(symbol) && symbol != 45 && symbol != 95) {
                verified = false;
            }

        }

        return verified;
    }

}
