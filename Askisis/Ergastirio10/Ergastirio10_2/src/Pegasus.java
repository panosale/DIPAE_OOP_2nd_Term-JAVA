// Diasindesis - Pollapli klironomikotita
// ergastirio 10.2
public class Pegasus extends Horse implements iBird{
    private int age;
    private int weight;
    // Constructors
    public Pegasus() {

    }
    public Pegasus(int new_age, int new_weight) {
        this.age = new_age;
        this.weight = new_weight;

    }
    // Horse class methods
    public void whinny() {
        System.out.println("whinny");
    }
/* // Κληρονομείται από την υπερκλάση (Horse)
    public void gallop() {
        System.out.println("travel fast");
    }
*/
    // iBird interface methods
    public void chirp() {
        System.out.println("Pegasus doesn't chirp.");
    }
    public void fly() {
        System.out.println("fly high");
    }
    //Set-Get methods
    public void setAge(int new_age) {
        this.age = new_age;
    }
    public String toString() {
        return "Pegasus. Age:" + this.age + ", Weight: " + this.weight;
    }
}
