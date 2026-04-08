package warrior;

public class Human extends Warrior {
  private int minHealth = 100;
  private int bonusHealth = 180;  // health range of 100 - 279
  private int minStrength = 100;
  private int bonusStrength = 180;
  private int minDexterity = 100;
  private int bonusDexterity = 180;

  public Human() {
    super(); // must be the first statement in constructor
    super.setHealth(randNum.nextInt(this.bonusHealth) + this.minHealth);
    super.setStrength(randNum.nextInt(this.bonusStrength) + this.minStrength);
    super.setDexterity(randNum.nextInt(this.bonusDexterity) + this.minDexterity);
  } // constructor


} //  End Class