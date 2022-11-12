package associativeArrays.exe;

import java.util.*;

public class courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<String>> studentMap = new LinkedHashMap<>();

        while (true) {

            String[] studentArr = scanner.nextLine().split(" : ");

            if (studentArr[0].equals("end")) {

                break;

            }

            if (!studentMap.containsKey(studentArr[0])) {

                studentMap.put(studentArr[0], new ArrayList<>());

            }

            studentMap.get(studentArr[0]).add(studentArr[1]);

        }

        printStudents(studentMap);

    }

    public static void printStudents(LinkedHashMap<String, List<String>> studentMap) {

        for (Map.Entry<String, List<String>> entry : studentMap.entrySet()) {

            List<String> studentList = entry.getValue();
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            for (String student : studentList) {
                System.out.printf("-- %s%n", student);
            }

        }

    }
}