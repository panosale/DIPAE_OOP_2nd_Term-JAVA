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
        this.eng = new Mihani(); // *** GIA ELEGXO
        this.sysdief = new SystimaDieythynsis(); // *** GIA ELEGXO
    }

    // Initialize object with some given values
    public Vehicle(String new_idioktitis, String new_arKykloforias) {
        this(new_idioktitis, new_arKykloforias, 0);
        this.eng = new Mihani(); // *** GIA ELEGXO
        this.sysdief = new SystimaDieythynsis(); // *** GIA ELEGXO
    }

    // Full Constructor. Initialize object with full given values *** GIA ELEGXO & DIORTHOSI
    public Vehicle(String new_idioktitis, String new_arKykloforias, int new_etosKat) {
        this.idioktitis = new_idioktitis;
        this.arKykloforias = new_arKykloforias;
        this.etosKat = new_etosKat;
        this.eng = new Mihani(); // *** GIA ELEGXO
        this.sysdief = new SystimaDieythynsis(); // *** GIA ELEGXO
    }

    // Methodos gia ton orismo olon ton attributes tou antikeimenou meso parametron *** GIA ELEGXO & DIORTHOSI
    public void setAllValuesToVehicle(String new_idioktitis, String new_arKykloforias, int new_etosKat) {
        this.idioktitis = new_idioktitis;
        this.arKykloforias = new_arKykloforias;
        this.etosKat = new_etosKat;
    }

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

    // Get-Set Kyvismo *** GIA ELEGXO, AFOU YPARXEI PROSVASI STIN eng DEN XREIAZONTAI OI PARAKATO GRAMMES
//    public int getEngKyvismos() {
//        return eng.getKyvismos();
//    }
//    public void setEngKyvismos(int new_Kyvismos) {
//        eng.setKyvismos(new_Kyvismos);
//    }
    // Get-Set Ippodynami *** GIA ELEGXO
//    public int getEngIppodynami() {
//        return eng.getIppodynami();
//    }
//    public void setEngIppodynami(int new_ippodynami) {
//        eng.setIppodynami(new_ippodynami);
//    }

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