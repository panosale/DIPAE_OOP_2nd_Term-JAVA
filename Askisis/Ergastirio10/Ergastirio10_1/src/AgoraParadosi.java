// Diasindesis - Pollapli klironomikotita
// ergastirio 10.1
public class AgoraParadosi implements Asfalismeno{
    float posoAsfalisis;
    int ogkosAntikeimenou; // GIA ELEGXO
    int varosAntikeimenou; // GIA ELEGXO
    boolean isFragile;
    // Default constructor
    public AgoraParadosi() {}
    // Full constructor
    public AgoraParadosi(int new_varosAntikeimenou, int new_ogkosAntikeimenou) {
        this.posoAsfalisis = 0;
        this.varosAntikeimenou = new_varosAntikeimenou; // GIA ELEGXO
        this.ogkosAntikeimenou = new_ogkosAntikeimenou; // GIA ELEGXO
    }
    // Klaseis tou Interface ProsMetafora
    public long getVaros() {
        return this.varosAntikeimenou;
    }
    public boolean getIsFragile() {
        return this.isFragile;
    }
    // Klaseis tou Interface Asfalismeno
    public float getPosoAsfalisis() {
        return this.posoAsfalisis;
    }
    //    Get-Set isFragile
    public void setIsFragile(boolean new_isFragile) {
        this.isFragile = new_isFragile;
    }

}
