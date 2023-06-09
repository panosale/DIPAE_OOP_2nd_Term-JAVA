// Genikefsi - Polymorfismos
package ergastirio8;

public class Car extends Vehicle{
    private short arithmosThyron;

    // Default Constructor
    public Car() {
        super();
    }
    public Car(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, -1, (short)0);
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

        this.setArithmosAksonon((short) -1); // Dummy use just because is abstract in superclass
        this.setDiatheteiPlainoOxima(false); // Dummy use just because is abstract in superclass
    }

    public void drive() {
        System.out.println("You need a car driving license dear " + this.getIdioktitis());
    }

    // Get-Set Arithmos Thyron - DEN ZITITAI APO TIN ASKISI
    public short getArithmosThyron() {
        return this.arithmosThyron;
    }
    public void setArithmosThyron(short new_arithmosThyron) {
        this.arithmosThyron = new_arithmosThyron;
    }
    // ***** DUMMY METHODOI EPEIDI DILONONTAI STIN YPERKLASI - START *****
    public short getArithmosAksonon() {
        return -1;
    };
    public void setArithmosAksonon(short new_arithmosAksonon) { this.setArithmosAksonon((short)-1); }
    public boolean getDiatheteiPlainoOxima() {
        return false;
    }
    public void setDiatheteiPlainoOxima(boolean new_diatheteiPlainoOxima) { this.setDiatheteiPlainoOxima(false); }
    // ***** DUMMY METHODOI EPEIDI DILONONTAI STIN YPERKLASI - END *****

    // Convert all attributes to Sting
    public String toString() {
        return super.toString() + ". Arithmos thyron: " + this.arithmosThyron + ".";
//        return "Arithmos kykloforias: " + this.getArKykloforias() + ". Onoma Idioktiti: " + this.getIdioktitis() +
//                ". Etos kataskevis: " + this.getEtosKat() + ". Arithmos thyron: " + this.arithmosThyron + ".";
//        return "Arithmos kykloforias: " + this.getArKykloforias() + ".\nOnoma Idioktiti: " + this.getIdioktitis() +
//                ".\nEtos kataskevis: " + this.getEtosKat() + "\n. Arithmos thyron: " + this.arithmosThyron;
    }
}
