package MID_PRACTICE.CodeThis;

public class SumAverage {
    //Write a program that takes an array {5, 3, 8, 1, 9, 2} and prints the sum and average.
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9, 2};

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum = " + sum + " and Average = " + String.format("%.2f", (double)sum / arr.length));
    }
}
