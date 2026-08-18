package OOPS.Phase10_PracticeSet.Lambdas;

@FunctionalInterface
public interface MathOperations {
    int operate(int a, int b); // exactly one abstract method
}
class Test {
    public static void main(String[] args) {
        MathOperations add = (a, b) -> a + b;
        MathOperations multiply = (a, b) -> a * b;
        MathOperations max = (a, b) -> a > b ? a : b;

        System.out.println(add.operate(5, 3));
        System.out.println(multiply.operate(5, 3));
        System.out.println(max.operate(5, 3));
    }
}