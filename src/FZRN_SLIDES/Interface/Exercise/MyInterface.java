package FZRN_SLIDES.Interface.Exercise;

interface MyInterface {
    int VALUE = 100;
    void showValue();
}
class Demo implements MyInterface {
    @Override
    public void showValue() {
        // VALUE = 200; // can't assign to constant
        System.out.println("Value is " + VALUE);
    }

    public static void main(String[] args) {
        MyInterface i = new Demo();
        i.showValue();
    }
}