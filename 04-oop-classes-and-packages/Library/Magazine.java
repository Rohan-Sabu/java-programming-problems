package Library;

public class Magazine extends LibraryItem {

    private String issueNumber;

    public Magazine(String itemId, String title, String issueNumber) {
        this.itemId = itemId;
        this.title = title;
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }
}