// Name: Yashwith
// PRN: 23070126151
// Batch: AIML B3

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            try {
                System.out.println("\nCalculator Menu:");
                System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
                System.out.println("5. Square\n6. Cube\n7. Square Root\n8. Exit");
                System.out.print("Choose an option (1-8): ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> Addition.perform(scanner);
                    case 2 -> Subtraction.perform(scanner);
                    case 3 -> Multiplication.perform(scanner);
                    case 4 -> Division.perform(scanner);
                    case 5 -> Square.perform(scanner);
                    case 6 -> Cube.perform(scanner);
                    case 7 -> SquareRoot.perform(scanner);
                    case 8 -> {
                        System.out.println("Exiting Calculator. Goodbye!");
                        keepRunning = false;
                    }
                    default -> throw new IllegalArgumentException("Invalid menu option! Please enter between 1 and 8.");
                }
