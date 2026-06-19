package LAB1.PracticeSet6;

import java.util.Scanner;

public class RemoveDuplicates_FirstOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Array after removing the duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            boolean duplicateFound = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicateFound = true;
                    break;
                }
            }
            if (!duplicateFound)
                System.out.print(arr[i] + " ");
        }
    }
}