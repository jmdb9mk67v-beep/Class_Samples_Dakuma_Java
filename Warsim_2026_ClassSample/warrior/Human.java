package warrior;

public class Human extends Warrior {
  private int minHealth = 100;
  private int maxHealth = 180;
  private int minStrength = 100;
  private int maxStrength = 180;
  private int minDexterity = 100;
  private int maxDexterity = 180;

  public Human() {
    int health = randNum.nextInt(this.maxHealth) + this.minHealth;
    int strength = randNum.nextInt(this.maxStrength) + this.minStrength;
    int dexterity = randNum.nextInt(this.maxDexterity) + this.minDexterity;
    super.randNum.nextInt();
  }


} //  End Class