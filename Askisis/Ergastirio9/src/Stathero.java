// Genikefsi - Polymorfismos #2
// ergastirio 9
public class Stathero extends Tilefono {
	// Default constructor
    public Stathero() {
    }
	// Semi constructor
    public Stathero(String new_arithmosTilefonou) {
		super(new_arithmosTilefonou);
		this.setCallToStatheroCostPerSecond(0.02f);
        this.setCallToKinitoCostPerSecond(0.05f);
    }
//	public float cost(String numberToCall) { // GIA ELEGXO
public void dial(Tilefono numberToCall) {
    String tmp_numToCall;
    int tmp_secondsOnCall = (int)Math.round(Math.random() * 1000);
    switch (numberToCall.getPhoneNumber().charAt(0)) {
        case '2': tmp_numToCall = "STATHERO";
            break;
        case '6': tmp_numToCall = "KINITO";
            break;
        default: tmp_numToCall = "UNDEFINED";
            break;
    }
    System.out.println("Klisi apo to <STATHERO> <" + this.getPhoneNumber() + "> pros to <" + tmp_numToCall + "> me arithmo <" + numberToCall.getPhoneNumber() + ">.");
}
    // Return all attributes in one string
    public String toString() {
        return (super.toString());
    }

}
