package LAB1.PracticeSet5;

public class Prime {
    //Write a method isPrime(int n) that returns true if a number is prime. In main, print all prime numbers from 1 to 50 by calling this method.
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Print all the prime numbers from 1 to 50: ");
        for (int i = 0; i < 50; i++) {
            if (isPrime(i)) System.out.print(i + " ");
        }
    }
}