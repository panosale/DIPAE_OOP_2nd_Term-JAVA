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
        this.etosKat = -1; // To etos kataskevis arxikopoieite me -1 oste na ginetai o elegxos kata ti dimourgia tou pinaka oximaton
    }

    // Initialize object with some given values
    public Vehicle(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, -1);
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
    }
    public Vehicle(Mihani new_mihani, SystimaDieythynsis new_sysdief) {
        this.eng = new_mihani;
        this.sysdief = new_sysdief;
    }
    // Semi Constructor. Initialize object with some given values
    public Vehicle(String new_idioktitis, String new_arKykloforias, int new_etosKat) {
        this.idioktitis = new_idioktitis;
        this.arKykloforias = new_arKykloforias;
        this.etosKat = new_etosKat;
        this.eng = new Mihani();
        this.sysdief = new SystimaDieythynsis();
    }

    // Full Constructor. Initialize object with full given values
    public Vehicle(String new_idioktitis, String new_arKykloforias, int new_etosKat, Mihani new_mihani, SystimaDieythynsis new_sysdief) {
        this.idioktitis = new_idioktitis;
        this.arKykloforias = new_arKykloforias;
        this.etosKat = new_etosKat;
        this.eng = new_mihani;
        this.sysdief = new_sysdief;
    }
    abstract void drive();

    // Gia xrisi stin klasi Car
    abstract short getArithmosThyron();
    abstract void setArithmosThyron(short new_arithmosThyron);
    // Gia xrisi stin klasi Truck
    abstract short getArithmosAksonon();
    abstract void setArithmosAksonon(short new_arithmosAksonon);
    // Gia xrisi stin klasi Motorcycle
    abstract boolean getDiatheteiPlainoOxima();
    abstract void setDiatheteiPlainoOxima(boolean new_diatheteiPlainoOxima);

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
        return "Arithmos kykloforias: " + arKykloforias + ". Onoma Idioktiti: " + idioktitis + ". Etos kataskevis: " + etosKat;
//        return "Arithmos kykloforias: " + arKykloforias + ".\nOnoma Idioktiti: " + idioktitis + ".\nEtos kataskevis: " + etosKat;
    }
}