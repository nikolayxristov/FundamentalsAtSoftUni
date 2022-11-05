package objectsAndClasses.exe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class opinionPoll {

    static class Person {
        String name;
        String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] personArr = scanner.nextLine().split(" ");
            Person person = new Person(personArr[0], personArr[1]);
            personList.add(person);
        }

        printPerson(personList);

    }

    public static void printPerson(List<Person> personList) {

        int age = 0;

        for (Person element : personList) {
            age = Integer.parseInt(element.getAge());

            if (age > 30) {
                System.out.printf("%s - %s%n", element.getName(), element.getAge());
            }
        }

    }
}