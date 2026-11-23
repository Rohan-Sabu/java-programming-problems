// Create a Book class for a library system 

// > Instance variables: title, author, isbn.
// > Static variable: totalBooks, a counter for the total number of book instances.
// > Instance methods: borrowBook(), returnBook()
// > Static method: getTotalBooks(), to get the total number ofbooks in the library.

public class Book{

    static int totalBooks;
    String title;
    String author;
    int isbn;
    boolean isBorrowed = false;

    static{
        // Static Code Block
        totalBooks = 0;
    }

    {
        // Initialization Code Block
        totalBooks ++;
    }

    Book(int id, String t, String a){
        isbn = id;
        title = t;
        author = a;
    }

    Book(int id){
        this(id, "Unknown", "Unknown");
    }

    public static int getTotalBooks(){
        return totalBooks;
    }

    public void borrowBook(){
        if(isBorrowed){
            System.out.println("The book is not available");
        }
        else{
            isBorrowed = true;
            System.out.println("Enjoy reading " + title);
        }
    }

    public void returnBook(){
        if(isBorrowed){
            isBorrowed = false;
            System.out.println("Hope you enjoyed reading " + title);
        }
        else{
            System.out.println(title + " is already is the library");
        }
    }

    public static void main(String[] args){
        Book b1 = new Book(1, "Java", "Sir");
        Book b2 = new Book(2);
        System.out.println(Book.getTotalBooks());
        b1.borrowBook();
        b2.borrowBook();
        b1.borrowBook();
        b1.returnBook();
        b1.returnBook();
    }
}