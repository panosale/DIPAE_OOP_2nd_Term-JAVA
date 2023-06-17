// 2.I
public class Coupe extends Car {
    private String type;
    public Coupe(){
        this.type = "Coupe";
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return this.type;
    }
}
