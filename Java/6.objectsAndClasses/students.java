package objectsAndClasses.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {

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
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> studentList= new ArrayList<>();

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

            Student currentStudent = new Student(studentArr[0], studentArr[1], studentArr[2], studentArr[3]);

            studentList.add(currentStudent);
        }
    }
}
