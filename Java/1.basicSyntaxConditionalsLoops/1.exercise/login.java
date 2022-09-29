package a.syntaxConditionsLoopsExe;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = input.nextLine();
        String password = "";

        for (int idx = username.length() - 1; idx >= 0; idx--) {
            password += username.charAt(idx);
        }

        int numberOfTries = 0;

        while (true) {
            numberOfTries += 1;
            String userPass = input.nextLine();
            if (userPass.equals(password)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else if (numberOfTries == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
