
package warrior;

public class Orc extends Warrior {
  private int minHealth = 250;
  private int bonusHealth = 350; // health range of 250 - 599
  private int minStrength = 175;
  private int bonusStrength = 220;
  private int minDexterity = 50;
  private int bonusDexterity = 50;

  public Orc() {
    super();
    super.setHealth(randNum.nextInt(this.bonusHealth) + this.minHealth);
    super.setStrength(randNum.nextInt(this.bonusStrength) + this.minStrength);
    super.setDexterity(randNum.nextInt(this.bonusDexterity)+ this.minDexterity);
  } // constructor
} // class
