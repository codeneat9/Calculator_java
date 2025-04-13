import java.util.Scanner;

public class Addition {
    public static void perform(Scanner scanner) {
        try {
            System.out.print("Enter two numbers to add: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Result: " + (a + b));
        } catch (Exception e) {
            System.out.println("Error in Addition: " + e.getMessage());
        }
    }
}
