package MID_PRACTICE.Output;

 public class Student {
    private int marks;

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks.");
        } else {
            this.marks = marks;
        }
    }
    public int getMarks() {
        return marks;
    }
}
class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(150);
        System.out.println(s.getMarks());
        s.setMarks(85);
        System.out.println(s.getMarks());
    }
}