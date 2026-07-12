package LAB7;

public class FinallyWithTry {
    public static void main(String[] args) {
        try {
            System.out.println("Main try block running.");
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Main catch: ArithmeticException.");
        } finally {
            System.out.println("Inside finally block.");

            try {
                int[] arr = new int[2];
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Catch inside finally: ArrayIndexOutOfBoundsException caught. ");
            }
        }
        System.out.println("Program ends normally.");
    }
}