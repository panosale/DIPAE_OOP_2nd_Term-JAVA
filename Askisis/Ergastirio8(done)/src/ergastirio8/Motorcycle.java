// Genikefsi - Polymorfismos
package ergastirio8;

public class Motorcycle extends Vehicle{
    private boolean diatheteiPlainoOxima;

    // Default Constructor
    public Motorcycle() {
        super();
    }
    public Motorcycle(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, -1, false);
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
        this.diatheteiPlainoOxima = new_diatheteiPlainoOxima;

        this.setArithmosThyron((short) -1); // Dummy use just because is abstract in superclass
        this.setArithmosAksonon((short) -1); // Dummy use just because is abstract in superclass
    }

    public void drive() {
        System.out.println("Your car driving license is not enough. You need a special license dear " + this.getIdioktitis());
    }
    // ***** DUMMY METHODOI EPEIDI DILONONTAI STIN YPERKLASI - START *****
    public short getArithmosThyron() { return -1; }
    public void setArithmosThyron(short new_arithmosThyron) { this.setArithmosThyron((short)-1); }
    public short getArithmosAksonon() {
        return -1;
    };
    public void setArithmosAksonon(short new_arithmosAksonon) { this.setArithmosAksonon((short)-1); };
    // ***** DUMMY METHODOI EPEIDI DILONONTAI STIN YPERKLASI - END *****

    // Get-Set Diathetei Plaino Oxima - DEN ZITITAI APO TIN ASKISI
    public boolean getDiatheteiPlainoOxima() {
        return this.diatheteiPlainoOxima;
    }
    public void setDiatheteiPlainoOxima(boolean new_diatheteiPlainoOxima) {
        this.diatheteiPlainoOxima = new_diatheteiPlainoOxima;
    }
    // Convert all attributes to Sting
    public String toString() {
        return super.toString() + ". Diathetei plaino oxima: " + this.diatheteiPlainoOxima + ".";
//        return "Arithmos kykloforias: " + this.getArKykloforias() + ". Onoma Idioktiti: " + this.getIdioktitis() +
//                ". Etos kataskevis: " + this.getEtosKat() + ". Diathetei plaino oxima: " + this.diatheteiPlainoOxima + ".";
//        return "Arithmos kykloforias: " + this.getArKykloforias() + ".\nOnoma Idioktiti: " + this.getIdioktitis() +
//                ".\nEtos kataskevis: " + this.getEtosKat() + ".\nDiathetei plaino oxima: " + this.diatheteiPlainoOxima + ".";
    }
}
