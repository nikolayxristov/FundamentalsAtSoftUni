package associativeArrays.lab;

import java.util.*;

public class wordSynonyms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> synonymMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonymMap.containsKey(word)) {
                synonymMap.put(word, new ArrayList<>());
            }

            synonymMap.get(word).add(synonym);
        }

        printSynonyms(synonymMap);
    }

    public static void printSynonyms(LinkedHashMap<String, List<String>> synonymMap) {

        for (Map.Entry<String, List<String>> entry : synonymMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
