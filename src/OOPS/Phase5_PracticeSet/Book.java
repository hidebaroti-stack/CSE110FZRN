package OOPS.Phase5_PracticeSet;

import java.util.ArrayList;
import java.util.Collections;

public class Book implements Comparable<Book> {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title); // String.compareTo()
    }
    @Override
        public String toString(){
            return title + " by " + author;
    }
}
class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book ("No Longer Human", "Osamu Dazai"));
        book.add(new Book ("Kokoro",  "Natsume Sōseki"));
        book.add(new Book ("Snow Country", "Yasunari Kawabata"));

        System.out.println("=== Before sorting ===");
        for (Book books : book) {
            System.out.println(books);
        }

        Collections.sort(book);

        System.out.println("=== After sorting ====");
        for (Book books : book) {
            System.out.println(books);
        }
    }
}