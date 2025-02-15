import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number as input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculating the factorial
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by the current number
        }

        // Printing the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}

