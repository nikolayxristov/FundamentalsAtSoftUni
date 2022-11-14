package associativeArrays.exe;

import java.util.*;

public class legendaryFarming {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> materialMap = new LinkedHashMap<>();
        boolean needMaterial = true;

        while (needMaterial) {

            String[] materialArr = scanner.nextLine().split(" ");

            for (int i = 1; i < materialArr.length; i++) {

                if (i % 2 != 0) {

                    String material = materialArr[i].toLowerCase();

                    if (!materialMap.containsKey(material)) {

                        materialMap.put(material, Integer.parseInt(materialArr[i - 1]));

                    } else {

                        int currentQuantity = materialMap.get(material);
                        materialMap.replace(material, currentQuantity + Integer.parseInt(materialArr[i - 1]));
                    }

                    if (materialMap.containsKey("shards")) {

                        int shardQuantity = materialMap.get("shards");

                        if (shardQuantity >= 250) {
                            System.out.println("Shadowmourne obtained!");
                            System.out.printf("shards: %d%n", materialMap.get("shards") - 250);

                            if (materialMap.get("fragments") != null) {
                                System.out.printf("fragments: %d%n", materialMap.get("fragments"));
                            } else {
                                System.out.printf("fragments: %d%n", 0);
                            }

                            if (materialMap.get("motes") != null) {
                                System.out.printf("motes: %d%n", materialMap.get("motes"));
                            } else {
                                System.out.printf("motes: %d%n", 0);
                            }

                            materialMap.remove("shards");
                            materialMap.remove("fragments");
                            materialMap.remove("motes");

                            for (Map.Entry<String, Integer> entry : materialMap.entrySet()) {

                                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());

                            }

                            needMaterial = false;
                            break;

                        }

                        if (materialMap.containsKey("fragments")) {

                            int fragmentQuantity = materialMap.get("fragments");

                            if (fragmentQuantity >= 250) {
                                System.out.println("Valanyr obtained!");

                                if (materialMap.get("shards") != null) {
                                    System.out.printf("shards: %d%n", materialMap.get("shards"));
                                } else {
                                    System.out.printf("shards: %d%n", 0);
                                }

                                System.out.printf("fragments: %d%n", materialMap.get("fragments") - 250);

                                if (materialMap.get("motes") != null) {
                                    System.out.printf("motes: %d%n", materialMap.get("motes"));
                                } else {
                                    System.out.printf("motes: %d%n", 0);
                                }

                                materialMap.remove("shards");
                                materialMap.remove("fragments");
                                materialMap.remove("motes");

                                for (Map.Entry<String, Integer> entry : materialMap.entrySet()) {

                                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());

                                }

                                needMaterial = false;
                                break;
                            }

                        }

                        if (materialMap.containsKey("motes")) {

                            int moteQuantity = materialMap.get("motes");

                            if (moteQuantity >= 250) {
                                System.out.println("Dragonwrath obtained!");

                                if (materialMap.get("shards") != null) {
                                    System.out.printf("shards: %d%n", materialMap.get("shards"));
                                } else {
                                    System.out.printf("shards: %d%n", 0);
                                }

                                if (materialMap.get("fragments") != null) {
                                    System.out.printf("fragments: %d%n", materialMap.get("fragments"));
                                } else {
                                    System.out.printf("fragments: %d%n", 0);
                                }

                                    System.out.printf("motes: %d%n", materialMap.get("motes") - 250);
                                materialMap.remove("shards");
                                materialMap.remove("fragments");
                                materialMap.remove("motes");

                                for (Map.Entry<String, Integer> entry : materialMap.entrySet()) {

                                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());

                                }

                                needMaterial = false;
                                break;

                            }
                        }
                    }
                }
            }
        }
    }
}