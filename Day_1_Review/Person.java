
public class Person {
    private String name; // default value of null

    // constructor, it's a special class that's called
    // when you create an instance of a thing/object
    public Person(String name) {
        this.name = name;
    } // constructor()

    public String getName() {
        return "Hi " + this.name;
    } // getName()

    public void setName(String name) {
        this.name = name;
    } // setName()
} // class