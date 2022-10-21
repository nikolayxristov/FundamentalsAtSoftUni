package Methods.exe;

import java.util.Locale;
import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(numberOfVowels(input.toLowerCase(Locale.ROOT)));
    }
    public static int numberOfVowels(String text) {
        int count = 0;

        for (char symbol : text.toCharArray()) {
            if (symbol == 'a' | symbol == 'e' | symbol == 'i' | symbol == 'o' | symbol == 'u') {
                count++;
            }
        }
        return count;
    }
}
