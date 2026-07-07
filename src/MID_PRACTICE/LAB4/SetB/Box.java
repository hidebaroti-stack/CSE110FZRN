package MID_PRACTICE.LAB4.SetB;

public class Box {
    double length;
    double width;
    double height;
    // no-arg → all sides = 1
    Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
        System.out.println("Volume: " + (this.length * this.width * this.height));
    }
    // one param → cube (all sides equal to that param)
    Box(double c) {
        this.length = c;
        this.width = c;
        this.height = c;
        System.out.println("Volume: " + (this.length * this.width * this.height));
    }
    // two params → treated as length and width only; height = length
    Box(double length, double width) {
        this.length = length;
        this.width = width;
        this.height = length;
        System.out.println("Volume: " + (this.length * this.width * this.height));
    }
    // three params → all three set individually
    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        System.out.println("Volume: " + (this.length * this.width * this.height));
    }
}

class BoxMain {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(2.5);
        Box box3 = new Box(4.5, 6.5);
        Box box4 = new Box(2.5, 4.5, 6.5);
    }
}