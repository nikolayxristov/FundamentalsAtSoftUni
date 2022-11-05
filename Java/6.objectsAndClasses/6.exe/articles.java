package objectsAndClasses.exe;

import java.util.Scanner;

public class articles {

    static class Article {

        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {

            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] articleArr = scanner.nextLine().split(", ");

        Article article = new Article(articleArr[0], articleArr[1], articleArr[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            String[] commandArr = scanner.nextLine().split(": ");

            switch (commandArr[0]) {
                case "Edit":
                    editContent(article, commandArr);
                    break;

                case "ChangeAuthor":
                    changeAuthor(article, commandArr);
                    break;

                case "Rename":
                    renameTitle(article, commandArr);
                    break;

                default:
                    break;
            }
        }

        printArticle(article);
    }

    public static void editContent(Article article, String[] commandArr) {

        article.setContent(commandArr[1]);
    }

    public static void changeAuthor(Article article, String[] commandArr) {

        article.setAuthor(commandArr[1]);
    }

    public static void renameTitle(Article article, String[] commandArr) {

        article.setTitle(commandArr[1]);
    }

    public static void printArticle(Article article) {

        String title = article.getTitle();
        String content = article.getContent();
        String author = article.getAuthor();

        System.out.printf("%s - %s: %s", title, content, author);
    }
}