// Klironomikotita - Eidikefsi
package ergastirio7_3;

public class Oromisthios extends Ypallilos{
    private int oresErgasias;
    private short amiviOras = 7;
    private short epidomaParagogikotitas = 6;
    // Default constructor
    public Oromisthios() {
        super();
    }
    // Full constructor
    // GIA DIORTHOSI. H EIDIKOTITA NA EINAI PROEPILEGMENI GI AFTI TIN KLASI
    public Oromisthios(String new_AM, String new_name, String new_eidikotita, String new_diefthinsiKatoikias, int new_oresErgasias) {
        super(new_AM, new_name, new_eidikotita, new_diefthinsiKatoikias);
        this.oresErgasias = new_oresErgasias;
    }
    // Set-Get Ores Ergasias;
    public void setOresErgasias(short new_oresErgasias) {
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
        telikosMisthos = this.oresErgasias * amiviOras;
        telikosMisthos = telikosMisthos + (telikosMisthos * ((float)epidomaParagogikotitas / 100));
        return telikosMisthos;
    }
    public String toString() {
        return ("AM: " + super.getAM() + "\nOnoma: " + super.getName() + "\nEidikotia: " + super.getEidikotita() +
                "\nDiefthinsi Katoikias: " + super.getDiefthinsiKatoikias() +
                "\nOres ergasias: " + this.oresErgasias + "\nAmoivi: " + this.amoiviOromisthiou());
    }
}
