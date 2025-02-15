import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the number as input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if the number is prime
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            for (int i = 2; i <= number / 2; i++) { // Check divisors up to number / 2
                if (number % i == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break;
                }
            }
        }

        // Printing the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
