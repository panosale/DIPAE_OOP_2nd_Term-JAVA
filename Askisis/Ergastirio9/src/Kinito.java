// Genikefsi - Polymorfismos #2
// ergastirio 9
public class Kinito extends Tilefono {
	private float callToStaheroCostPerSecond; // GIA ELEGXO
	private float callToKinitoCostPerSecond; // GIA ELEGXO
	// Default constructor
    public Kinito() {
    }
	// Semi constructor
    public Kinito(String new_arithmosTilefonou) {
		super(new_arithmosTilefonou);
		this.callToKinitoCostPerSecond = 0.06f; // GIA ELEGXO
		this.callToKinitoCostPerSecond = 0.07f; // GIA ELEGXO
    }	
	public void dial(String numberToCall, int secondsOnCall, boolean isOutgoing) { // GIA ELEGXO, boolean seStathero)
		System.out.println("Klisi pros to <" + numberToCall + ">.");
		this.totalSecondsOnCalls = this.totalSecondsOnCalls + secondsOnCall;
		if (isOutgoing) // GIA ELEGXO
			this.secondsOnOutgoingCalls = this.secondsOnOutgoingCalls + secondsOnCall; // GIA ELEGXO
	}

	public float cost(String numberToCall) {
		
	}
    // Set-Get callToStaheroCostPerSecond  // GIA ELEGXO
    public void setCallToStaheroCostPerSecond(int new_callToStaheroCostPerSecond) { // GIA ELEGXO
        this.callToStaheroCostPerSecond = new_callToStaheroCostPerSecond; // GIA ELEGXO
    } // GIA ELEGXO
    public float getCallToStaheroCostPerSecond() { // GIA ELEGXO
        return this.callToStaheroCostPerSecond; // GIA ELEGXO
    } // GIA ELEGXO
	
    // Set-Get callToKinitoCostPerSecond  // GIA ELEGXO
    public void setCallToKinitoCostPerSecond(int new_callToKinitoCostPerSecond) { // GIA ELEGXO
        this.callToKinitoCostPerSecond = new_callToKinitoCostPerSecond; // GIA ELEGXO
    } // GIA ELEGXO
    public float getCallToKinitoCostPerSecond() { // GIA ELEGXO
        return this.callToKinitoCostPerSecond; // GIA ELEGXO
    } // GIA ELEGXO
	/* TA PARAKATO KLIRONOMOUNTAI APO TO TILEFONO
    // Set-Get phoneNumber
    public void setPhoneNumber(String new_phoneNumber) {
        this.phoneNumber = new_phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    // Set-Get totalSecondsOnCalls
    public void setTotalSecondsOnCalls(int new_totalSecondsOnCalls) {
        this.totalSecondsOnCalls = new_totalSecondsOnCalls;
    }
    public int getTotalSecondsOnCallsCalls() {
        return this.totalSecondsOnCalls;
    }
    // Set-Get secondsOnOutgoingCalls
    public void setSecondsOnOutgoingCalls(int new_secondsOnOutgoingCalls) {
        this.secondsOnOutgoingCalls = new_secondsOnOutgoingCalls;
    }
    public int getSecondsOnOutgoingCalls() {
        return this.secondsOnOutgoingCalls;
    }
	*/
    // Return all attributes in one string
    public String toString() {
        return (this.phoneNumber + ", totalSecondsOnCalls = " + this.totalSecondsOnCalls + ", secondsOnOutgoingCalls = " + this.secondsOnOutgoingCalls);
    }

}
