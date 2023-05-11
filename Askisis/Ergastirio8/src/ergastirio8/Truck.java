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
        this(new_idioktitis, new_arKykloforias, -1, (short)0);
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
        this.arithmosAksonon = new_arithmosAksonon;

        this.setArithmosThyron((short) -1); // Dummy use just because is abstract in superclass
        this.setDiatheteiPlainoOxima(false); // Dummy use just because is abstract in superclass
    }

    public void drive() {
        System.out.println("You must be a professional driver. This is a " + this.arithmosAksonon + " axels truck Mr. " + this.getIdioktitis() + ".");
    }
    // ***** DUMMY METHODOI EPEIDI DILONONTAI STIN YPERKLASI - START *****
    public short getArithmosThyron() {
        return -1;
    }
    public void setArithmosThyron(short new_arithmosThyron) { this.setArithmosThyron((short)-1); }
    public boolean getDiatheteiPlainoOxima() {
        return false;
    }
    public void setDiatheteiPlainoOxima(boolean new_diatheteiPlainoOxima) { this.setDiatheteiPlainoOxima(false); }
    // ***** DUMMY METHODOI EPEIDI DILONONTAI STIN YPERKLASI - END *****

    // Get-Set Arithmos Aksonon - DEN ZITITAI APO TIN ASKISI
    public short getArithmosAksonon() {
        return this.arithmosAksonon;
    }
    public void setArithmosAksonon(short new_arithmosAksonon) {
        this.arithmosAksonon = new_arithmosAksonon;
    }
    // Convert all attributes to Sting
    public String toString() {
        return "Arithmos kykloforias: " + this.getArKykloforias() + ". Onoma Idioktiti: " + this.getIdioktitis() +
                ". Etos kataskevis: " + this.getEtosKat() + ". Arithmos aksonon: " + this.arithmosAksonon + ".";
//        return "Arithmos kykloforias: " + this.getArKykloforias() + ".\nOnoma Idioktiti: " + this.getIdioktitis() +
//                ".\nEtos kataskevis: " + this.getEtosKat() + ".\nArithmos aksonon: " + this.arithmosAksonon + ".";
    }
}
