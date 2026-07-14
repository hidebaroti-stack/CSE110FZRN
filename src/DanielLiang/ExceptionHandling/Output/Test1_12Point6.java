package DanielLiang.ExceptionHandling.Output;

public class Test1_12Point6 {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            }
            catch (Exception e) {
            }
        }
    }
}

// try-catch inside loop → handles exception per iteration
// Each iteration runs fully, even if one fails
// Exception caught locally, loop continues
// Output: both iterations print + exception message each time