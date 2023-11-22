public class Strings extends Instrument{
    private String desc;

    public Strings() {
        this.desc = "Strings";
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString() {
        return this.desc;
    }
}
