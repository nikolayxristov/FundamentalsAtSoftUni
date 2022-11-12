package associativeArrays.exe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInAString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] wordArr = scanner.nextLine().split(" ");
        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();

        for (String word : wordArr) {
            getChars(word, charMap);
        }

        printChars(charMap);
    }

    public static void getChars(String word, LinkedHashMap<Character, Integer> charMap) {
        for (int i = 0; i < word.length(); i++) {
            if (!charMap.containsKey(word.charAt(i))) {
                charMap.put(word.charAt(i), 0);
            }
            charMap.put(word.charAt(i), charMap.get(word.charAt(i)) + 1);
        }
    }

    public static void printChars(LinkedHashMap<Character, Integer> charMap) {
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(), entry.getValue());
        }
    }
}
