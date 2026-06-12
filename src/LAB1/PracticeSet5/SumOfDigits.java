package LAB1.PracticeSet5;

public class SumOfDigits {
    //Write a method sumOfDigits(int n) that takes an integer and returns the sum of its digits. Call it from main.
    //Sample: sumOfDigits(1234) → 10
    public static int sumOfDigits(int n) {
        int sum = 0;

        while(n != 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
    }
}