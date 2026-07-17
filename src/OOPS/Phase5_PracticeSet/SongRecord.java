package OOPS.Phase5_PracticeSet;

import java.util.Arrays;

public class SongRecord  implements Cloneable {
    private String title;
    private String artist;
    private int[] playCountPerDay;

    SongRecord(String title, String artist, int[] playCountPerDay) {
        this.title = title;
        this.artist= artist;
        this.playCountPerDay = playCountPerDay;
    }

    @Override
    public SongRecord clone() {
        try {
            SongRecord cloned = (SongRecord) super.clone();        // shallow clone
            cloned.playCountPerDay = this.playCountPerDay.clone(); //deep clone
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Song title: " + title +
                ", by artist: " + artist +
                ", play counts: " + Arrays.toString(playCountPerDay);
    }

    public static void main(String[] args) {
        int[] counts = {10, 20, 30, 40, 50, 60, 70};
        SongRecord original = new SongRecord("Dream Song", "Debaroti", counts);

        // Clone the object
        SongRecord clone = original.clone();

        // Modify clone only
        clone.playCountPerDay[0] = 0;

        System.out.println("Original: " + original);
        System.out.println("   Clone: " + clone);
    }
}