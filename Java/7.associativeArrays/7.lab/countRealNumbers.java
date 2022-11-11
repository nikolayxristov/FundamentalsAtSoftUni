package associativeArrays.lab;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countRealNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] numberArr = scanner.nextLine().split(" ");
        TreeMap<String, Integer> numberMap = new TreeMap<>();

        for (String number : numberArr) {
            if (!numberMap.containsKey(number)) {
                numberMap.put(number, 0);
            }
            numberMap.put(number, numberMap.get(number) + 1);
        }

        for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(), entry.getValue());
        }
    }
}
