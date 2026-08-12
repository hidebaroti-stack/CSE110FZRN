package FZRN_SLIDES.Interface;

public interface Values {
    abstract void area();

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 6);
        r.area();
    }
}

class Rectangle implements Values {
    int height, length;

    Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }
    @Override
    public void area() {
        System.out.println(height * length);
    }
}