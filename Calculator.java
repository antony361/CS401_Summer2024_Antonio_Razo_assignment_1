import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");

        while (true) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter the operation number: ");
            int choice = scanner.nextInt();

            double result;
            String operation = "";

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    operation = " + ";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = " - ";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = " * ";
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        operation = " / ";
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid choice. Please select 1, 2, 3, or 4.");
                    continue;
            }

            System.out.println("Result: " + num1 + operation + num2 + " = " + result);
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String continueCalc = scanner.next();

            if (!continueCalc.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}
