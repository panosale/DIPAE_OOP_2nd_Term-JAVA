// Genikefsi - Polymorfismos
package ergastirio8;

public class Motorcycle extends Vehicle{
    private boolean diatheteiPlainoOxima;

    // Default Constructor
    public Motorcycle() {
        super();
    }
    public Motorcycle(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, 0, false);
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
    }

    // Full Constructor. Initialize object with full given values
    public Motorcycle(String new_idioktitis, String new_arKykloforias, int new_etosKat, boolean new_diatheteiPlainoOxima) {
        this.setIdioktitis(new_idioktitis);
        this.setArKykloforias(new_arKykloforias);
        this.setEtosKat(new_etosKat);
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
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

    // Convert all attributes to Sting
    public String toString() {
        return "Arithmos kykloforias: " + this.getArKykloforias() + ".\nOnoma Idioktiti: " + this.getIdioktitis() +
                ".\nEtos eisagogis: " + this.getEtosKat() + "\nDiathetei plaino oxima: " + this.diatheteiPlainoOxima;
    }
}
