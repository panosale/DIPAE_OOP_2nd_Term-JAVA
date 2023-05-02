// Synthesi - Composition
package ergastirio7_2;

public class Mihani {

	private int kyvismos;
	private int ippodynami;

    // Default Constructor. Initialize object with null values
    public Mihani() {
    }
    // Full Constructor. Initialize object with given values
    public Mihani(int new_kyvismos, int new_ippodynami) {

        this.kyvismos = new_kyvismos;
        this.ippodynami = new_ippodynami;
    }

    public void leitourgia() {
        System.out.println("Mihani > Leitourgia.");
    }

    public void kinisi() {
        System.out.println("Mihani > Kinisi.");
    }

    public void svysimo() {
        System.out.println("Mihani > Svisimo.");
    }

    // Get-Set Kyvismos
    public int getKyvismos() {
        return this.kyvismos;
    }
    public void setKyvismos(int new_kyvismos) {
        this.kyvismos = new_kyvismos;
    }
    // Get-Set Ippodynami
    public int getIppodynami() {
        return this.ippodynami;
    }
    public void setIppodynami(int new_ippodynami) {
        this.ippodynami = new_ippodynami;
    }

    // Convert all attributes to Sting *** GIA ELEGXO & DIORTHOSI
    public String toString() {
        return "Kyvismos: " + this.kyvismos + ". Ippodynami: " + this.ippodynami + ".";
    }
}
