// Genikefsi - Polymorfismos
package ergastirio9;

public class Tilefono {
	private String phoneNumber;
	private int totalSecondsOnCalls;
	private int secondsOnOutgoingCalls;
	private float callCostPerSecond; // GIA ELEGXO
	// Default constructor
    public Tilefono() {
    }
	// Semi constructor
    public Tilefono(String new_phoneNumber) {
		this.phoneNumber = new_phoneNumber;
		callCostPerSecond = 0; // GIA ELEGXO
		totalSecondsOnCalls  = 0;
		secondsOnOutgoingCalls = 0;
    }	
	public void dial(String numberToCall, int secondOnCall, boolean isOutgoing) {
		System.out.println("Klisi pros to <" + numberToCall + ">."); // apo to " + "[TYPOS ANTIKEIMENOU TILEFONOU]" + " tilefono " + this.phoneNumber + " pros to " + "[TYPOS ANTIKEIMENOU TILEFONOU]" + " mer arithmo.");
		this.totalSecondsOnCalls = this.totalSecondsOnCalls + secondOnCall;
		if (isOutgoing)
			this.secondsOnOutgoingCalls = this.secondsOnOutgoingCalls + secondOnCall;
	}

	public float cost(String numberToCall) {
		
	}
    // Set-Get phoneNumber
    public void setPhoneNumber(String new_phoneNumber) {
        this.phoneNumber = new_phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    // Set-Get callCostPerSecond  // GIA ELEGXO
    public void setCallCostPerSecond(int new_callCostPerSecond) { // GIA ELEGXO
        this.callCostPerSecond = new_callCostPerSecond; // GIA ELEGXO
    } // GIA ELEGXO
    public int getCallCostPerSecondCalls() { // GIA ELEGXO
        return this.callCostPerSecond; // GIA ELEGXO
    } // GIA ELEGXO
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
        return (this.phoneNumber + ", totalSecondsOnCalls = " + this.totalSecondsOnCalls + ", secondsOnOutgoingCalls = " + this.secondsOnOutgoingCalls);
    }

}
