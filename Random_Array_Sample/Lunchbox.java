
import java.security.SecureRandom;

public class Lunchbox {
    // sandwiches[3] = Turkey        // 0,       1,        2... length 6
    private String[] sandwiches = { "Ham", "Cheese", "PB & J", "Turkey", "Chicken", "Spam" };
    private String[] drinks = { "Water", "Pop", "Juice", "Milk" };
    private String[] desserts = { "Pie", "Cake", "Cookies", "Candy", "Chocolate", "Donuts" };
    private String sandwich;
    private String drink;
    private String dessert;
    private SecureRandom randNum = new SecureRandom();

    public Lunchbox() {
        // empty
    } // constructor

    // getters
    public String getSandwich() {
        return this.sandwich;
    }
    public void printSandwiches() {
        for(int i = 0; i < sandwiches.length; i++) {
            System.out.println(sandwiches[i]);
        } // for
    }
    public String getDrink() {
        return this.drink;
    }
    public String getDessert() {
        return this.dessert;
    }
    public void printLunch() {
        System.out.printf("Your Lunch:%nSandwich: %s%nDrink: %s%nDessert: %s%n",
            this.sandwich, this.drink, this.dessert);
    }

    // setters
    public void pickSandwich() {
        // sandwiches[1] = cheese
        this.sandwich = sandwiches[randNum.nextInt(sandwiches.length)];
    }
    public void pickDrink() {
        this.drink = drinks[randNum.nextInt(drinks.length)];
    }
    public void pickDessert() {
        this.dessert = desserts[randNum.nextInt(desserts.length)];
    }
    public void packLunch() {
        pickSandwich();
        pickDrink();
        pickDessert();
    }

} // class