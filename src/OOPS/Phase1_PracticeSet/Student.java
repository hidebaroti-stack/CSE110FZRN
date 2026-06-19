package OOPS.Phase1_PracticeSet;

import java.util.Scanner;

public class Student {
    private String name;
    private int[] grades;

    Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
    public double average() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
         return (double)sum / grades.length;
    }
    public int highest() {
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > highest) highest  = grades[i];
        }
        return highest;
    }

    public void display() {
        System.out.println("Student name: " + name);
        System.out.print("Student grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();
        System.out.println("Average: " + average());
        System.out.println("Highest: " + highest());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int s = 1; s <= numStudents; s++) {
            System.out.print("Enter name of student " + s + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter number of grades for " + name + ": ");
            int n = scanner.nextInt();

            int[] grades = new int[n];

            System.out.print("Enter " + n + " grades:");
            for (int i = 0; i < grades.length; i++) {
                grades[i] = scanner.nextInt();
            }
            scanner.nextLine();

            Student student = new Student(name, grades);
            student.display();
        }
        scanner.close();
    }
}