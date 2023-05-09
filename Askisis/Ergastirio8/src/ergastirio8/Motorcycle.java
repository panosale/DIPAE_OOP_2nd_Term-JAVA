// Genikefsi - Polymorfismos
package ergastirio8;

public class Motorcycle extends Vehicle{
    private boolean diatheteiPlainoOxima;

    // Default Constructor
    public Motorcycle() {
        super(); // GIA EROTISI
    }
    public Motorcycle(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, 0, false);
        this.eng = new Mihani(); // GIA EROTISI. this H super? -> this.
        this.sysdief = new SystimaDieythynsis(); // GIA EROTISI. this H super? -> this.
    }

    // Full Constructor. Initialize object with full given values *** GIA ELEGXO & DIORTHOSI
    public Motorcycle(String new_idioktitis, String new_arKykloforias, int new_etosKat, boolean new_diatheteiPlainoOxima) {
        this.setIdioktitis(new_idioktitis); // GIA EROTISI. this H super?
        this.setArKykloforias(new_arKykloforias);  // GIA EROTISI. this H super?
        this.setEtosKat(new_etosKat); // GIA EROTISI. this H super?
        this.eng = new Mihani(); // // GIA EROTISI. this H super?
        this.sysdief = new SystimaDieythynsis(); // // GIA EROTISI. this H super?
        this.setDiatheteiPlainoOxima(new_diatheteiPlainoOxima);
    }

    public void drive() {
        System.out.println("Your car driving license is not enough. You need a special license dear " + this.getIdioktitis());
    }
    // Get-Set Diathetei Plaino Oxima
    public boolean getDiatheteiPlainoOxima() {
        return this.diatheteiPlainoOxima;
    }
    public void setDiatheteiPlainoOxima(boolean new_diatheteiPlainoOxima) {
        this.diatheteiPlainoOxima = new_diatheteiPlainoOxima;
    }

}
