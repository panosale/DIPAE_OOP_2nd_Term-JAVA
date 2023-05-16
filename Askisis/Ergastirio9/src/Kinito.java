// Genikefsi - Polymorfismos #2
// ergastirio 9
public class Kinito extends Tilefono {
	// Default constructor
    public Kinito() {
    }
	// Semi constructor
    public Kinito(String new_arithmosTilefonou) {
		super(new_arithmosTilefonou);
		this.setCallToStatheroCostPerSecond(0.06f);
		this.setCallToKinitoCostPerSecond(0.07f);
    }
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
		System.out.println("Klisi apo to <KINITO> <" + this.getPhoneNumber() + "> pros to <" + tmp_numToCall + "> me arithmo <" + numberToCall.getPhoneNumber() + ">.");
	}

//	public float cost(String numberToCall) { // GIA ELEGXO
//	}
    // Return all attributes in one string
    public String toString() {
        return (super.toString());
    }

}
