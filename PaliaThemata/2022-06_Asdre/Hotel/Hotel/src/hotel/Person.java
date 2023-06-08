package hotel;

/**
 *
 * @author Panagiotis
 */
public class Person {
    private String name;
    
    public Person() {
        // Default constructor
    }
    public Person(String new_staffsName) {
        // Full constructor
        this.name = new_staffsName;
    }
    public void startServing() {
        System.out.println(this.name + ": start serving.");
    }
    // Set-Get methods
    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return this.name;
    }
    // toString method
    public String toString() {
        return "Staff's name: " + this.name;
    }
}
