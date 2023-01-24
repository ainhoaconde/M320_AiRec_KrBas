import java.util.ArrayList;

abstract public class Person {
    private String first_name;
    private String last_name;
    private int Age;

    public Person(String first_name, String last_name, int Age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.Age = Age;
    }

    public void showDetails() {
        System.out.println("First name: " + first_name);
        System.out.println("Last name: " + last_name);
        System.out.println("Age: " + Age);
    }
}
