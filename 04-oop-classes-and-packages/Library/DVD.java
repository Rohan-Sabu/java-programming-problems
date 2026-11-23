package Library;

public class DVD extends LibraryItem {

    private int durationInSeconds;

    public DVD(String itemId, String title, int durationInSeconds) {
        this.itemId = itemId;
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public int getDurationInSeconds() {
        return durationInSeconds;
    }
}