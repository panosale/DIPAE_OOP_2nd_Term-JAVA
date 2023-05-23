public class ErgoTexnis {
    private String perigrafi;
    private float timi;
    // Default constructor
    public ErgoTexnis() {
        super();
    }
    // Full constructor
    public ErgoTexnis(String new_perigrafi, float new_timi) {
        this.setPerigrafi(new_perigrafi);
        this.setTimi(new_timi);
    }

    //    Get-Set perigrafi
    public String getPerigrafi() {
        return this.perigrafi;
    }
    public void setPerigrafi(String new_perigrafi) {
        this.perigrafi = new_perigrafi;
    }
    //    Get-Set timi
    public float getTimi() {
        return this.timi;
    }
    public void setTimi(float new_timi) {
        this.timi = new_timi;
    }
    public String toString() {
        return ("Perigrafi:" + this.perigrafi + ", Timi: " + this.timi);
    }

}
