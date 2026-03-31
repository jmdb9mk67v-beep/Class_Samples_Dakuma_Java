
import java.util.Scanner;

public class ReviewSample {
    public static void main(String[] args) {

        Scanner elvis = new Scanner(System.in);

        System.out.print("Hello what is your name? ");
        String name = elvis.nextLine();

        Person person = new Person(name);
        System.out.println(person.getName());

        System.out.print("Enter the 1st number: ");
        int number1 = elvis.nextInt();

        System.out.print("Enter the 2nd number: ");
        int number2 = elvis.nextInt();

        int total = number1 + number2;

        System.out.printf("%d + %d is %d%n", number1, number2, total);

        elvis.close();
    } // main
} // class