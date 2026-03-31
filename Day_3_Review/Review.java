
import java.util.Scanner;

public class Review {

    private static final int MAX_STUDENTS = 10; // cannot be changed!
                                         // 0,       1,        2
    private static String[] names = { "Billy", "Bobby", "Thorton" };
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // loops
        for(int i = 0; i < MAX_STUDENTS; i++) {
            // code
            if(i == 3) {
                continue; // skips the remainder of the iteration
            }
            else if(i == -1) {
                break; // exits the loop
            }
            else {
                // code
            }

            // code
        } // for


        for (String n : names) {
            // code
        }
        
        boolean gameOver = false;
        while(!gameOver) {
            // code
            gameOver = true;
        }
        
        do {
            // code runs at least once
            // logic to set gameOver = true
        } while(!gameOver);

        // pre vs post increment
        int num = 0;
        System.out.println(num++); // post: prints 0
        System.out.println(++num); // pre: prints 2

        input.close();
        
    } // main
} // class