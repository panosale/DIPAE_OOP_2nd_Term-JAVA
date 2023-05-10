// Genikefsi - Polymorfismos
package ergastirio8;
abstract class Vehicle {
    private String idioktitis;
    private String arKykloforias;
    private int etosKat;
    protected SystimaDieythynsis sysdief;
    protected Mihani eng;
	
    // Default Constructor. Initialize object with null values
    public Vehicle() {
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
    }

    // Initialize object with some given values
    public Vehicle(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, 0);
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
    }

    // Full Constructor. Initialize object with full given values
    public Vehicle(String new_idioktitis, String new_arKykloforias, int new_etosKat) {
        this.idioktitis = new_idioktitis;
        this.arKykloforias = new_arKykloforias;
        this.etosKat = new_etosKat;
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
    }
    abstract void drive();
    // Gia xrisi stin klasi Car
    abstract short getArithmosThyron();
    abstract void setArithmosThyron(short new_arithmosThyron);

    abstract short getArithmosAksonon();
    abstract void setArithmosAksonon(short new_arithmosAksonon);

    abstract boolean getDiatheteiPlainoOxima();
    abstract void setDiatheteiPlainoOxima(boolean new_diatheteiPlainoOxima);

    // Gia xrisi stin klasi Car
    public void transferOwnership(String new_idioktitis) {
        System.out.println("Ownership is transferred from " + this.getIdioktitis() + " to " + new_idioktitis + ".");
        this.setIdioktitis(new_idioktitis);
    }
    // Get-Set Idioktitis
    public String getIdioktitis() {
        return this.idioktitis;
    }
    public void setIdioktitis(String new_idioktitis) {
        this.idioktitis = new_idioktitis;
    }

    // Get-Set Arithmos Kykloforias
    public String getArKykloforias() {
        return this.arKykloforias;
    }
    public void setArKykloforias(String new_arKykloforias) {
        this.arKykloforias = new_arKykloforias;
    }

    // Get-Set Etos Kataskevis
    public int getEtosKat() {
        return this.etosKat;
    }
    public void setEtosKat(int new_etosKat) {
        this.etosKat = new_etosKat;
    }

    // Convert all attributes to Sting
    public String toString() {
        return "Arithmos kykloforias: " + arKykloforias + ".\nOnoma Idioktiti: " + idioktitis + ".\nEtos eisagogis: " + etosKat;
    }
}