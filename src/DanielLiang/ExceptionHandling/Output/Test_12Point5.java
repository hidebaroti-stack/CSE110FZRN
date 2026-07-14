package DanielLiang.ExceptionHandling.Output;

public class Test_12Point5 {
    public static void main(String[] args) {
        try {
            int value = 30;
            if (value < 40) throw new Exception("Value is too small.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Continue after the catch block.");
    }
}

/*
What would be the output if the line
int value = 30;
were changed to
int value = 50;

Output -> Continue after the catch block.
 */