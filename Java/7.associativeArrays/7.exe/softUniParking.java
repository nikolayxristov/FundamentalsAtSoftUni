package associativeArrays.exe;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> userMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {

            String[] serviceArr = scanner.nextLine().split(" ");

            if (serviceArr[0].equals("register")) {

                if (!userMap.containsKey(serviceArr[1])) {

                    userMap.put(serviceArr[1], serviceArr[2]);
                    System.out.printf("%s registered %s successfully%n", serviceArr[1], serviceArr[2]);

                } else {

                    System.out.printf("ERROR: already registered with plate number %s%n", serviceArr[2]);

                }

            } else {

                if (!userMap.containsKey(serviceArr[1])) {

                    System.out.printf("ERROR: user %s not found%n", serviceArr[1]);

                } else {

                    userMap.remove(serviceArr[1]);
                    System.out.printf("%s unregistered successfully%n", serviceArr[1]);

                }
            }
        }

        printUsers(userMap);

    }

    public static void printUsers(LinkedHashMap<String, String> userMap) {

        for (Map.Entry<String, String> entry : userMap.entrySet()) {

            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());

        }
    }
}