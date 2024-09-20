import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the TemperatureConverter class
        TemperatureConverter converter = new TemperatureConverter();
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Variable to control the while loop for exiting the program
        boolean exit = false;
        // Error message for invalid input
        String errorMsg = "Invalid input. Please enter a valid number: ";

        // Main loop for the menu
        while (!exit) {
            // Display the menu options to the user
            System.out.println("The Temperature Converter App");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            // Read the user's choice
            int choice = getValidIntegerInput(scanner, errorMsg);

            // Handle the user's choice using if-else statements
            if (choice == 1) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = getValidDoubleInput(scanner, errorMsg);
                double fahrenheit = converter.celsiusToFahrenheit(celsius);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            } else if (choice == 2) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = getValidDoubleInput(scanner, errorMsg);
                double celsius = converter.fahrenheitToCelsius(fahrenheit);
                System.out.println("Temperature in Celsius: " + celsius);
            } else if (choice == 3) {
                System.out.print("Enter temperature in Celsius: ");
                double celsius = getValidDoubleInput(scanner, errorMsg);
                double kelvin = converter.celsiusToKelvin(celsius);
                System.out.println("Temperature in Kelvin: " + kelvin);
            } else if (choice == 4) {
                System.out.print("Enter temperature in Kelvin: ");
                double kelvin = getValidDoubleInput(scanner, errorMsg);
                double celsius = converter.kelvinToCelsius(kelvin);
                System.out.println("Temperature in Celsius: " + celsius);
            } else if (choice == 5) {
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = getValidDoubleInput(scanner, errorMsg);
                double kelvin = converter.fahrenheitToKelvin(fahrenheit);
                System.out.println("Temperature in Kelvin: " + kelvin);
            } else if (choice == 6) {
                System.out.print("Enter temperature in Kelvin: ");
                double kelvin = getValidDoubleInput(scanner, errorMsg);
                double fahrenheit = converter.kelvinToFahrenheit(kelvin);
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            } else if (choice == 7) {
                exit = true;
                System.out.println("Exiting program. Goodbye!");
            } else {
                System.out.println(errorMsg);
            }
        }
        scanner.close();
    }

    // Method to get a valid integer input from the user
    private static int getValidIntegerInput(Scanner scanner, String errorMsg) {
        int choice = -1;
        boolean valid = false;
        while (!valid) {
            try {
                choice = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print(errorMsg);
                scanner.nextLine();
            }
        }
        return choice;
    }

    // Method to get a valid double input from the user
    private static double getValidDoubleInput(Scanner scanner, String errorMsg) {
        double value = -1;
        boolean valid = false;
        while (!valid) {
            try {
                value = scanner.nextDouble();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.print(errorMsg);
                scanner.nextLine();
            }
        }
        return value;
    }
}
