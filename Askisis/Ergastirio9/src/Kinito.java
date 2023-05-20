// Genikefsi - Polymorfismos #2
// ergastirio 9
import java.text.DecimalFormat;
public class Kinito extends Tilefono {
	// Default constructor
    public Kinito() {
		super();
    }
	// Semi constructor
    public Kinito(String new_arithmosTilefonou) {
		super(new_arithmosTilefonou);
		this.setCallToStatheroCostPerSecond(0.06f);
		this.setCallToKinitoCostPerSecond(0.07f);
    }
	// Full constructor
	public Kinito(String new_arithmosTilefonou, float new_callToStatheroCostPerSecond, float new_callToKinitoCostPerSecond) {
		super(new_arithmosTilefonou);
		this.setCallToStatheroCostPerSecond(new_callToStatheroCostPerSecond);
		this.setCallToKinitoCostPerSecond(new_callToKinitoCostPerSecond);
		this.setCallsToStatheroTotalSeconds(0);
		this.setCallsToStatheroTotalSeconds(0);
		this.setTotalSecondsOnCalls(0);
	}
    public void dial(String numberToCall, int tmp_dialDuration) {
		String tmp_numTypeToCall;
//		int tmp_secondsOnCall = 10; // GIA DIAGRAFI
//		int tmp_secondsOnCall = (int)Math.round(Math.random() * 1000); // GIA DIAGRAFI
		this.setTotalSecondsOnCalls(this.getTotalSecondsOnCalls() + tmp_dialDuration);
		switch (numberToCall.charAt(0)) {
			case '2': tmp_numTypeToCall = "STATHERO";
				this.setCallsToStatheroTotalSeconds(this.getCallsToStatheroTotalSeconds() + tmp_dialDuration);
				break;
			case '6': tmp_numTypeToCall = "KINHTO";
				this.setCallsToKinitoTotalSeconds(this.getCallsToKinitoTotalSeconds() + tmp_dialDuration);
				break;
			default: tmp_numTypeToCall = "UNDEFINED";
				break;
		}
		System.out.println("Klisi apo to <STATHERO> <" + this.getPhoneNumber() + "> pros to <" + tmp_numTypeToCall + "> me arithmo <" + numberToCall + ">.");
	}
	public float cost(char phoneType) {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		switch (phoneType) {
			case '2':
				return this.calcCallsToStatheroTotalCost();
			case '6':
				return this.calcCallsToKinitoTotalCost();
			case 'A':
				return this.calcCallsToStatheroTotalCost() + this.calcCallsToKinitoTotalCost();
			default:
				return -1;
		}
	}
	public String showSecondsAndCost(char phoneType) { // ISOS DEN XREIAZETAI
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		switch (phoneType) {
			case '2': return ("Synolikos xronos kliseon pros STATHERA: " + this.getCallsToStatheroTotalSeconds() +
					"sec. Synoliko kostos kliseon pros STATHERA: " + df.format(this.calcCallsToStatheroTotalCost())+ "€");
			case '6': return ("Synolikos xronos kliseon pros KINHTA: " + this.getCallsToKinitoTotalSeconds() +
					"sec. Synoliko kostos kliseon pros KINHTA: " + df.format(this.calcCallsToKinitoTotalCost()));
			case 'A': return ("Synolikos xronos kliseon pros STATHERA: " + this.getCallsToStatheroTotalSeconds() +
					"sec. Synoliko kostos kliseon pros STATHERA: " + df.format(this.calcCallsToStatheroTotalCost()) +
					"€\nSynolikos xronos kliseon pros KINHTA: " + this.getCallsToKinitoTotalSeconds() +
					"sec. Synoliko kostos kliseon pros KINHTA: " + df.format(this.calcCallsToKinitoTotalCost()) + "€");
			default: return ("LATHOS EIDOS THLEFONOU.");
		}
	}
    // Return all attributes in one string
    public String toString() {
		return (super.toString());
    }
}
