package FZRN_SLIDES.Generics;

public class GenericMethod {
    public<T> T showData(T data) {           // public<T> void display (T param)
        System.out.println("Data: " + data); // System.out.println("Value: " + param);
        return data;
    }

    public static void main(String[] args) {
        GenericMethod obj = new GenericMethod();

        obj.showData(100);
        obj.showData("Hello!");
        obj.showData(3.1416);
    }
}