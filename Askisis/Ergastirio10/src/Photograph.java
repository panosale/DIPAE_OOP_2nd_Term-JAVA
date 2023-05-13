public class Photograph {
    private String perigrafi;
    private float timi;
    private boolean egxromi;

    // Default constructor
    public Photograph() {}
    // Full constructor
    public Photograph(String new_perigrafi, float new_timi, boolean new_egxromi) {
        this.perigrafi = new_perigrafi;
        this.timi = new_timi;
        this.egxromi = new_egxromi;
    }

    public String toString() {
        return ("Perigrafi:" + this.perigrafi + ", Timi: " + this.timi + ", Egxromi: " + this.egxromi);
    }
}
