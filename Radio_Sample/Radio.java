
import java.util.Scanner;

public class Radio {

    public static void main(String[] args) {
        Scanner elvis = new Scanner(System.in);

        System.out.print("What is the song you would like to hear? ");
        String title = elvis.nextLine();

        Song song = new Song(title);

        System.out.printf("Now playing: %s%n", song.getTitle());

        elvis.close(); // elvis has left the building...
    } // main
} // class