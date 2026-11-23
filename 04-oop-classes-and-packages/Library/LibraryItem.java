package Library;

public class LibraryItem {

    protected String itemId;
    protected String title;

    public LibraryItem() {
    }

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    public void checkout() {
        System.out.println("checkout");
    }    

    public void returnItem() {
        System.out.println("Returning the item");
    }

    public String getTitle() {
        return title;
    }
}