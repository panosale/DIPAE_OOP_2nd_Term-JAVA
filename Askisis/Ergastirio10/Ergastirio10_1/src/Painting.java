// Diasindesis - Pollapli klironomikotita
// ergastirio 10.1
public class Painting implements ProsPolisi{
    private String perigrafi;
    private double timi;
    private String texnotropia;

    // Default constructor
    public Painting() {}
    // Full constructor
    public Painting(String new_perigrafi, double new_timi, String new_texnotropia) {
        this.perigrafi = new_perigrafi;
        this.timi = new_timi;
        this.texnotropia = new_texnotropia;
    }
    // Implementation tou Interface ProsPolisi
    public String getPerigrafi() {
        return this.perigrafi;
    }
    public long getTimiKatalogou() {
        return (long)(this.timi * 100);
    }
    public long getChamiloteriApodektiTimi(int posostoEpiTisTimis) {
        return (long)(this.getTimiKatalogou() * (double)posostoEpiTisTimis / 100);
    }
    //    Get-Set perigrafi
    public void setPerigrafi(String new_perigrafi) {
        this.perigrafi = new_perigrafi;
    }
    //    Get-Set timi
    public double getTimi() {
        return this.timi;
    }
    public void setTimi(double new_timi) {
        this.timi = new_timi;
    }
    //    Get-Set texnotropia
    public String getTexnotropia() {
        return this.texnotropia;
    }
    public void setTexnotropia(String new_texnotropia) {
        this.texnotropia = new_texnotropia;
    }
    public String toString() {
        return ("Περιγραφή: " + this.perigrafi + ", Τιμή: " + this.timi + ", Τεχνοτροπία: " + this.texnotropia);
    }
}
