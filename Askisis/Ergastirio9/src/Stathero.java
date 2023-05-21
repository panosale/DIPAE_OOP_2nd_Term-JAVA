// Genikefsi - Polymorfismos #2
// ergastirio 9
public class Stathero extends Tilefono {
	// Default constructor
    public Stathero() {
        super();
    }
	// Semi constructor
    public Stathero(String new_arithmosTilefonou) {
		super(new_arithmosTilefonou);
		this.setCallToStatheroCostPerSecond(0.02f);
        this.setCallToKinitoCostPerSecond(0.05f);
    }
    // Full constructor
    public Stathero(String new_arithmosTilefonou, float new_callToStatheroCostPerSecond, float new_callToKinitoCostPerSecond) {
        super(new_arithmosTilefonou);
        this.setCallToStatheroCostPerSecond(new_callToStatheroCostPerSecond);
        this.setCallToKinitoCostPerSecond(new_callToKinitoCostPerSecond);
        this.setCallsToStatheroTotalSeconds(0);
        this.setCallsToStatheroTotalSeconds(0);
        this.setTotalSecondsOnCalls(0);
    }
    public void dial(String numberToCall, int new_dialDuration) {
        String tmp_numTypeToCall;
        this.setTotalSecondsOnCalls(new_dialDuration);
        switch (numberToCall.charAt(0)) {
            case '2': tmp_numTypeToCall = "ΣΤΑΘΕΡΟ";
                this.setCallsToStatheroTotalSeconds(new_dialDuration);
                break;
            case '6': tmp_numTypeToCall = "ΚΙΝΗΤΟ";
                this.setCallsToKinitoTotalSeconds(new_dialDuration);
                break;
            default: tmp_numTypeToCall = "ΑΠΡΟΣΔΙΟΡΙΣΤΟ";
                break;
        }
        if (!tmp_numTypeToCall.equals("ΑΠΡΟΣΔΙΟΡΙΣΤΟ"))
            System.out.println("Κλήση από το <ΣΤΑΘΕΡΟ> <" + this.getPhoneNumber() + "> προς το <" + tmp_numTypeToCall + "> με αριθμό <" + numberToCall +
                    "> με διάρκεια " + new_dialDuration + "sec.");
    }
    // Return all attributes in one string
    public String toString() {
        return (super.toString());
    }
}
