// Genikefsi - Polymorfismos
package ergastirio8;

public class Car extends Vehicle{
    private short arithmosThyron;

    // Default Constructor
    public Car() {
        super();
    }
    public Car(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, 0, (short)0);
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
    }

    // Full Constructor. Initialize object with full given values
    public Car(String new_idioktitis, String new_arKykloforias, int new_etosKat, short new_arithmosThyron) {
        this.setIdioktitis(new_idioktitis);
        this.setArKykloforias(new_arKykloforias);
        this.setEtosKat(new_etosKat);
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
        this.arithmosThyron = new_arithmosThyron;
        //this.setArithmosThyron(new_arithmosThyron);
    }

    public void drive() {
        System.out.println("You need a car driving license dear " + this.getIdioktitis());
    }

    // Get-Set Arithmos Thyron - DEN ZITITAI APO TIN ASKISI
/*    public short getArithmosThyron() {
        return this.arithmosThyron;
    }
    public void setArithmosThyron(short new_arithmosThyron) {
        this.arithmosThyron = new_arithmosThyron;
    }
*/
    // Convert all attributes to Sting
    public String toString() {
        return "Arithmos kykloforias: " + this.getArKykloforias() + ".\nOnoma Idioktiti: " + this.getIdioktitis() +
                ".\nEtos eisagogis: " + this.getEtosKat() + "\nArithmos thyron: " + this.arithmosThyron;
    }
}
