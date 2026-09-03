package OOPS.Phase10_PracticeSet.Lambdas.Practice;

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

class movieMain {
    public static void main(String[] args) {
        List<Movie> movie = new ArrayList<>();

        movie.add(new Movie("The Dark Knight", "Action", 9.0));
        movie.add(new Movie("Inception", "Sci-Fi", 8.8));
        movie.add(new Movie("Pulp Fiction", "Crime", 8.9));
        movie.add(new Movie("Spirited Away", "Animation", 8.6));
        movie.add(new Movie("Mad Max: Fury Road", "Action", 8.1));

        // Sort By Rating
        System.out.println("=== Sorted by ratings ===");
        Collections.sort(movie);
        movie.forEach(System.out::println);

        // Sort By Genre, then rating (lambda)
        System.out.println("\n=== Sorted by Genres + Ratings ===");
        movie.sort((a, b) -> {
            int genreComparison = a.genre.compareTo(b.genre);
            if (genreComparison != 0) return genreComparison;
            return Double.compare(b.rating, a.rating); // descending rating within genre
        });
        movie.forEach(System.out::println);


        // Cleaner with Comparator.comparing
        System.out.println("\n=== Sorted by Genres + Ratings (Comparator.comparing) ===");
        movie.sort(Comparator.comparing((Movie m) -> m.genre).thenComparingDouble((Movie m) -> -m.rating));
        movie.forEach(System.out::println);
    }
}