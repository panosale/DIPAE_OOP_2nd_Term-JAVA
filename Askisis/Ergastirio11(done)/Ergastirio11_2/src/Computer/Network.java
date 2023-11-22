// Packages
// ergastirio 11.2
package Computer;
public class Network {
    private String description;
    public Network() {
        System.out.println("Default constructor : This is a Data Network");
    }
    public Network(String new_description) {
        this.description = new_description;
    }
    public void setDescription(String new_description) {
        this.description = new_description;
    }
    public String getDescription() {
        return this.description;
    }
    public String toString() {
        return "toString : This network carries bits and bytes";
    }
}
