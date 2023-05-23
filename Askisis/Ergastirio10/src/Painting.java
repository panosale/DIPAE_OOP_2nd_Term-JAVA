public class Painting extends ErgoTexnis implements ProsPolisi{
    private String texnotropia;

    // Default constructor
    public Painting() {}
    // Full constructor
    public Painting(String new_perigrafi, float new_timi, String new_texnotropia) {
        super(new_perigrafi, new_timi);
        this.texnotropia = new_texnotropia;
    }

    //    Get-Set texnotropia
    public String getTexnotropia() {
        return this.texnotropia;
    }
    public void setTexnotropia(String new_texnotropia) {
        this.texnotropia = new_texnotropia;
    }
    public String toString() {
        return (super.toString() + ", Texnotropia: " + this.texnotropia);
    }
}
