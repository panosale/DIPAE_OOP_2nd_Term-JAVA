// Packages
// ergastirio 11.2
package Traffic;
public class Network {
    private String description;
    public Network() {
        System.out.println("Default constructor : This is a Traffic Network");
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
        return "toString : Τhis network is used by vehicles";
    }
}
