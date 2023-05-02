// Klironomikotita - Eidikefsi
package ergastirio7_3;

public class Proistamenos extends Misthotos{
    private short epidomaProistamenou = 10; // STATHERES TIMES. SPANIA ALLAZOUN.
    // Default constructor
    public Proistamenos() {
        super();
    }
    // Constructor xoris ta eti proypiresias & ton arithmo ton teknon
    // GIA DIORTHOSI. H EIDIKOTITA NA EINAI PROEPILEGMENI GI AFTI TIN KLASI
    public Proistamenos(String new_AM, String new_name, String new_eidikotita, String new_diefthinsiKatoikias) {
        this(new_AM, new_name, new_eidikotita, new_diefthinsiKatoikias, (short)0, (short)0);
    }
    // Full constructor
    // GIA DIORTHOSI. H EIDIKOTITA NA EINAI PROEPILEGMENI GI AFTI TIN KLASI
    public Proistamenos(String new_AM, String new_name, String new_eidikotita, String new_diefthinsiKatoikias, short new_etiProypiresias, short new_arithmosTeknon) {
        super(new_AM, new_name, new_eidikotita, new_diefthinsiKatoikias);
        super.setEtiProypiresias(new_etiProypiresias);
        super.setArithmosTeknon(new_arithmosTeknon);
    }
    // STATHERES TIMES. SPANIA ALLAZOUN.
    // Set-Get Epidoma Proistamenou;
    public void setEpidomaProistamenou(short new_epidomaProistamenou) {
        this.epidomaProistamenou = new_epidomaProistamenou;
    }
    public short getEpidomaTeknon() {
        return this.epidomaProistamenou;
    }
    // Calculate salary Proistamenou
    public double amoiviProistamenou() {
        double  telikosMisthos = super.amoiviMishotou();
        telikosMisthos = telikosMisthos + (telikosMisthos * ((float)epidomaProistamenou / 100));
        return telikosMisthos;
    }
}
