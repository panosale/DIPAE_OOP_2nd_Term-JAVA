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
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
    }

    // Full Constructor. Initialize object with full given values
    public Truck(String new_idioktitis, String new_arKykloforias, int new_etosKat, short new_arithmosAksonon) {
        this.setIdioktitis(new_idioktitis);
        this.setArKykloforias(new_arKykloforias);
        this.setEtosKat(new_etosKat);
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
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

    // Convert all attributes to Sting
    public String toString() {
        return "Arithmos kykloforias: " + this.getArKykloforias() + ".\nOnoma Idioktiti: " + this.getIdioktitis() +
                ".\nEtos eisagogis: " + this.getEtosKat() + "\nArithmos aksonon: " + this.arithmosAksonon;
    }
}
