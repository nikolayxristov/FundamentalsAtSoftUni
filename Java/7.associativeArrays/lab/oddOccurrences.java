package associativeArrays.lab;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class oddOccurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> occurrenceMap = new LinkedHashMap<>();

        for (String element : inputArr) {
            String currentElement = element.toLowerCase();

            if (!occurrenceMap.containsKey(currentElement)) {

                occurrenceMap.put(currentElement, 0);
            }
            occurrenceMap.put(currentElement, occurrenceMap.get(currentElement) + 1);
        }

        printElements(occurrenceMap);
    }

    public static void printElements(LinkedHashMap<String, Integer> occurrenceMap) {
        for (Map.Entry<String, Integer> entry : occurrenceMap.entrySet()) {
            int printCounter = 0;
            if (entry.getValue() % 2 != 0) {
                System.out.printf("%s", entry.getKey());
                printCounter++;
                if (printCounter < occurrenceMap.size() ) {

                }
            }
        }
    }
}
