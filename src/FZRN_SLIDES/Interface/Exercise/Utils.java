package FZRN_SLIDES.Interface.Exercise;

interface Utils {
    static void greet() {
        System.out.println("Hello from Interface!");
    }
    void doWork();
}

class App implements Utils {
    public void doWork() {
        System.out.println("Working...");
    }

    public static void main(String[] args) {
        App a = new App();
        //a.greet(); // static method needs to be called via class name
        Utils.greet();
        a.doWork();
    }
}