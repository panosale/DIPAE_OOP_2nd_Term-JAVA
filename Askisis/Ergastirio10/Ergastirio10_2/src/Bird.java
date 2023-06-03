// Diasindesis - Pollapli klironomikotita
// ergastirio 10.2
public class Bird implements iBird {
    private int age;
    private int weight;
    // Constructors
    public Bird() {

    }
    public Bird(int new_age, int new_weight) {
        this.age = new_age;
        this.weight = new_weight;

    }
    // Class methods
    public void chirp() {
        System.out.println("chirp...");
    }
    public void fly() {
        System.out.println("fly high");
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

    @Override
    public String toString() {
        return "Bird. Age:" + this.age + ", Weight: " + this.weight;
    }
}
