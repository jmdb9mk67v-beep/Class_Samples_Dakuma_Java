package warrior;
import java.security.SecureRandom;

public abstract class Warrior {
  protected SecureRandom randNum = new SecureRandom();
  private int health; // health points at 0 you are unsubscribed
  private int strength; //  how strong you are, determines damage you can do
  private int dexterity;  //  how fast, nimble you are basically movement

  public Warrior() { } // constructor

  // getters
  public int getHealth() {
    return this.health;  
  }
  public int getStrength() {
    return this.strength;
  }
  public int getDexterity() {
    return this.dexterity;
  }

  //  setters
  public void setHealth(int health) {
    this.health = health;
  }
  public void setStrength(int strength) {
    this.strength = strength;
  }
  public void setDexterity(int dexterity) {
    this.dexterity = dexterity;
  }    
} // End Class
