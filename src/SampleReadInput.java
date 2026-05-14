import java.util.Scanner;
class SampleReadInput{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();
        System.out.print("Enter your department: ");
        String department = input.next();

        System.out.println();

        System.out.println("Your Name: " + name);
        System.out.println("Your Age: " + age);
        System.out.println("Your CGPA: " + cgpa);
        System.out.println("Your Department: " + department);
    } // main method ends
} // Main class ends