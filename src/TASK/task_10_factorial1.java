package TASK;
import java.util.Scanner;
public class task_10_factorial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative number: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive number ");
            return;
        }

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
