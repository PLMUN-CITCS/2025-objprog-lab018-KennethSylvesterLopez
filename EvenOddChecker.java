import java.util.Scanner;

public class EvenOddChecker {
    // Main method
    public static void main(String[] args) {
        // Get an integer from the user
        int number = getIntegerInput();

        // Check if the number is even or odd
        String result = checkEvenOrOdd(number);

        // Display the result
        System.out.println(result);
    }

    // Method to get an integer input from the user
    public static int getIntegerInput() {
        Scanner input = new Scanner(System.in);
        int number = 0;

        // Loop until valid integer input is provided
        while (true) {
            try {
                // Prompt the user to enter an integer
                System.out.print("Enter an integer: ");
                number = Integer.parseInt(input.nextLine());
                break; // Valid integer, exit loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        
        return number;
    }

    // Method to check if the number is even or odd
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return number + " is an Even number.";
        } else {
            return number + " is an Odd number.";
        }
    }
}
