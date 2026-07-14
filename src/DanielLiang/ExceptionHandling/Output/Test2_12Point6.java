package DanielLiang.ExceptionHandling.Output;

public class Test2_12Point6 {
    public static void main(String[] args) {

        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception e) {
        }
    }
}

// try-catch outside loop → one block for whole loop
// First exception stops the loop immediately
// Control jumps to catch, loop does not continue
// Output: only first iteration prints, then ends