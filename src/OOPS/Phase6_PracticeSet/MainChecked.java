package OOPS.Phase6_PracticeSet;

class LevelChecked {
    void level1() throws Exception {
        level2(); // call level2
    }
    void level2() throws Exception {
        level3(); // call level3
    }
    void level3() throws Exception {
        // deliberately throw a checked exception
        throw new Exception("Something went wrong in level3!");
    }
}
public class MainChecked {
    public static void main(String[] args) {
        LevelChecked obj = new LevelChecked();

        try {
            obj.level1(); // start the chain
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace(); // shows the full propagation chain
        }
    }
}