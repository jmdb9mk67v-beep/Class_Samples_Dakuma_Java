
import java.util.Scanner;

public class Lunch {

    public static void main(String[] args) {
        Scanner elvis = new Scanner(System.in);
        Lunchbox lunchbox = new Lunchbox(); // creates an instance of a lunchbox

        // prompt the user/client to pack a lunch
        System.out.println("Pack a lunch? 1) Yes 2) No");
        int choice = elvis.nextInt();

        if(choice == 1) { // pack a lunch
            boolean isDone = false;
            
            lunchbox.packLunch(); // picks random items
            lunchbox.printLunch(); // prints the items

            while(!isDone) {
                System.out.printf("%nChange Item:%n1) Sandwich%n2) Drink%n3) Dessert%n4) Keep lunch%n");
                int pick = elvis.nextInt();
                switch (pick) {
                    case 1:
                        lunchbox.pickSandwich(); // picks a random sandwich
                        break;
                    case 2:
                        lunchbox.pickDrink(); // picks a random drink
                        break;
                    case 3:
                        lunchbox.pickDessert(); // picks a random dessert
                        break;
                    case 4:
                        isDone = true; // very very important!
                        break;
                    default:
                        System.out.println("oops");
                        break;
                } // switch
                lunchbox.printLunch();
            } // while
            System.out.println("Enjoy your lunch and have a great day!");
        }
        else {
            System.out.println("Enjoy McDonald's!");
        }

        elvis.close(); // has left the building...
    } // main
} // class