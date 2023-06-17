// 2.I
public class Suv extends Car {
    private String type;
    public Suv(){
        this.type = "Suv";
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
