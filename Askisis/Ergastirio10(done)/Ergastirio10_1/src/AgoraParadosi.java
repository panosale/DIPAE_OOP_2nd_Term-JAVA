// Diasindesis - Pollapli klironomikotita
// ergastirio 10.1
public class AgoraParadosi implements Asfalismeno{
    private ProsPolisi ergoProsPolisi;
    public double timi;
    private double posoAsfalisis;
    private double varos;
    private double ogkos;
    private boolean isFragile;
    // Default constructor
    public AgoraParadosi() {}
    // Full constructor
    public AgoraParadosi(ProsPolisi new_ergo, double new_timi) {
        this.ergoProsPolisi = new_ergo;
        this.timi = new_timi;
    }
    // Full constructor
    public AgoraParadosi(ProsPolisi new_ergo, double new_timi, double new_varos, double new_ogkos, boolean new_isFragile, double new_posoAsfalisis) {
        this(new_ergo, new_timi);
        this.varos = new_varos;
        this.ogkos = new_ogkos;
        this.isFragile = new_isFragile;
        this.posoAsfalisis = new_posoAsfalisis;
    }
    // Implementation tou Interface ProsPolisi
    public String getPerigrafi() {
        return ergoProsPolisi.getPerigrafi();
    }
    public long getTimiKatalogou() {
        return (long)(this.timi * 100);
    }
    public long getChamiloteriApodektiTimi(int posostoEpiTisTimis) {
        return (long)(this.getTimiKatalogou() * (double)posostoEpiTisTimis / 100);
    }
    // Implementation tou Interface ProsMetafora
    public double getVaros() {
        return this.varos;
    }
    public boolean getIsFragile() {
        return this.isFragile;
    }
    // Implementation tou Interface Asfalismeno
    public double posoAsfalisis() {
        return this.timi / 10;
    }
    //    Get-Set methods
    public void setErgoProsPolisi(ProsPolisi new_ergoProsPolisi) {
        this.ergoProsPolisi = new_ergoProsPolisi;
    }
    public ProsPolisi getErgoProsPolisi() {
        return this.ergoProsPolisi;
    }
    public void setTimi(double new_timi) {
        this.timi = new_timi;
    }
    public void setPosoAsfalisis(double new_posoAsfalisis) {
        this.posoAsfalisis = new_posoAsfalisis;
    }
    public void setVaros(double new_varos) {
        this.ogkos = new_varos;
    }
    public void setOgkos(double new_ogkos) {
        this.ogkos = new_ogkos;
    }
    public void setIsFragile(boolean new_isFragile) {
        this.isFragile = new_isFragile;
    }
    public String toString() {
        return ("Περιγραφή: " + this.ergoProsPolisi.getPerigrafi() + "\nΤιμή καταλόγου: " + this.ergoProsPolisi.getTimiKatalogou() +
                ", Τιμή: " +  this.timi + ", Βάρος: " + this.varos + ", Όγκος: " + this.ogkos + ", Εύθραυστο: " + this.isFragile);
    }
}
