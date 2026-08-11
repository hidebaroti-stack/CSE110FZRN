package FZRN_SLIDES.Interface.Exercise;

public interface Shape {
    void draw();
}
abstract class Polygon implements Shape {
    abstract void displaySlides();
}
class Square extends Polygon {
    @Override
    public void draw() {
        System.out.println("Drawing Square...");
    }
    @Override
    public void displaySlides() {
        System.out.println("Displaying slides...");
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.draw();
        s.displaySlides();
    }
}
