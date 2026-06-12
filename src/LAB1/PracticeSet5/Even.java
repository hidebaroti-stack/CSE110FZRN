package LAB1.PracticeSet5;

public class Even {
    // Write a method isEven(int n) that returns true if the number is even, false otherwise. Call it from main for 5 different numbers.
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {

        System.out.println(isEven(1));
        System.out.println(isEven(2));
        System.out.println(isEven(3));
        System.out.println(isEven(4));
        System.out.println(isEven(5));
    }
}