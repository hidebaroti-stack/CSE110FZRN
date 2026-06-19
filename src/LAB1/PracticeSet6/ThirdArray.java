package LAB1.PracticeSet6;

import java.util.Scanner;

public class ThirdArray {
    // Write a program that takes two arrays of size 5 each and produces a third array where each element is the sum of the corresponding elements.
    //Sample:
    //
    //A = [1, 2, 3, 4, 5]
    //B = [10, 20, 30, 40, 50]
    //C = [11, 22, 33, 44, 55]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        System.out.print("Input the elements of the array A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.print("Input the elements of the array B: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }
        System.out.print("Sum of the array A & B is C: ");
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
            System.out.print(C[i] + " ");
        }
    }
}