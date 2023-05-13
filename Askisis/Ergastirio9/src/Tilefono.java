// Genikefsi - Polymorfismos #2
// ergastirio 9
import java.lang.Math;
public class Tilefono {
	private String arithmosTilefonou;
	private int totalSecondsOnCalls;
	private int secondsOnOutgoingCalls; // GIA ELEGXO
//	private float callCostPerSecond; // GIA ELEGXO
	// Default constructor
    public Tilefono() {
    }
	// Semi constructor
    public Tilefono(String new_arithmosTilefonou) {
		this.arithmosTilefonou = new_arithmosTilefonou;
//		callCostPerSecond = 0; // GIA ELEGXO
		this.totalSecondsOnCalls  = 0;
		this.totalSecondsOnCalls = 0;
    }	
	public void dial(String numberToCall) { //, int secondsOnCall, boolean isOutgoing) { // GIA ELEGXO. DEN ZITOUNTAI APO TIN ASKISI.
		System.out.println("Klisi apo to <" + this.arithmosTilefonou + "> pros to <" + numberToCall + ">."); // apo to " + "[TYPOS ANTIKEIMENOU TILEFONOU]" + " tilefono " + this.phoneNumber + " pros to " + "[TYPOS ANTIKEIMENOU TILEFONOU]" + " mer arithmo.");
		this.totalSecondsOnCalls = this.totalSecondsOnCalls + (int) (Math.random() * 1000);
		//if (isOutgoing) // GIA ELEGXO. DEN ZITITAI APO TIN ASKISI.
		//	this.secondsOnOutgoingCalls = this.secondsOnOutgoingCalls + secondsOnCall; // GIA ELEGXO. DEN ZITITAI APO TIN ASKISI.
	}

	public float cost(String numberToCall) {
		return -1; // GIA DIORTHOSI
	}
    // Set-Get phoneNumber
    public void setPhoneNumber(String new_phoneNumber) {
        this.arithmosTilefonou = new_phoneNumber;
    }
    public String getPhoneNumber() {
        return this.arithmosTilefonou;
    }
    /*
	// Set-Get callCostPerSecond  // GIA ELEGXO
    public void setCallCostPerSecond(int new_callCostPerSecond) { // GIA ELEGXO
        this.callCostPerSecond = new_callCostPerSecond; // GIA ELEGXO
    } // GIA ELEGXO
    public int getCallCostPerSecondCalls() { // GIA ELEGXO
        return this.callCostPerSecond; // GIA ELEGXO
    } // GIA ELEGXO
	*/
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
/*
    // Set-Get first name
    public void setFirstName(String new_firstName) {
        this.firstName = new_firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    // Set-Get last name
    public void setLastName(String new_lastName) {
        this.lastName = new_lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    // Set-Get Vasikos Misthos
    public void setVasikosMisthos(double new_vasikosMisthos) {
        this.vasikosMisthos = new_vasikosMisthos;
    }
    public double getVasikosMisthos() {
        return this.vasikosMisthos;
    }
    // Set-Get Bonus
    public void setBonus(double new_Bonus) {
        this.bonus = new_Bonus;
    }
    public double getBonus() {
        return this.bonus;
    }
*/
    // Return all attributes in one string
    public String toString() {
        return (this.arithmosTilefonou + ", totalSecondsOnCalls = " + this.totalSecondsOnCalls + ", secondsOnOutgoingCalls = " + this.secondsOnOutgoingCalls);
    }

}
