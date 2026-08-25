package FZRN_SLIDES.NestedClass.Exercise;

public class Student {
    String name = "Rahim";
    class Result {
        int marks = 85;
        void display() {
            System.out.println("Name: " + name);
            System.out.println("Marks: " + marks);
        }
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        Student.Result r = s.new Result();
        r.display();
    }
    /*
    class Student {
        String name = "Rahim";
        class Result {
            int marks = 85;
            void display() {
                System.out.println("Name: " + name);
                System.out.println("Marks: " + marks);
            }
        }
    }
    ▪ Task: Create object and print name & marks.
    */
}