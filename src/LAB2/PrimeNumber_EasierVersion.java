package LAB2;
import java.util.Scanner;
public class PrimeNumber_EasierVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        if(number <= 1) System.out.print("Neither Prime nor Composite.");
        else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++)
                if (number % i == 0) { isPrime = false;break;}
            System.out.print(number + (isPrime ? " is Prime." : " is Composite."));
        }
    }
}