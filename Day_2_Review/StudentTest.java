
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Scanner elvis = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = elvis.nextLine();
        System.out.print("How old are you? ");
        int age = elvis.nextInt();
        Student student = new Student(name, age);


        while(age <= 65) {
            System.out.print("Keep working!");
            age += 5; // add 5 to age!
        }

        // print student details
        // %s = string %d = decimal integer %f = floating-point number %n = newline
        System.out.printf("%s%n", student.greeting());
        elvis.close();

    } // main

} // class