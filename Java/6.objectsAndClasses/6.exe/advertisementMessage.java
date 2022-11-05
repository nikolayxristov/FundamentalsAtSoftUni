package objectsAndClasses.exe;

import java.util.Random;
import java.util.Scanner;

public class advertisementMessage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] phrasesArr = {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };

        String[] eventsArr = {
                "Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"
        };

        String[] authorsArr = {
                "Diana",
                "Petya",
                "Stella",
                "Elena",
                "Katya",
                "Iva",
                "Annie",
                "Eva"
        };

        String[] cityArr = {
                "Burgas",
                "Sofia",
                "Plovdiv",
                "Varna",
                "Ruse"
        };

        Random rdm = new Random();

        int numOfMessages = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numOfMessages; i++) {

            int idx1 = rdm.nextInt(phrasesArr.length);
            int idx2 = rdm.nextInt(eventsArr.length);
            int idx3 = rdm.nextInt(authorsArr.length);
            int idx4 = rdm.nextInt(cityArr.length);

            System.out.printf("%s %s %s - %s.%n", phrasesArr[idx1], eventsArr[idx2], authorsArr[idx3], cityArr[idx4]);
        }
    }
}
