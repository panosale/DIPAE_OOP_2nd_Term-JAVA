public class Wind extends Instrument{
    private String desc;

    public Wind() {
        this.desc = "Wind";
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
