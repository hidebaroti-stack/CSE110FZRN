package FZRN_SLIDES.Interface;

public interface MyInterface {
    public void method1();
    public void method2();
}
class Demo implements MyInterface {
    @Override
    public void method1() {
        System.out.println("Implementation of method 1");
    }
    @Override
    public void method2() {
        System.out.println("Implementation of method 2");
    }

    public static void main(String[] args) {
        MyInterface obj = new Demo();
        obj.method1();
        obj.method2();
    }
}