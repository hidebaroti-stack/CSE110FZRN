package MID_PRACTICE.LAB5.SetA;

public class Shape {
    void describe() {
        System.out.println("I am a shape.");
    }
}
class Triangle extends Shape {
    @Override
    void describe() {
        super.describe(); // Calls the parent method
        System.out.println("And I am a Triangle in particular.");
    }
}
class Square extends Shape {
    @Override
    void describe() {
        super.describe();
        System.out.println("And I am a Square in particular.");
    }
}
class ShapeMain {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Triangle(),
                new Square()
        };
        for (Shape shape : shapes) {
            shape.describe();
        }
    }
}