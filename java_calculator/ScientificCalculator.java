import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class implements a simple Scientific Calculator with a menu-driven interface.
 * It allows users to perform basic arithmetic operations and calculate areas of
 * a rectangle and a circle.
 */
public class ScientificCalculator {

    // Scanner object for reading user input
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Main method to run the calculator program.
     * It displays the menu, takes user input, and calls appropriate methods.
     */
    public static void main(String[] args) {
        int choice;
        do {
            displayMenu(); // Show the calculator menu
            choice = getUserChoice(); // Get user's operation choice

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performDivision();
                    break;
                case 4:
                    performMultiplication();
                    break;
                case 5:
                    performModulus();
                    break;
                case 6:
                    calculateRectangleArea();
                    break;
                case 7:
                    calculateCircleArea();
                    break;
                case 8:
                    System.out.println("Exiting calculator. Great Calculations!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
            System.out.println("\n----------------------------------------\n"); // Separator for better readability
        } while (choice != 8); // Continue loop until user chooses to exit

        scanner.close(); // Close the scanner to prevent resource leaks
    }

    /**
     * Displays the main menu of the Scientific Calculator.
     */
    public static void displayMenu() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("         SCIENTIFIC CALCULATOR");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("1 . Addition");
        System.out.println("2 . Subtraction");
        System.out.println("3 . Division");
        System.out.println("4 . Multiplication");
        System.out.println("5 . Modulus");
        System.out.println("6 . Area of a rectangle");
        System.out.println("7 . Area of a circle");
        System.out.println("8 . Exit");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.print("Enter your choice: ");
    }

    /**
     * Prompts the user to enter their choice and handles invalid input.
     * @return The integer choice entered by the user.
     */
    public static int getUserChoice() {
        int choice = -1; // Initialize with an invalid choice
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // Consume the invalid input to prevent an infinite loop
        }
        return choice;
    }

    /**
     * Prompts the user for two numbers and performs addition.
     */
    public static void performAddition() {
        System.out.print("Enter first number: ");
        double num1 = getDoubleInput();
        System.out.print("Enter second number: ");
        double num2 = getDoubleInput();
        double result = num1 + num2;
        System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
    }

    /**
     * Prompts the user for two numbers and performs subtraction.
     */
    public static void performSubtraction() {
        System.out.print("Enter first number: ");
        double num1 = getDoubleInput();
        System.out.print("Enter second number: ");
        double num2 = getDoubleInput();
        double result = num1 - num2;
        System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
    }

    /**
     * Prompts the user for two numbers and performs division.
     * Includes error handling for division by zero.
     */
    public static void performDivision() {
        System.out.print("Enter dividend: ");
        double num1 = getDoubleInput();
        System.out.print("Enter divisor: ");
        double num2 = getDoubleInput();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        }
    }

    /**
     * Prompts the user for two numbers and performs multiplication.
     */
    public static void performMultiplication() {
        System.out.print("Enter first number: ");
        double num1 = getDoubleInput();
        System.out.print("Enter second number: ");
        double num2 = getDoubleInput();
        double result = num1 * num2;
        System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
    }

    /**
     * Prompts the user for two numbers and performs modulus operation.
     * Includes error handling for modulus by zero.
     */
    public static void performModulus() {
        System.out.print("Enter first number (dividend): ");
        double num1 = getDoubleInput();
        System.out.print("Enter second number (divisor): ");
        double num2 = getDoubleInput();

        if (num2 == 0) {
            System.out.println("Error: Modulus by zero is not allowed.");
        } else {
            double result = num1 % num2;
            System.out.println("Result: " + num1 + " % " + num2 + " = " + result);
        }
    }

    /**
     * Prompts the user for length and width and calculates the area of a rectangle.
     */
    public static void calculateRectangleArea() {
        System.out.print("Enter length of the rectangle: ");
        double length = getDoubleInput();
        System.out.print("Enter width of the rectangle: ");
        double width = getDoubleInput();

        if (length < 0 || width < 0) {
            System.out.println("Error: Length and width cannot be negative.");
        } else {
            double area = length * width;
            System.out.println("Area of rectangle: " + area);
        }
    }

    /**
     * Prompts the user for the radius and calculates the area of a circle.
     */
    public static void calculateCircleArea() {
        System.out.print("Enter radius of the circle: ");
        double radius = getDoubleInput();

        if (radius < 0) {
            System.out.println("Error: Radius cannot be negative.");
        } else {
            // Using Math.PI for more accurate PI value
            double area = Math.PI * radius * radius;
            System.out.println("Area of circle: " + area);
        }
    }

    /**
     * Helper method to get a double input from the user, handling invalid input.
     * @return The double value entered by the user.
     */
    private static double getDoubleInput() {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number: ");
                scanner.next(); // Consume the invalid input
            }
        }
    }
}
