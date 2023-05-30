// Diasindesis - Pollapli klironomikotita
// ergastirio 10.1
public class AgoraParadosi implements Asfalismeno{
    private ProsPolisi ergoProsPolisi;
    public float timi;
    private float posoAsfalisis;
    private int ogkos;
    private int varos;
    private boolean isFragile;
    // Default constructor
    public AgoraParadosi() {}
    // Full constructor
    public AgoraParadosi(ProsPolisi new_ergo, float new_timi) {
        this.ergoProsPolisi = new_ergo;
        this.timi = new_timi;
    }
    // Full constructor
    public AgoraParadosi(ProsPolisi new_ergo, float new_timi, int new_varos, int new_ogkos, boolean new_isFragile, float new_posoAsfalisis) {
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
        return (long)(this.getTimiKatalogou() * (float)posostoEpiTisTimis / 100);
    }
    // Implementation tou Interface ProsMetafora
    public long getVaros() {
        return this.varos;
    }
    public boolean getIsFragile() {
        return this.isFragile;
    }
    // Implementation tou Interface Asfalismeno
    public float posoAsfalisis() {
        return this.timi / 10;
    }
    //    Get-Set isFragile
    public void setIsFragile(boolean new_isFragile) {
        this.isFragile = new_isFragile;
    }

}
