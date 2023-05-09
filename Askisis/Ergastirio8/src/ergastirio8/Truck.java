// Genikefsi - Polymorfismos
package ergastirio8;

public class Truck extends Vehicle{
    private short arithmosAksonon;

    // Default Constructor
    public Truck() {
        super();
    }

    // Semi constructor
    public Truck(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, 0, (short)0);
        this.eng = new Mihani(); // GIA EROTISI. this H super? -> this.
        this.sysdief = new SystimaDieythynsis(); // GIA EROTISI. this H super? -> this.
    }

    // Full Constructor. Initialize object with full given values *** GIA ELEGXO & DIORTHOSI
    public Truck(String new_idioktitis, String new_arKykloforias, int new_etosKat, short new_arithmosAksonon) {
        this.setIdioktitis(new_idioktitis); // GIA EROTISI. this H super? -> this.
        this.setArKykloforias(new_arKykloforias);  // GIA EROTISI. this H super? -> this.
        this.setEtosKat(new_etosKat); // GIA EROTISI. this H super? -> this.
        this.eng = new Mihani(); // GIA EROTISI. this H super? -> this.
        this.sysdief = new SystimaDieythynsis(); // GIA EROTISI. this H super? -> this.
        this.setArithmosAksonon(new_arithmosAksonon);
    }

    public void drive() {
        System.out.println("You must be a professional driver. This is a " + this.getArithmosAksonon() + " axels truck Mr. " + this.getIdioktitis() + ".");
    }

    // Get-Set Arithmos Aksonon
    public short getArithmosAksonon() {
        return this.arithmosAksonon;
    }
    public void setArithmosAksonon(short new_arithmosAksonon) {
        this.arithmosAksonon = new_arithmosAksonon;
    }

}
