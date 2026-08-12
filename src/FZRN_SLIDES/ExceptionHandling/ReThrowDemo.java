package FZRN_SLIDES.ExceptionHandling;

public class ReThrowDemo {
    static void level1() throws Exception {
        try {
            level2();
        } catch (Exception e) {
            System.out.println("Level1 caught: " + e.getMessage());
            // do some logging or cleanup
            throw e; // rethrow to caller
        }
    }
    static void level2() throws Exception {
        try {
            level3();
        } catch (Exception e) {
            System.out.println("Level2 caught: " + e.getMessage());
            // maybe record error details
            throw e; // rethrow again
        }
    }
    static void level3() throws Exception {
        // deliberately throw checked exception
        throw new Exception("Something went wrong in level3!");
    }

    public static void main(String[] args) {
        try {
            level1();
        } catch (Exception e) {
            System.out.println("main finally handles: " + e.getMessage());
            e.printStackTrace();
        }
    }
}