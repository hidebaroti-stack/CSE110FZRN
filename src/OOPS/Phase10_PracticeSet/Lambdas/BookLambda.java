package OOPS.Phase10_PracticeSet.Lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
    private String title;
    private String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

public class BookLambda {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Ideal Hindu Hotel", "Bibhutibhushan Bandyopadhyay"));
        books.add(new Book("Padma Nadir Majhi", "Manik Bandopadhyay"));
        books.add(new Book("Devdas", "Sarat Chandra Chattopadhyay"));
        books.add(new Book("Gitanjali", "Rabindranath Tagore"));

        // lambda
        Collections.sort(books, (a, b) -> a.getAuthor().compareTo(b.getAuthor()));

        // cleaner with Comparator.cmparing
        books.sort(Comparator.comparing(b -> b.getAuthor()));

        // Print sorted list
        for (Book b : books) {
            System.out.println(b);
        }
    }
}