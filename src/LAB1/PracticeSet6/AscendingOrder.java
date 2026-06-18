package LAB1.PracticeSet6;

import java.util.Scanner;

public class AscendingOrder {
    //Write a program that reads n integers into an array and checks whether it is sorted in ascending order. Print "Sorted" or "Not Sorted".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean sortedArray = true;
        for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {sortedArray = false;break;}
        }
        System.out.print(sortedArray ? "Sorted." : "Not Sorted.");
    }
}