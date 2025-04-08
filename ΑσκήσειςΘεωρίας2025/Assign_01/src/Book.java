public class Book {
    private String titlosVivliou;
    private String onomateponymoSyggrafea;
    private String ISBN;
    private String ekdotikosOikos;
    private int arithmosSelidon;
    private int etosEkdosis;
    private float timi;

    // Default constructor
    public Book() {
        this.titlosVivliou = "";
        this.onomateponymoSyggrafea = "";
        this.ISBN = "";
        this.ekdotikosOikos = "";
        this.arithmosSelidon = 0;
        this.etosEkdosis = 0;
        this.timi = 0;
    }
    // Full constructor
    public Book(String newTitlosVivliou, String newOnomateponymoSyggrafea, String newISBN, String newEkdotikosOikos, int newArithmosSelidon, int newEtosEkdosis, float newTimi) {
        this.titlosVivliou = newTitlosVivliou;
        this.onomateponymoSyggrafea = newOnomateponymoSyggrafea;
        this.ISBN = newISBN;
        this.ekdotikosOikos = newEkdotikosOikos;
        this.arithmosSelidon = newArithmosSelidon;
        this.etosEkdosis = newEtosEkdosis;
        this.timi = newTimi;
    }

    // Setters
    public void setTitlosVivliou(String titlosVivliou) {
        this.titlosVivliou = titlosVivliou;
    }
    public void setOnomateponymoSyggrafea(String onomateponymoSyggrafea) {
        this.onomateponymoSyggrafea = onomateponymoSyggrafea;
    }
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public void setEkdotikosOikos(String ekdotikosOikos) {
        this.ekdotikosOikos = ekdotikosOikos;
    }
    public void setArithmosSelidon(int arithmosSelidon) {
        this.arithmosSelidon = arithmosSelidon;
    }
    public void setEtosEkdosis(int etosEkdosis) {
        this.etosEkdosis = etosEkdosis;
    }
    public void setTimi(float timi) {
        this.timi = timi;
    }
    // Getters

    public String getTitlosVivliou() {
        return titlosVivliou;
    }

    public String getOnomateponymoSyggrafea() {
        return onomateponymoSyggrafea;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getEkdotikosOikos() {
        return ekdotikosOikos;
    }

    public int getArithmosSelidon() {
        return arithmosSelidon;
    }

    public int getEtosEkdosis() {
        return etosEkdosis;
    }

    public float getTimi() {
        return timi;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titlosVivliou='" + titlosVivliou + '\'' +
                ", onomateponymoSyggrafea='" + onomateponymoSyggrafea + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", ekdotikosOikos='" + ekdotikosOikos + '\'' +
                ", arithmosSelidon=" + arithmosSelidon +
                ", etosEkdosis=" + etosEkdosis +
                ", timi=" + timi +
                '}';
    }
}
