// Synthesi - Composition
package ergastirio7_2;

public class Vehicle {
    private String idioktitis;
    private String arKykloforias;
    private int etosKat;
    protected SystimaDieythynsis sysdief;
    protected Mihani eng;
	
    // Default Constructor. Initialize object with null values
    public Vehicle() {
        this.eng = new Mihani(); // Prepei na ginontai new ta antikeimena pou perixontai stin klasi mas
        this.sysdief = new SystimaDieythynsis(); // Prepei na ginontai new ta antikeimena pou perixontai stin klasi mas
    }

    // Initialize object with some given values
    public Vehicle(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, 0, 0, 0);
        this.eng = new Mihani(); // Prepei na ginontai new ta antikeimena pou perixontai stin klasi mas
        this.sysdief = new SystimaDieythynsis(); // Prepei na ginontai new ta antikeimena pou perixontai stin klasi mas
    }

    // Full Constructor. Initialize object with full given values
    public Vehicle(String new_idioktitis, String new_arKykloforias, int new_etosKat, int new_kyvismos, int new_ippodynami) {
        this.idioktitis = new_idioktitis;
        this.arKykloforias = new_arKykloforias;
        this.etosKat = new_etosKat;
        this.eng = new Mihani(new_kyvismos, new_ippodynami); // Prepei na ginontai new ta antikeimena pou perixontai stin klasi mas
        this.sysdief = new SystimaDieythynsis(); // Prepei na ginontai new ta antikeimena pou perixontai stin klasi mas
   }

    // Methodos gia ton orismo olon ton attributes tou antikeimenou meso parametron
    public void setAllValuesToVehicle(String new_idioktitis, String new_arKykloforias, int new_etosKat, int new_kyvismos, int new_ippodynami) {
        this.idioktitis = new_idioktitis;
        this.arKykloforias = new_arKykloforias;
        this.etosKat = new_etosKat;
        eng.setKyvismos(new_kyvismos);
        eng.setIppodynami(new_ippodynami);
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

    // Convert all attributes to Sting *** GIA ELEGXO & DIORTHOSI
    public String toString() {
        return "Arithmos kykloforias: " + this.arKykloforias + ". Onoma Idioktiti: " + this.idioktitis + ". Etos eisagogis: " + this.etosKat +
                "Kyvismos: " + eng.getKyvismos() + ". Ippodynami: " + eng.getIppodynami() + ".";
    }
}