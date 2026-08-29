package FINAL_PRACTICE;

import java.util.Scanner;

public class Box <T> {
    private T data;
    public void setData(T data) { this.data = data; }
    public T getValue() { return data; }
}
class BoxMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Integer Data: ");
        int intData = scanner.nextInt();

        Box<Integer> integerBox = new Box<>();
        integerBox.setData(intData);
        System.out.println("Integer: " + integerBox.getValue());

        System.out.print("String Data: ");
        String strData = scanner.next();

        Box<String> stringBox = new Box<>();
        stringBox.setData(strData);
        System.out.println("String: " + stringBox.getValue());
    }
}