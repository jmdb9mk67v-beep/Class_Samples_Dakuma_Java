
import java.util.Scanner;

public class AverageGrade {
    private static int numberOfStudents = 10;

    public static void main(String[] args) {
        Scanner elvis = new Scanner(System.in);

        int gradeTotal = 0;

        // i means iterator
        for(int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the grade: ");
            int grade = elvis.nextInt();
            gradeTotal += grade;
        }

        System.out.printf("The class average is: %d%n", 
            gradeTotal / numberOfStudents);

        elvis.close();
    } // main
} // class