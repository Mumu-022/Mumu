import java.util.Scanner; //Import Scanner class for user input
public class Javatask { // Define the class
    public static void main(String[] args){ // Main method 
       Scanner input= new Scanner (System.in);// Set up Scanner for processing input data
       int number;// Variable to store the user's input number
       // Ask the user to enter a number
       System.out.print("Enter the Number:");
       number = input.nextInt();
       // Check if the number is even or odd
       if (number % 2 == 0) {
      System.out.println(number + " is even.");
    } else {
      System.out.println(number + " is odd.");
    }
    }
    
}