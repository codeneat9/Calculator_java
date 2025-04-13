import java.util.Scanner;

public class Subtraction {
    public static void perform(Scanner scanner) {
        try {
            System.out.print("Enter two numbers to subtract: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println("Result: " + (a - b));
        } catch (Exception e) {
            System.out.println("Error in Subtraction: " + e.getMessage());
        }
    }
}
