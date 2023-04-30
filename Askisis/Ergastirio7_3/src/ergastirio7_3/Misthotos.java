// Klironomikotita - Eidikefsi
package ergastirio7_3;
public class Misthotos extends Ypallilos{
    private short etiProypiresias;
    private short arithmosTeknon;
    // STATHERES TIMES. SPANIA ALLAZOUN.
    private int vasikosMisthos = 700;
    private short epidomaTeknon = 5;
    private short xronoEpidoma = 10;
    // Default constructor
    public Misthotos() {
        super();
    }
    // Constructor xoris ta eti proypiresias & ton arithmo ton teknon
    public Misthotos(String new_AM, String new_name, String new_eidikotita, String new_diefthinsiKatoikias) {
        this(new_AM, new_name, new_eidikotita, new_diefthinsiKatoikias, (short)0, (short)0);
    }
    // Full constructor
    public Misthotos(String new_AM, String new_name, String new_eidikotita, String new_diefthinsiKatoikias, short new_etiProypiresias, short new_arithmosTeknon) {
        super(new_AM, new_name, new_eidikotita, new_diefthinsiKatoikias);
        this.etiProypiresias = new_etiProypiresias;
        this.arithmosTeknon = new_arithmosTeknon;
    }
    // Set-Get Eti Proypiresias;
    public void setEtiProypiresias(short new_etiProypiresias) {
        this.etiProypiresias = new_etiProypiresias;
    }
    public short getEtiProypiresias() {
        return this.etiProypiresias;
    }
    // Set-Get Arithmos Teknon;
    public void setArithmosTeknon(short new_arithmosTeknon) {
        this.arithmosTeknon = new_arithmosTeknon;
    }
    public short getArithmosTeknon() {
        return this.arithmosTeknon;
    }
    // STATHERES TIMES. SPANIA ALLAZOUN.
    // Set-Get Vasikos Misthos;
    public void setVasikosMisthos(short new_vasikosMisthos) {
        this.vasikosMisthos = new_vasikosMisthos;
    }
    public int getVasikosMisthos() {
        return this.vasikosMisthos;
    }
    // Set-Get Epidoma Teknon;
    public void setEpidomaTeknon(short new_epidomaTeknon) {
        this.epidomaTeknon = new_epidomaTeknon;
    }
    public short getEpidomaTeknon() {
        return this.epidomaTeknon;
    }
    // Set-Get Xronoepidoma;
    public void setXronoEpidoma(short new_xronoEpidoma) {
        this.xronoEpidoma = new_xronoEpidoma;
    }
    public short getXronoEpidoma() {
        return this.xronoEpidoma;
    }
    // Calculate salary Misthotou
    public double amoiviMishotou() {
        double  telikosMisthos;
        telikosMisthos = this.vasikosMisthos + ((this.vasikosMisthos * ((float)epidomaTeknon / 100)) * arithmosTeknon);
        telikosMisthos = telikosMisthos + (this.vasikosMisthos * ((float)xronoEpidoma / 100));
        return telikosMisthos;
    }
}
