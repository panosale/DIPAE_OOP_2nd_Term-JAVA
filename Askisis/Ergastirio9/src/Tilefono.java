// Genikefsi - Polymorfismos #2
// ergastirio 9
import java.lang.Math;
public class Tilefono {
	private String arithmosTilefonou;
    private float callToStatheroCostPerSecond; // GIA ELEGXO
    private float callToKinitoCostPerSecond; // GIA ELEGXO
    private int callsToStatheroTotalSeconds; // GIA ELEGXO
    private int callsToKinitoTotalSeconds; // GIA ELEGXO
	private int totalSecondsOnCall;
//	private int secondsOnOutgoingCalls; // GIA ELEGXO
//	private float callCostPerSecond; // GIA ELEGXO
	// Default constructor
    public Tilefono() {
    }
	// Semi constructor
    public Tilefono(String new_arithmosTilefonou) {
		this.arithmosTilefonou = new_arithmosTilefonou;
//		callCostPerSecond = 0; // GIA ELEGXO
        this.callToStatheroCostPerSecond = 0;
        this.callToKinitoCostPerSecond = 0;
        this.callsToStatheroTotalSeconds = 0;
        this.callsToKinitoTotalSeconds = 0;
		this.totalSecondsOnCall = 0;
    }	
	public void dial(Tilefono numberToCall) { //, int secondsOnCall, boolean isOutgoing) { // GIA ELEGXO. DEN ZITOUNTAI APO TIN ASKISI.
		System.out.println("Klisi apo to <" + this.arithmosTilefonou + "> pros to <" + numberToCall.getPhoneNumber() + ">.");
		this.totalSecondsOnCall = this.totalSecondsOnCall + (int) (Math.random() * 1000);
		//if (isOutgoing) // GIA ELEGXO. DEN ZITITAI APO TIN ASKISI.
		//	this.secondsOnOutgoingCalls = this.secondsOnOutgoingCalls + secondsOnCall; // GIA ELEGXO. DEN ZITITAI APO TIN ASKISI.
	}

	public float cost(String numberToCall) {
		return -1;
	}
    // Set-Get phoneNumber
    public void setPhoneNumber(String new_phoneNumber) {
        this.arithmosTilefonou = new_phoneNumber;
    }
    public String getPhoneNumber() {
        return this.arithmosTilefonou;
    }
	// Set-Get callCostPerSecond STATHERO
    public void setCallToStatheroCostPerSecond(float new_callCostPerSecond) {
        this.callToStatheroCostPerSecond = new_callCostPerSecond;
    }
    public float getCallToStatheroCostPerSecond() {
        return this.callToStatheroCostPerSecond;
    }
    // Set-Get callCostPerSecond KINITO
    public float getCallToKinitoCostPerSecond() {
        return this.callToKinitoCostPerSecond;
    }
    public void setCallToKinitoCostPerSecond(float new_callCostPerSecond) {
        this.callToKinitoCostPerSecond = new_callCostPerSecond;
    }
    // Set-Get callToStathroTotalSeconds STATHERO
    public int getCallsToStatheroTotalSeconds() {
        return this.callsToStatheroTotalSeconds;
    }
    public void setCallsToStatheroTotalSeconds(int new_callSeconds) {
        this.callsToStatheroTotalSeconds = this.callsToStatheroTotalSeconds + new_callSeconds;
    }
    // Set-Get callToKinitoTotalSecond KINITO
    public int getCallsToKinitoTotalSeconds() {
        return this.callsToKinitoTotalSeconds;
    }
    public void setCallsToKinitoTotalSeconds(int new_callSeconds) {
        this.callsToKinitoTotalSeconds = new_callSeconds;
    }
    // Set-Get totalSecondsOnCalls
    public void setTotalSecondsOnCalls(int new_totalSecondsOnCall) {
        this.totalSecondsOnCall = new_totalSecondsOnCall;
    }
    public int getTotalSecondsOnCallsCalls() {
        return this.totalSecondsOnCall;
    }
    // Set-Get secondsOnOutgoingCalls
//    public void setSecondsOnOutgoingCalls(int new_secondsOnOutgoingCalls) {
//        this.secondsOnOutgoingCalls = new_secondsOnOutgoingCalls;
//    }
//    public int getSecondsOnOutgoingCalls() {
//        return this.secondsOnOutgoingCalls;
//    }
    // Return all attributes in one string
    public String toString() {
        return (this.arithmosTilefonou + ", totalSecondsOnCalls = " + this.totalSecondsOnCall + ", secondsOnOutgoingCalls = ");// + this.secondsOnOutgoingCalls);
    }
}
