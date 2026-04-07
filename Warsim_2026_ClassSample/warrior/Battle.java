

import  util.*;
import warrior.*; // imports Warrior, Human, Elf and Orc
import java.util.Scanner;
import java.security.SecureRandom;

public class Battle {
  private static Ink ink = new Ink();
  private static Scanner nInput = new Scanner(System.in);
  private static SecureRandom randNum = new SecureRandom();
  private static Warrior pWarrior;  //  player
  private static Warrior eWarrior;  //  enemy


  public static void main(String[] args) {
    ink.printWelcome();

    // Player setup
    ink.printWarriorSelectionMenu();
    int choice = nInput.nextInt();
    createWarrior(choice, "Player");

    //  Enemy Setup
    createWarrior(randNum.nextInt(3) + 1, "Enemy");

    // print stats
    ink.printStats(pWarrior, eWarrior);

  } //  End Main

// Helper Methods
  private static void createWarrior(int choice, String who) {
    switch (choice) {
      case 1: // human
      if(who.equals("Player")) {
        pWarrior = new Human();
      } else {
        eWarrior = new Human();
      }
      break;
      case 2: //  elf
      if(who.equals("Player")) {
        pWarrior = new Elf();
      } else {
        eWarrior = new Elf();
      }
      break;
      case 3: //  orc
      if(who.equals("Player")) {
        eWarrior = new Orc();
      }
      break;
    } // End Switch
  } // End createWarrior()

} // End Class
