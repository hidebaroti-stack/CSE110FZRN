package MID_PRACTICE.LAB4.SetA;

public class Student {
    String name;
    int[] marks;

    Student(String name) {
        this.name = name;
        this.marks = new int[5];
    }
    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
}

class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("Deb");
        System.out.println("Name For Student Object 1: " + student1.name);

        System.out.println("Marks For Student Object 1: ");
        int sum1 = 0;
        for (int mark : student1.marks) {
            sum1 += mark;
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage: " + sum1 / 5);

        int[] marks = {80, 90, 100, 85, 95};
        Student student2 = new Student("Bob", marks);
        System.out.println("Name For Student Object 2: " + student2.name);

        System.out.print("Marks For Student Object 2: ");
        int sum2 = 0;
        for (int i = 0; i < student2.marks.length; i++) {
            sum2 += marks[i];
            System.out.print(student2.marks[i]);
            System.out.print((i ==  student2.marks.length - 1 ? ".": ", "));

        }
        System.out.println("\nAverage: " + sum2 / 5);
    }
}