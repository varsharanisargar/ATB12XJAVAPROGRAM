package TASK;

public class task_04_ternary_operator3 {
    public static void main(String[] args) {
        int age = 70;  // You can change this value to test different ages

        String category = (age <= 18)
                ? "Minor"
                : (age > 65
                ? "Senior"
                : "Adult");

        System.out.println("You are a(n): " + category);
    }
}
