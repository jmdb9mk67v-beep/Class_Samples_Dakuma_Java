
import java.util.Scanner; // include the package to get input into application

public class WelcomeSample {
  public static void main(String[] args) {
    // creates a scanner object used for input
    Scanner inputThang = new Scanner(System.in); 

    // prompt for a number
    System.out.print("Enter a number: ");
    // ints are whole number, no decimals, for that you need float, double etc...
    int num1 = inputThang.nextInt(); // pauses program waiting for input
    
    // prints
    System.out.printf("%s %d%n", "You entered", num1);

    inputThang.close(); // closes the scanner
  } // main
} // class