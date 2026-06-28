package OOPS.Phase4_PracticeSet;

import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> playlist = new ArrayList<>();

        System.out.println("===== Adding 5 songs =====");
        playlist.add(" 1. Can't Help Fall In Love With You\n");
        playlist.add("2. I Like Me Better When I'm With You\n");
        playlist.add("3. Nothing's Gonna Change My Love For You\n");
        playlist.add("4. I Don't Care\n");
        playlist.add("5. How Long");

        System.out.println(playlist);
        System.out.println("\nThe size of the playlist: " + playlist.size());

        playlist.remove(3); // Remove element by index
        System.out.println("=== After removing, the playlist === ");
        System.out.println(playlist);
        System.out.println("\nThe size of the playlist: " + playlist.size());

        playlist.remove("5. How Long"); // Remove element by name
        System.out.println("=== After removing, the playlist === ");
        System.out.println(playlist);
        System.out.println("\nThe size of the playlist: " + playlist.size());

    }
}