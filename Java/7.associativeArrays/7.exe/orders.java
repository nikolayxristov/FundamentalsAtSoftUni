package associativeArrays.exe;

import java.util.*;

public class orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<Double>> productMap = new LinkedHashMap<>();

        while (true) {
            String[] productArr = scanner.nextLine().split(" ");

            if (productArr[0].equals("buy")) {
                printOrders(productMap);
                break;
            }

            if (!productMap.containsKey(productArr[0])) {
                productMap.put(productArr[0], new ArrayList<>());
            }

            if (productMap.get(productArr[0]).size() == 0) {
                productMap.get(productArr[0]).add(Double.parseDouble(productArr[1]));
                productMap.get(productArr[0]).add(Double.parseDouble(productArr[2]));
            } else {
                productMap.get(productArr[0]).set(0, Double.parseDouble(productArr[1]));
                double quantity = productMap.get(productArr[0]).get(1);
                productMap.get(productArr[0]).remove(1);
                productMap.get(productArr[0]).add(quantity + Double.parseDouble(productArr[2]));
            }
        }
    }

    public static void printOrders(LinkedHashMap<String, List<Double>> productMap) {


        for (Map.Entry<String, List<Double>> entry : productMap.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
        }
    }
}

