package associativeArrays.exe;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, List<Double>> studentMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {

            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());

            if (!studentMap.containsKey(studentName)) {

                studentMap.put(studentName, new ArrayList<>());

            }

            studentMap.get(studentName).add(studentGrade);

        }

        LinkedHashMap<String, List<Double>> highGradeMap = new LinkedHashMap<>();

        excludeLowGradedStudents(studentMap, highGradeMap);

        printStudents(highGradeMap);

    }

    public static void excludeLowGradedStudents(LinkedHashMap<String, List<Double>> studentMap,
                                                LinkedHashMap<String, List<Double>> highGradeMap) {



        for (Map.Entry<String, List<Double>> entry : studentMap.entrySet()) {

            List<Double> gradeList = entry.getValue();
            String student = entry.getKey();
            double averageGrade = 0;

            for (Double grade : gradeList) {

                averageGrade += grade;

            }

            if (averageGrade / gradeList.size() >= 4.5) {

                highGradeMap.put(student, gradeList);

            }
        }
    }

    public static void printStudents(LinkedHashMap<String, List<Double>> highGradeMap) {

        for (Map.Entry<String, List<Double>> entry : highGradeMap.entrySet()) {

            List<Double> gradeList = entry.getValue();
            double averageGrade = 0;

            for (Double grade : gradeList) {

                averageGrade += grade;

            }

            System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade / gradeList.size());

        }
    }
}
