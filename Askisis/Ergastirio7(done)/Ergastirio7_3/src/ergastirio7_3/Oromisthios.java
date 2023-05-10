// Klironomikotita - Eidikefsi
package ergastirio7_3;

import java.text.DecimalFormat;

public class Oromisthios extends Ypallilos{
    private int oresErgasias;
    private short amiviOras = 7;
    private short epidomaParagogikotitas = 6;
    // Default constructor
    public Oromisthios() {
        super();
    }
    // Full constructor
    // GIA DIORTHOSI. H EIDIKOTITA NA EINAI "OROMISTHIOS" GI AFTI TIN KLASI -> done
    public Oromisthios(String new_AM, String new_name, String new_diefthinsiKatoikias, int new_oresErgasias) {
        // super(new_AM, new_name, "OROMISTHIOS", new_diefthinsiKatoikias); // NO NEED
        this.setAM(new_AM);
        this.setName(new_name);
        this.setEidikotita("OROMISTHIOS");
        this.setDiefthinsiKatoikias(new_diefthinsiKatoikias);
        this.oresErgasias = new_oresErgasias;
    }

    // Set-Get Ores Ergasias;
    public void setOresErgasias(int new_oresErgasias) {
        this.oresErgasias = new_oresErgasias;
    }
    public int getOresErgasias() {
        return this.oresErgasias;
    }

    // Set-Get Amivi Oras;
    public void setAmiviOras(short new_amiviOras) {
        this.amiviOras = new_amiviOras;
    }
    public short getAmiviOras() {
        return this.amiviOras;
    }

    // Set-Get Epidoma Paragogikotitas;
    public void setEpidomaParagogikotitas(short new_epidomaParagogikotitas) {
        this.epidomaParagogikotitas = new_epidomaParagogikotitas;
    }
    public short getEpidomaParagogikotitas() {
        return this.epidomaParagogikotitas;
    }

    // Calculate salary Oromisthiou
    public double amoiviOromisthiou() {
        double  telikosMisthos;
        telikosMisthos = this.oresErgasias * amiviOras; // Gia xrisi se periptosi pou oi ores ergasias einai oi synolikes tou mina
        //telikosMisthos = (this.oresErgasias * amiviOras) * 25; // Gia xrisi se periptosi pou oi ores ergasias einai ana imera
        telikosMisthos = telikosMisthos + (telikosMisthos * ((float)this.epidomaParagogikotitas / 100));
        return telikosMisthos;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return ("AM: " + this.getAM() + "\nOnoma: " + this.getName() + "\nEidikotia: " + this.getEidikotita() +
                "\nDiefthinsi Katoikias: " + this.getDiefthinsiKatoikias() +
                "\nOres ergasias: " + this.oresErgasias + "\nAmoivi: " + df.format(this.amoiviOromisthiou()) + "€.");
    }
}
