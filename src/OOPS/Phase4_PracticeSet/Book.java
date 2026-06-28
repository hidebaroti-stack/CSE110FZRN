package OOPS.Phase4_PracticeSet;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // Overriding equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return this.title.equals(other.title) && this.author.equals(other.author);

    }
}
class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book("The Ideal Hindu Hotel", "Bibhutibhushan Bandyopadhyay");
        Book book2 = new Book("The Ideal Hindu Hotel", "Bibhutibhushan Bandyopadhyay");
        Book book3 = new Book("পথের পাঁচালী", "Bibhutibhushan Bandyopadhyay");

        // two separate Book objects with identical data where
        // 'equals()' returns true WHILE '==' returns false.
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
    }
}