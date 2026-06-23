package LAB4.Simplified;

public class Programming {

    Programming() {
        System.out.println("I love programming languages");
    }
    Programming(String s) {
        System.out.println("I love " + s);
    }

}
class ProgrammingMain {
    public static void main(String[] args) {

        Programming programming = new Programming();
        Programming programmingLang = new Programming("Java");

    }
}