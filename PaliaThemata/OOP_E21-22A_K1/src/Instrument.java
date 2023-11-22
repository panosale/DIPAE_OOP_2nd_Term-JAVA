public class Instrument {
    private String desc;
    private int db;

    public Instrument() {
        this.desc = "Instrument";
        this.db = 20;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString() {
        Integer tmp = this.db;
        return tmp.toString();
    }
}
