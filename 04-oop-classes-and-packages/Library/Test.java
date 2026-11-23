package Library;

public class Test {

    public static void main(String[] args) {
        Book book = new Book("B1", "Java 101", "123-456");
        Magazine magazine = new Magazine("M1", "Tech Weekly", "Issue 42");
        DVD dvd = new DVD("D1", "Inception", 7200);

        System.out.println("Book: " + book.getTitle() + " | ISBN: " + book.getISBN());
        book.checkout();
        book.returnItem();

        System.out.println("Magazine: " + magazine.getTitle() + " | Issue: " + magazine.getIssueNumber());
        magazine.checkout();
        magazine.returnItem();

        System.out.println("DVD: " + dvd.getTitle() + " | Duration: " + dvd.getDurationInSeconds() + "s");
        dvd.checkout();
        dvd.returnItem();
    }
}