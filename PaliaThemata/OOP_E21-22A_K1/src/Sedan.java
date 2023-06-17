// 2.I
public class Sedan extends Car {
    private String type;
    public Sedan(){
        this.type = "Sedan";
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
