// Genikefsi - Polymorfismos
package ergastirio8;

public class Car extends Vehicle{
    private short arithmosThyron;

    // Default Constructor
    public Car() {
        super(); // GIA EROTISI
    }
    public Car(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, 0, (short)0);
        this.eng = new Mihani(); // GIA EROTISI. this H super? -> this.
        this.sysdief = new SystimaDieythynsis(); // GIA EROTISI. this H super? -> this.
    }

    // Full Constructor. Initialize object with full given values *** GIA ELEGXO & DIORTHOSI
    public Car(String new_idioktitis, String new_arKykloforias, int new_etosKat, short new_arithmosThyron) {
        this.setIdioktitis(new_idioktitis); // GIA EROTISI. this H super? -> this.
        this.setArKykloforias(new_arKykloforias);  // GIA EROTISI. this H super? -> this.
        this.setEtosKat(new_etosKat); // GIA EROTISI. this H super? -> this.
        this.eng = new Mihani(); // GIA EROTISI. this H super? -> this.
        this.sysdief = new SystimaDieythynsis(); // GIA EROTISI. this H super? -> this.
        this.setArithmosThyron(new_arithmosThyron);
    }

    public void drive() {
        System.out.println("You need a car driving license dear " + this.getIdioktitis());
    }

    // Get-Set Arithmos Thyron
    public short getArithmosThyron() {
        return this.arithmosThyron;
    }
    public void setArithmosThyron(short new_arithmosThyron) {
        this.arithmosThyron = new_arithmosThyron;
    }

}
