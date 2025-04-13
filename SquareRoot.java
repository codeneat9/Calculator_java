import java.util.Scanner;

public class SquareRoot {
    public static void perform(Scanner scanner) {
        try {
            System.out.print("Enter a number to find the square root: ");
            double a = scanner.nextDouble();
            if (a < 0) throw new ArithmeticException("Cannot calculate square root of a negative number!");
            System.out.println("Result: " + Math.sqrt(a));
        } catch (ArithmeticException ae) {
            throw ae;
        } catch (Exception e) {
            System.out.println("Error in SquareRoot: " + e.getMessage());
        }
    }
}
