package LAB7.Problems;

import java.util.Scanner;

// Custom Exception
class MyException extends Exception{
    MyException(String str) {
        super(str); // pass message to Exception class
    }
}
// Product class
class Product {
    void productCheck(int weight) throws MyException {
        if (weight < 100) {
            throw new MyException("Product is invalid!");
        } else {
            System.out.println("Weight: " + weight);
        }
    }
}
public class MyExceptionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product p = new Product(); // create Product object

        System.out.print("Enter the weight: ");
        int weight = scanner.nextInt();

        try {
            p.productCheck(weight); // call method that may throw exception
        } catch (MyException e) {
            System.out.println("Weight can't be under 100. " + e.getMessage());
        }
    }
}