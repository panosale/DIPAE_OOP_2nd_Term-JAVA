// Diasindesis - Pollapli klironomikotita
// ergastirio 10.1
public class Photograph implements ProsPolisi{
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
    // Implementation tou Interface ProsPolisi
    public String getPerigrafi() {
        return this.perigrafi;
    }
    public long getTimiKatalogou() {
        return (long)(this.timi * 100);
    }
    public long getChamiloteriApodektiTimi(int posostoEpiTisTimis) {
        return (long)(this.getTimiKatalogou() * (float)posostoEpiTisTimis / 100);
    }
    //    Get-Set perigrafi
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
    //    Get-Set egxromi
    public boolean getEgxromi() {
        return this.egxromi;
    }
    public void setEgxromi(boolean new_egxromi) {
        this.egxromi = new_egxromi;
    }
    public String toString() {
        return ("Περιγραφή: " + this.perigrafi + ", Τιμή: " + this.timi + ", Έγχρωμη: " + this.egxromi);
    }
}
