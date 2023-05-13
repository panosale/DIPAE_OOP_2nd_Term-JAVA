// Klironomikotita - Eidikefsi
package ergastirio7_3;

import java.text.DecimalFormat;

public class Proistamenos extends Misthotos{
    private short epidomaProistamenou = 10; // STATHERES TIMES. SPANIA ALLAZOUN.

    // Default constructor
    public Proistamenos() {
        super();
    }

    // Constructor xoris tin eidkotitas, ta eti proypiresias & ton arithmo ton teknon
    public Proistamenos(String new_AM, String new_name, String new_diefthinsiKatoikias) {
        this(new_AM, new_name, new_diefthinsiKatoikias, "", (short)0, (short)0);
    }

    // Full constructor
   public Proistamenos(String new_AM, String new_name, String new_diefthinsiKatoikias, String new_eidikotita, short new_etiProypiresias, short new_arithmosTeknon) {
        this.setAM(new_AM);
        this.setName(new_name);
        this.setDiefthinsiKatoikias(new_diefthinsiKatoikias);
        this.setEidikotita(new_eidikotita);
        this.setEtiProypiresias(new_etiProypiresias);
        this.setArithmosTeknon(new_arithmosTeknon);
    }

    // STATHERES TIMES. SPANIA ALLAZOUN.
    // Set-Get Epidoma Proistamenou;
    public void setEpidomaProistamenou(short new_epidomaProistamenou) {
        this.epidomaProistamenou = new_epidomaProistamenou;
    }
    public short getEpidomaProistamenou() {
        return this.epidomaProistamenou;
    }

    // Calculate salary Proistamenou
    public double amoiviProistamenou() {
        double  telikosMisthos = this.amoiviMishotou();
        telikosMisthos = telikosMisthos + (telikosMisthos * ((float)epidomaProistamenou / 100));
        return telikosMisthos;
    }
    public String toString() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return (super.toString() + this.getEtiProypiresias() + "\nArithmos teknon: " + this.getArithmosTeknon() +
                "\nAmoivi: " + df.format(this.amoiviProistamenou()) + "€.");
//        return ("AM: " + this.getAM() + "\nOnoma: " + this.getName() + "\nEidikotia: " + this.getEidikotita() +
//                "\nDiefthinsi Katoikias: " + this.getDiefthinsiKatoikias() +
//                "\nEti proypiresias: " + this.getEtiProypiresias() + "\nArithmos teknon: " + this.getArithmosTeknon() +
//                "\nAmoivi: " + df.format(this.amoiviProistamenou()) + "€.");
    }
}
