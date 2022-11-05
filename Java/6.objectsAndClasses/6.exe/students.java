package objectsAndClasses.exe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class students {

    static class Student {

        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] studentArr = scanner.nextLine().split(" ");
            double grade = Double.parseDouble(studentArr[2]);
            Student currentStudent = new Student(studentArr[0], studentArr[1], grade);
            studentList.add(currentStudent);
        }

        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                if (studentList.get(i).getGrade() < studentList.get(j).getGrade()) {
                    Collections.swap(studentList, i, j);
                    i = -1;
                    break;
                }
            }
        }
        printStudents(studentList);
    }

    public static void printStudents(List<Student> studentList) {

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
