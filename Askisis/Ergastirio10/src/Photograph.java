public class Photograph extends ErgoTexnis{
    private boolean egxromi;

    // Default constructor
    public Photograph() {
        super();
    }
    // Full constructor
    public Photograph(String new_perigrafi, float new_timi, boolean new_egxromi) {
        super(new_perigrafi, new_timi);
        this.egxromi = new_egxromi;
    }

    //    Get-Set egxromi
    public boolean getTexnotropia() {
        return this.egxromi;
    }
    public void setTexnotropia(boolean new_egxromi) {
        this.egxromi = new_egxromi;
    }
    public String toString() {
        return (super.toString() + ", Egxromi: " + this.egxromi);
    }
}
