package TASK;

public class task_03_ternary_operator2 {
    public static void main(String[] args) {
        int N1 = 25;
        int N2 = 42;
        int N3 = 17;

        int max = (N1 > N2)
                ? (N1 > N3 ? N1 : N3)
                : (N2 > N3 ? N2 : N3);

        System.out.println("Maximum is: " + max);
    }

}
