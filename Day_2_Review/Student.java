
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    } // constructor

    // getters
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String greeting() {
        int yearsLeft = 85 - this.age;
        return "Welcome " + this.name + " you can retire in " + yearsLeft + " years.";
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
} // class