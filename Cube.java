import java.util.Scanner;

public class Cube {
    public static void perform(Scanner scanner) {
        try {
            System.out.print("Enter a number to cube: ");
            double a = scanner.nextDouble();
            System.out.println("Result: " + (a * a * a));
        } catch (Exception e) {
            System.out.println("Error in Cube: " + e.getMessage());
        }
    }
}

