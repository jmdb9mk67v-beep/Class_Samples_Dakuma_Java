
package util;
import warrior.*;

public class Ink {

  public Ink() {}

  public void printWelcome() {
    System.out.println("######################");
    System.out.println("Welcome to Warsim 2026");
    System.out.println("######################");
  } //  printWelcome()

  public void printWarriorSelectionMenu() {
    System.out.println();
    System.out.println("=====================");
    System.out.println("1) Human");
    System.out.println("2) Elf");
    System.out.println("3) Orc");
  } //  printWarriorSelectionMenu()

  public void printStats(Warrior pWarrior, Warrior eWarrior) {
    //  print player stats
    System.out.printf(
      "%nPlayer Stats:%nHealth: %d%nStrength: %d%nDexterity: %d%n",
      pWarrior.getHealth(), pWarrior.getStrength(), pWarrior.getDexterity()
    );

    //  print enemy stats
    System.out.printf(
      "%nEnemy Stats:%nHealth: %d%nStrength: %d%nDexterity: %d%",
      eWarrior.getHealth(), eWarrior.getStrength(), eWarrior.getDexterity());
    
  } //  printStats()
} // End Class