package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students2 {

    static class Student{

        private String firstName;
        private String lastName;
        private String age;
        private String city;

        public Student(String firstName, String lastName, String age, String city) {

            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public String getFirstName() {

            return this.firstName;
        }

        public String getLastName() {

            return this.lastName;
        }

        public String getAge() {

            return this.age;
        }

        public String getCity() {

            return this.city;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    public static boolean IsStudentInList(List<Student> studentList, String firstName, String lastName) {

        for (Student element : studentList) {

            if (element.getFirstName().equals(firstName) && element.getLastName().equals(lastName)) {

                return true;
            }
        }
        return false;
    }

    public static Student getStudent(List<Student> studentList, String firstName, String lastName) {

        Student existingStudent = null;

        for (Student element : studentList) {

            if (element.getFirstName().equals(firstName) && element.getLastName().equals(lastName)) {

                existingStudent = element;
            }
        }

        return existingStudent;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("end")) {

                String outputCity = scanner.nextLine();

                for (Student element : studentList) {

                    if (element.getCity().equals(outputCity)) {

                        System.out.printf("%s %s is %s years old%n",element.getFirstName(), element.getLastName()
                                , element.getAge());
                    }
                }

                break;
            }

            String[] studentArr = input.split(" ");

            if (IsStudentInList(studentList, studentArr[0], studentArr[1])) {

                Student student = getStudent(studentList, studentArr[0], studentArr[1]);

                student.setAge(studentArr[2]);
                student.setCity(studentArr[3]);
            } else {

                Student currentStudent = new Student(studentArr[0], studentArr[1], studentArr[2], studentArr[3]);
                studentList.add(currentStudent);
            }
        }
    }
}

