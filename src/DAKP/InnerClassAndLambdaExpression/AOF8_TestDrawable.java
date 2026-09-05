package DAKP.InnerClassAndLambdaExpression;

import java.util.Scanner;

/**
 * Task:
 *
 * Define an interface Drawable with method draw(int n).
 * Implement it without lambda (anonymous inner class).
 * Implement it with lambda.
 */

interface Drawable {
    int draw(int n);
}

public class AOF8_TestDrawable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        // Without Lambda (Anonymous Inner Class)
        Drawable d1 = new Drawable() {
            @Override
            public int draw(int n) {
                return n * n; // return square
            }
        };
        System.out.println("Without Lambda: " + d1.draw(num));

        // With Lambda
        Drawable d2 = (n) -> n * n;
        System.out.println("With Lambda: " + d2.draw(num));
    }
}