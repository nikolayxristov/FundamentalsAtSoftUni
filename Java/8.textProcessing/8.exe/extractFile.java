package TextProcessing.exe;

import java.util.Scanner;

public class extractFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int backslashIdx = input.lastIndexOf("\\");
        int dotIdx = input.indexOf(".");

        String fileName = input.substring(backslashIdx + 1, dotIdx);
        String fileExtension = input.substring(dotIdx + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);

    }
}
