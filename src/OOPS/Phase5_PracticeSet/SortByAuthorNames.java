package OOPS.Phase5_PracticeSet;

import java.util.*;

public class SortByAuthorNames implements Comparator<Book>{
    @Override
    public int compare(Book a, Book b) {
        return a.author.compareTo(b.author);
    }
}
class BookTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Ideal Hindu Hotel", "Bibhutibhushan Bandyopadhyay"));
        books.add(new Book("Devdas", "Sarat Chandra Chattopadhyay"));
        books.add(new Book("Gitanjali", "Rabindranath Tagore"));
        books.add(new Book("Padma Nadir Majhi", "Manik Bandopadhyay"));

        Collections.sort(books, new SortByAuthorNames());

        for (Book book : books) {
            System.out.println(book);
        }
    }
}