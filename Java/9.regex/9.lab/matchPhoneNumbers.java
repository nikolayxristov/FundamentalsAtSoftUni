package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchPhoneNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex1 = "\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex1);
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        List<String> matchedNums = new ArrayList<>();

        while (matcher.find()) {
            matchedNums.add(matcher.group());
        }

        printNums(matchedNums);

    }

    public static void printNums(List<String> matchedNums) {

        for (int i = 0; i < matchedNums.size() - 1; i++) {
            System.out.print(matchedNums.get(i) + ", ");
        }

        System.out.print((matchedNums.get(matchedNums.size() - 1)));

    }

}
