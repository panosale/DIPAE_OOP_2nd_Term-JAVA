// Genikefsi - Polymorfismos #2
// ergastirio 9
import java.lang.Math;
abstract class Tilefono {
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
	abstract void dial(String numberToCall);// {
//		System.out.println("Klisi apo to <" + this.arithmosTilefonou + "> pros to <" + numberToCall + ">.");
//	}
	public float cost(Tilefono numberToCall) {
        float tmp_callsCost;
        int tmp_secondsOnCall = (int) Math.round(Math.random() * 1000);
        switch (numberToCall.getPhoneNumber().charAt(0)) {
            case '2':
                tmp_callsCost = 0; // GIA SYNEXEIA
                break;
            case '6':
                tmp_callsCost = 1; // GIA SYNEXEIA
                break;
            default:
                tmp_callsCost = -1; // GIA SYNEXEIA
                break;
        }
        return tmp_callsCost;
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
    public int getTotalSecondsOnCalls() {
        return this.totalSecondsOnCall;
    }
    // Return all attributes in one string
    public String toString() {
        return (this.arithmosTilefonou + ", totalSecondsOnCalls = " + this.totalSecondsOnCall + ".");
    }
}
