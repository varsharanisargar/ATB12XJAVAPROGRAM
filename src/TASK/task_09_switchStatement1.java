package TASK;
import java.util.Scanner;
public class task_09_switchStatement1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int days;

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;

            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;

            case 2:  // February
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;

            default:
                System.out.println("Invalid month number. Please enter a value from 1 to 12.");
                return;
        }

        System.out.println("Number of days: " + days);
    }

}
