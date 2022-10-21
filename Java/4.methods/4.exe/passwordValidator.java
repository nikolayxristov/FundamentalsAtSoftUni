package Methods.exe;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        passwordLength(password);

        passwordContent(password);

        passwordDigits(password);

        isPasswordValid(password);
    }

    public static void passwordLength(String password) {

        if (password.length() < 6 | password.length() > 10) {

            System.out.println("Password must be between 6 and 10 characters");
        }
    }

    public static void passwordContent(String password) {

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                break;
            }
        }
    }

    public static void passwordDigits(String password) {

        int counter = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                counter++;
            }
            if (counter > 1) {
                break;
            }
        }
        if (counter < 2) {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static void isPasswordValid(String password) {

        boolean isValid = true;

        if (password.length() < 6 | password.length() > 10) {

            isValid = false;
        }

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                isValid = false;
                break;
            }
        }

        int counter = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                counter++;
            }
            if (counter > 1) {
                break;
            }
        }
        if (counter < 2) {
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }
}

