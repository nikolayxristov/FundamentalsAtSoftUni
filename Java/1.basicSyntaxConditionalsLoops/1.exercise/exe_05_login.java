package syntaxConditionalsLoops.exe;

import java.util.Scanner;

public class exe_05_login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder();

        for (int i = username.length() - 1; i >= 0; i--) {
            password.append(username.charAt(i));
        }

        String userInput = scanner.nextLine();
        int numOfTries = 1;

        while (true) {
            if (userInput.equals(password.toString())) {
                System.out.println("User " + username + " logged in.");
                break;
            } else if (numOfTries == 4) {
                System.out.println("User " + username + " blocked!");
                break;
            }
            System.out.println("Incorrect password. Try again.");
            numOfTries++;
            userInput = scanner.nextLine();
        }
    }
}
