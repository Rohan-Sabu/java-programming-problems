package Library;

public class Book extends LibraryItem {

    private String ISBN;

    public Book(String itemId, String title, String ISBN) {
        this.itemId = itemId;
        this.title = title;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }
}
