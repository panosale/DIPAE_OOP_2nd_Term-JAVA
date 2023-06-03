// Diasindesis - Pollapli klironomikotita
// ergastirio 10.2
public class Horse {
    private int age;
    private int weight;
    // Constructors
    public Horse() {

    }
    public Horse(int new_age, int new_weight) {
        this.age = new_age;
        this.weight = new_weight;

    }
    // Class methods
    public void whinny() {
        System.out.println("whinny");
    }
    public void gallop() {
        System.out.println("travel fast");
    }
    //Set-Get methods
    public void setAge(int new_age) {
        this.age = new_age;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int new_weight) {
        this.weight = new_weight;
    }

    public int getWeight() {
        return weight;
    }
    // toString method

    public String toString() {
        return "Horse. Age:" + this.age + ", Weight: " + this.weight;
    }
}
