package SUDDIN.LAB1;

public class StudentMarksAverage {
    //1. Student Marks Average
    //Story:
    //A student named Rahim got marks in 3 subjects: Math = 85, Physics = 78, English = 90. He wants to know his average score.
    //Task:
    //Write a Java program to calculate the average marks.
    //Formula:
    //Average = (Math + Physics + English) / 3
    public static void main(String[] args) {
        System.out.println("== Rahim's marks == ");

        int Math = 85;
        System.out.println("Math = " + Math);
        int Physics = 78;
        System.out.println("Physics = " + Physics);
        int English = 90;
        System.out.println("English = " + English);

        final int SUBJECTS = 3;

        double average = (double)(Math + Physics + English) / SUBJECTS;
        System.out.println("Average = " + String.format("%.2f",average));
    }
}