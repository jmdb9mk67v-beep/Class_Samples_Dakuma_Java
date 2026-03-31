
import java.util.Scanner;
import java.security.SecureRandom;

public class BiggestNumber {

    public static void main(String[] args) {
        Scanner einstien = new Scanner(System.in);
        SecureRandom randNum = new SecureRandom();

        System.out.print("Enter a number from 1 - 10");
        int guess = einstien.nextInt();

        if(randNum.nextInt(10) + 1 == guess)
            System.out.print("You are so smrt!%n");

        System.out.print("Enter 3 number (with decimals) with a space between each: ");
        double num1 = einstien.nextDouble();
        double num2 = einstien.nextDouble();
        double num3 = einstien.nextDouble();
        double num4 = einstien.nextDouble();

        System.out.println("The biggest number is: " + biggestNumber(num1, num2, num3, num4));
        System.out.println("The biggest number is: " + Math.max(num1, Math.max( num2, num3)));

        einstien.close(); // has entered the black hole
    } // main

    // function
    private static double biggestNumber(double n1, double n2, double n3, double n4) {
        double largest = n1;

        if(n2 > largest)
            largest = n2;
        
        if(n3 > largest)
            largest = n3; 

        if(n4 > largest)
            largest = n4;

        return largest;
    } // biggestNumber()
} // class