// Genikefsi - Polymorfismos #2
// ergastirio 9
import java.text.DecimalFormat;
abstract class Tilefono {
	private String arithmosTilefonou;
    private float callToStatheroCostPerSecond; // GIA ELEGXO
    private float callToKinitoCostPerSecond; // GIA ELEGXO
    private int callsToStatheroTotalSeconds; // GIA ELEGXO
    private int callsToKinitoTotalSeconds; // GIA ELEGXO
	private int totalSecondsOnCall;
    private float totalCallsCost; // GIA ELEGXO
	// Default constructor
    public Tilefono() {
    }
	// Semi constructor
    public Tilefono(String new_arithmosTilefonou) {
		this.arithmosTilefonou = new_arithmosTilefonou;
        this.callToStatheroCostPerSecond = 0;
        this.callToKinitoCostPerSecond = 0;
        this.callsToStatheroTotalSeconds = 0;
        this.callsToKinitoTotalSeconds = 0;
		this.totalSecondsOnCall = 0;
        this.totalCallsCost = 0;
    }
    // Full Constructor
    public Tilefono(String new_arithmosTilefonou, float new_callToStatheroCostPerSecond, float new_callToKinitoCostPerSecond) {
        this.arithmosTilefonou = new_arithmosTilefonou;
        this.callToStatheroCostPerSecond = new_callToStatheroCostPerSecond;
        this.callToKinitoCostPerSecond = new_callToKinitoCostPerSecond;
        this.callsToStatheroTotalSeconds = 0;
        this.callsToKinitoTotalSeconds = 0;
        this.totalSecondsOnCall = 0;
        this.totalCallsCost = 0;
    }
	abstract void dial(String numberToCall, int tmp_dialDuration); // Υλοποιείται διαφορετικά σε κάθε είδος τηλεφώνου (ΣΤΑΘΕΡΟ/ΚΙΝΗΤΟ)
    public float cost(char phoneType) {
        float tmp_callsCost;
        switch (phoneType) {
            case '2': // ΚΟΣΤΟΣ ΚΛΗΣΕΩΝ ΠΡΟΣ ΣΤΑΘΕΡΑ
                tmp_callsCost = this.callsToStatheroTotalSeconds * this.callToStatheroCostPerSecond;
                break;
            case '6': // ΚΟΣΤΟΣ ΚΛΗΣΕΩΝ ΠΡΟΣ ΚΙΝΗΤΑ
                tmp_callsCost = this.callsToKinitoTotalSeconds * this.callToKinitoCostPerSecond;
                break;
            default:
                tmp_callsCost = 0.0f;
                break;
        }
        this.totalCallsCost = (this.callsToStatheroTotalSeconds * this.callToStatheroCostPerSecond) + (this.callsToKinitoTotalSeconds * this.callToKinitoCostPerSecond);
        return tmp_callsCost;
    }
    public String showSecondsAndCost(char phoneType) { // ΕΙΝΑΙ ΙΔΙΑ ΓΙΑ ΟΛΕΣ ΤΙΣ ΥΠΟΚΛΑΣΕΙΣ
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        switch (phoneType) {
            case '2':
                return ("Γραμμή: " + this.getPhoneNumber() + ". Συνολικός χρόνος κλήσεων προς ΣΤΑΘΕΡΑ: " + this.callsToStatheroTotalSeconds + //getCallsToStatheroTotalSeconds() +
                    "sec. Συνολικό κόστος κλήσεων προς ΣΤΑΘΕΡΑ: " + df.format(this.cost(phoneType)) + "€.");// df.format(this.cost('2')) + "€.");
            case '6':
                return ("Γραμμή: " + this.getPhoneNumber() + ". Συνολικός χρόνος κλήσεων προς ΚΙΝΗΤΑ: " + this.callsToKinitoTotalSeconds + // .getCallsToKinitoTotalSeconds() +
                    "sec. Συνολικό κόστος κλήσεων προς ΚΙΝΗΤΑ: " + df.format(this.cost(phoneType)) + "€.");//df.format(this.cost('6')) + "€.");
            case 'A':
                return ("Γραμμή: " + this.getPhoneNumber() + ". Συνολικός χρόνος κλήσεων προς ΟΛΑ: " + this.totalSecondsOnCall +
                    "sec. Συνολικό κόστος κλήσεων προς ΟΛΑ: " + df.format((this.cost('2') + this.cost('6'))) + "€.");// +

            default: return ("ΔΟΘΗΚΕ ΛΑΘΟΣ ΕΙΔΟΣ ΤΗΛΕΦΩΝΟΥ.");
        }
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
        this.callsToKinitoTotalSeconds = this.callsToKinitoTotalSeconds + new_callSeconds;
    }
    // Set-Get totalSecondsOnCalls
    public int getTotalSecondsOnCalls() {
        return this.totalSecondsOnCall;
    }
    public void setTotalSecondsOnCalls(int new_totalSecondsOnCall) {
        this.totalSecondsOnCall = this.totalSecondsOnCall +  new_totalSecondsOnCall;
    }
    // Set-Get totalCallsCost
    public float getTotalCallsCost() {
        return this.totalCallsCost;
    }
    public void setTotalCallsCost(float new_totalCallsCost) {
        this.totalCallsCost = this.cost('2') + this.cost('6');//this.totalCallsCost + new_totalCallsCost;
    }
    // Return all attributes in one string
    public String toString() {
        float dummy_totalCost = this.cost('2') + this.cost('6');
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        return ("Γραμμή: " + this.arithmosTilefonou + ". Σύνολο δευτερολέπτων σε κλήση: " + this.totalSecondsOnCall + ". Συνολικό κόστος κλήσεων: " + df.format(this.totalCallsCost) + "€.");
    }
}
