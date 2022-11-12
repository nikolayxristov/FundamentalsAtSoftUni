package associativeArrays.exe;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> materialMap = new LinkedHashMap<>();

        while (true) {
            String material = scanner.nextLine();

            if (material.equals("stop")) {
                break;
            }

            int quantity = Integer.parseInt(scanner.nextLine());

            if (!materialMap.containsKey(material)) {
                materialMap.put(material, 0);
            }

            materialMap.put(material, materialMap.get(material) + quantity);
        }

        printMaterials(materialMap);
    }

    public static void printMaterials(LinkedHashMap<String, Integer> materialMap) {

        for (Map.Entry<String, Integer> entry : materialMap.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
