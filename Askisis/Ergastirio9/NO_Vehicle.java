// Synthesi - Composition
package ergastirio9;

public class Vehicle {
    private String idioktitis;
    private String arKykloforias;
    private int etosKat;
	private SystimaDieythynsis sysdief;
	private Mihani eng;
	
    // Initialize object with null values
    public Vehicle() {
    }

    // Initialize object with some given values
    public Vehicle(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias);
		new this.sysdief;
		new this.eng;
    }

    // Initialize object with full given values *** GIA ELEGXO & DIORTHOSI
    public Vehicle(String new_idioktitis, String new_arKykloforias, new_etosKat) {
        this.idioktitis = new_idioktitis;
        this.arKykloforias = new_arKykloforias;
        this.etosKat = new_etosKat;
    }

    // Methodos gia ton orismo olon ton attributes tou antikeimenou meso parametron *** GIA ELEGXO & DIORTHOSI
    public void setAllValuesToVehicle(String new_idioktitis, String new_arKykloforias, new_etosKat) {
        this.idioktitis = new_idioktitis;
        this.arKykloforias = new_arKykloforias;
        this.etosKat = new_etosKat;
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
        return "Arithmos kykloforias: " + arKykloforias + ". Onoma Idioktiti: " + idioktitis + ". Etos eisagogis: " + etosKat;
        // Proigoumeni ekdosi methodou .toString
        //String tmp_toString;
        //tmp_toString = "AM: " + AM + "\nIdioktitis: " + Idioktitis + "\nArithmos Kykloforias: " + arKykloforias +
        //        "\nEtos kataskevis: " + etosKat;
        //return tmp_toString;
    }
}