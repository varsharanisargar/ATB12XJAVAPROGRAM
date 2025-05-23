package TASK;
import java.util.Scanner;
public class task_08_logicalHackerRank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides
        System.out.print("Enter side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = scanner.nextInt();

        // Check if it's a valid triangle first
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {

            // Classification
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }

        } else {
            System.out.println("The values do not form a valid triangle.");
        }

        scanner.close();
    }
}
