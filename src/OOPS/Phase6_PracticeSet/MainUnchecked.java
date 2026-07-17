package OOPS.Phase6_PracticeSet;

class Level {
    void level1() {level2();} // call level2
    void level2() {level3();} // call level3
    // deliberately throwing unchecked exception
    void level3() { throw new RuntimeException("Error!");}
}

public class MainUnchecked {
    public static void main(String[] args) {
        Level obj = new Level();

        try {
            obj.level1(); // start of the chain
        } catch (RuntimeException e) {
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace(); // shows the full propagation chain
        }

    }
}