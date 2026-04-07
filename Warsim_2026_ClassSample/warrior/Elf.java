
package warrior;

  public class Elf extends Warrior {
    private int minHealth = 180;
    private int bonusHealth = 220;  //  health range of 180 - 399
    private int minStrength = 75;
    private int bonusStrength = 120;
    private int minDexterity = 300;
    private int bonusDexterity = 300;

    public Elf() {
      super();
      super.setHealth(randNum.nextInt(this.bonusHealth) + this.minHealth);
      super.setStrength(randNum.nextInt(this.bonusStrength) + this.minStrength);
      super.setDexterity(randNum.nextInt(this.bonusDexterity) + this.minDexterity);
    }   // constructor
  } // End Class
