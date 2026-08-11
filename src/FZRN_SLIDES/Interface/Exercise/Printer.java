package FZRN_SLIDES.Interface.Exercise;

interface Printer {
    void print();
}
class TextPrinter implements Printer {
    public void print() {
        System.out.println("Printing Text");
    }
    public void format() {
        System.out.println("Formatting Text");
    }
    public static void main(String[] args) {
        Printer p = new TextPrinter();
        p.print();
        //p.format(); // p is the ref variable of Printer but format is the method of TextPrinter
        TextPrinter p1 = new TextPrinter();
        p1.format();
    }
}