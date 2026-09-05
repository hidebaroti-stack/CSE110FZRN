package DAKP.InheritanceAndPolymorphism;

// Superclass from Problem 7
class AddNumbers<T extends Number> {
    protected T num1;
    protected T num2;

    public AddNumbers(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("AddNumbers constructor called");
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}

// Subclass extending AddNumbers
class AddThreeNumbers<T extends Number> extends AddNumbers<T> {
    private T num3;

    public AddThreeNumbers(T num1, T num2, T num3) {
        super(num1, num2);
        this.num3 = num3;
        System.out.println("AddThreeNumbers constructor called");
    }

    @Override
    public double add() {
        return super.add() + num3.doubleValue();
    }
}
public class BOf3_ConstructorChainingPolymorphism {
    public static void main(String[] args) {
        // Polymorphism: reference type is superclass, object type is subclass
        AddNumbers<Integer> obj = new AddThreeNumbers<>(10, 20, 30);

        System.out.println("Result: " + obj.add());
    }
}
