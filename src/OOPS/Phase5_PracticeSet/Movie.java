package OOPS.Phase5_PracticeSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie>{
    String title;
    String genre;
    double rating;

    Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
    @Override
    public int compareTo(Movie other) {
        return Double.compare(this.rating, other.rating);
    }
    @Override
    public String toString() {
        return title + " (" + genre + ") - Rating: " + rating;
    }
}
class SortByGenreNames implements Comparator<Movie>{
    @Override
    public int compare(Movie a, Movie b) {
        int genreComparison = a.genre.compareTo(b.genre);
        if (genreComparison != 0) {
            return genreComparison;
        }
        return Double.compare(b.rating, a.rating);
    }
}

class movieMain {
    public static void main(String[] args) {
        List<Movie> movie = new ArrayList<>();

        movie.add(new Movie("The Dark Knight", "Action", 9.0));
        movie.add(new Movie("Inception", "Sci-Fi", 8.8));
        movie.add(new Movie("Pulp Fiction", "Crime", 8.9));
        movie.add(new Movie("Spirited Away", "Animation", 8.6));
        movie.add(new Movie("Mad Max: Fury Road", "Action", 8.1));

        System.out.println("=== Sorted by ratings ===");
        Collections.sort(movie);
        for (Movie movies : movie) {
            System.out.println(movies);
        }

        System.out.println("=== Sorted by Genres ===");
        Collections.sort(movie, new SortByGenreNames());
        for (Movie movies : movie) {
            System.out.println(movies);
        }
    }
}