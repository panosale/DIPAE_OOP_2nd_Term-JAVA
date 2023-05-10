// Klironomikotita - Eidikefsi
package ergastirio7_3;

import java.text.DecimalFormat;

public class Misthotos extends Ypallilos{
    private short etiProypiresias;
    private short arithmosTeknon;
    private int vasikosMisthos = 700; // STATHERES TIMES. SPANIA ALLAZOUN.
    private short epidomaTeknon = 5; // STATHERES TIMES. SPANIA ALLAZOUN.
    private short xronoEpidoma = 10; // STATHERES TIMES. SPANIA ALLAZOUN.
    // Default constructor
    public Misthotos() {
        super();
    }

    // Constructor xoris ta eti proypiresias & ton arithmo ton teknon
    // GIA DIORTHOSI. H EIDIKOTITA NA EINAI "MISTHOTOS" GI AFTI TIN KLASI -> done
    public Misthotos(String new_AM, String new_name, String new_diefthinsiKatoikias) {
        this(new_AM, new_name, new_diefthinsiKatoikias, (short)0, (short)0);
    }

    // Full constructor
    // GIA DIORTHOSI. H EIDIKOTITA NA EINAI "MISTHOTOS" GI AFTI TIN KLASI
    public Misthotos(String new_AM, String new_name, String new_diefthinsiKatoikias, short new_etiProypiresias, short new_arithmosTeknon) {
        // super(new_AM, new_name, new_eidikotita, new_diefthinsiKatoikias); // NO NEED
        this.setAM(new_AM);
        this.setName(new_name);
        this.setEidikotita("MISTHOTOS");
        this.setDiefthinsiKatoikias(new_diefthinsiKatoikias);
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
        int tmp_Trieties = this.etiProypiresias / 3;
        telikosMisthos = this.vasikosMisthos + ((this.vasikosMisthos * ((float)epidomaTeknon / 100)) * arithmosTeknon);
        telikosMisthos = telikosMisthos + ((this.vasikosMisthos * ((float)xronoEpidoma / 100)) * tmp_Trieties);
        return telikosMisthos;
    }
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return ("AM: " + this.getAM() + "\nOnoma: " + this.getName() + "\nEidikotia: " + this.getEidikotita() +
                "\nDiefthinsi Katoikias: " + this.getDiefthinsiKatoikias() +
                "\nEti proypiresias: " + this.etiProypiresias + "\nArithmos teknon: " + this.arithmosTeknon +
                "\nAmoivi: " + df.format(this.amoiviMishotou()) + "€.");
    }

}
