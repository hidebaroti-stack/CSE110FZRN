package QUIZ_2;

public interface Payable {
    double calculatePay();
}
class Employee implements Payable {
    private double monthlySalary;

    Employee (double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        System.out.println("Employee's Pay: ");
        return monthlySalary;
    }
}
class Freelancer implements Payable{
    private double hourlyRate;
    private int hoursWorked;

    Freelancer (double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        System.out.println("Freelancer's pay: ");
        return hourlyRate * hoursWorked;
    }
}
class PayableMain {
    public static void main(String[] args) {
        Payable[] payable = {new Employee(35_000), new Freelancer(800, 40)};

        for (Payable p : payable) {
            System.out.println(p.calculatePay());
        }
    }
}