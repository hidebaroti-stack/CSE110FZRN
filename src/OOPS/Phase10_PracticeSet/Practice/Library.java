package OOPS.Phase10_PracticeSet.Practice;

public class Library {
    private String libraryName;

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    // Static Nested Class
    static class Book {
        String title;
        String author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void display() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
        }
    }

    // Non-Static inner class
    class Member {
        String memberName;

        Member (String memberName) {
            this.memberName = memberName;
        }

        void borrow(Book b) {
            System.out.println(memberName + " borrowed " + b.title + " from " + libraryName);
        }
    }
}
class LibraryMain {
    public static void main(String[] args) {
        // Create outer object
        Library library = new Library("Sufia Kamal National Public Library");

        Library.Book book = new Library.Book("Murder on the Orient-Express", "Agatha Cristie");
        book.display();

        Library.Member member = library.new Member("Debaroti");
        member.borrow(book);
    }
}
