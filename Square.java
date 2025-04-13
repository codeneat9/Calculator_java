import java.util.Scanner;

public class Square {
    public static void perform(Scanner scanner) {
        try {
            System.out.print("Enter a number to square: ");
            double a = scanner.nextDouble();
            System.out.println("Result: " + (a * a));
        } catch (Exception e) {
            System.out.println("Error in Square: " + e.getMessage());
        }
    }
}
