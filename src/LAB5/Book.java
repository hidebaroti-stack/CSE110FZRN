package LAB5;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

}
class LibraryBook extends Book {
    int bookID;
    boolean isAvailable;

    LibraryBook(String title, String author, int bookID, boolean isAvailable) {
        super(title, author);
        this.bookID = bookID;
        this.isAvailable = isAvailable;
    }

    void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' (ID: " + bookID + ") has been borrowed.");
        } else {
            System.out.println("Book '" + title + "' is unavailable for borrow.");

        }
    }
}

class BookMain {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("আদর্শ হিন্দু হোটেল", "Bibhutibhushan Bandyopadhyay", 35887835, true);

        book.borrowBook();
        book.borrowBook();
    }
}