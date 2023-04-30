// Klironomikotita - Eidikefsi
package ergastirio7_3;
public class Oromisthios extends Employee{
    private int oresErgasias;
    // Default constructor
    public Oromisthios() {
        super();
    }
    // Full constructor
    public Oromisthios(String new_AM, String new_name, String new_eidikotita, String new_diefthinsiKatoikias, int new_oresErgasias) {
        super(new_AM, new_name, new_eidikotita, new_diefthinsiKatoikias);
        this.oresErgasias = new_oresErgasias;
    }
    // Set-Get Ores Ergasias;
    public void setOresErgasias(int new_oresErgasias) {
        this.oresErgasias = new_oresErgasias;
    }
    public int getOresErgasias() {
        return this.oresErgasias;
    }
    // Calculate salary Oromisthiou
    public double amoiviOromisthiou() {
        double  telikosMisthos;
        telikosMisthos = this.oresErgasias * 7;
        telikosMisthos = telikosMisthos + (telikosMisthos * 0.06)
        return telikosMisthos;
    }
}
