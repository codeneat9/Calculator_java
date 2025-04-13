import java.util.Scanner;

public class Division {
    public static void perform(Scanner scanner) {
        try {
            System.out.print("Enter two numbers to divide: ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
            System.out.println("Result: " + (a / b));
        } catch (ArithmeticException ae) {
            throw ae;
        } catch (Exception e) {
            System.out.println("Error in Division: " + e.getMessage());
        }
    }
}
