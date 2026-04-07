package warrior;
import java.security.SecureRandom;

public abstract class Warrior {
  protected SecureRandom randNum = new SecureRandom();
  private int health; // health points at 0 you are unsubscribed
  private int strength; //  how strong you are, determines damage you can do
  private int dexterity;  //  how fast, nimble you are basically movement

  public Warrior(int health, int strength, int dexterity) {
    this.health = health;
    this.strength = strength;
    this.dexterity = dexterity;
  }
  
} // End Class
