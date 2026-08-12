package FZRN_SLIDES.ExceptionHandling;

public class Circle {
    private double radius;

    Circle(double radius) {
        setRadius(radius); // use setter to validate
    }

    public void setRadius(double newRadius) throws IllegalArgumentException {
        if (newRadius >= 0) radius = newRadius;
        else throw new IllegalArgumentException("Radius cannot be negative"); // throwing a build-in unchecked exception
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);
            System.out.println("Circle radius: " + c1.getRadius());
            System.out.println("Circle area: " + c1.getArea());

            Circle c2 = new Circle(-3); // invalid, will throw exception
            System.out.println("Circle radius: " + c2.getRadius());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception.");
    }
}