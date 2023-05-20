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
	abstract void dial(String numberToCall, int tmp_dialDuration); // Υλοποιείται διαφορετικά σε κάθε είδος τηλέφώνου (ΣΤΑΘΕΡΟ/ΚΙΝΗΤΟ)
    public float cost(char phoneType) {
        float tmp_callsCost = 0.0f;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        switch (phoneType) {
            case '2':
                tmp_callsCost = this.callsToStatheroTotalSeconds * this.callToStatheroCostPerSecond;
                break;
//                return this.callsToStatheroTotalSeconds * this.callToStatheroCostPerSecond; //this.calcCallsToStatheroTotalCost(); // FOR DELETE
            case '6': // ΚΟΣΤΟΣ ΚΛΗΣΕΩΝ ΠΡΟΣ ΣΤΑΘΕΡΑ
                tmp_callsCost = this.callsToKinitoTotalSeconds * this.callToKinitoCostPerSecond;
                break;
//                return this.callsToKinitoTotalSeconds * this.callToKinitoCostPerSecond; //this.calcCallsToKinitoTotalCost(); // FOR DELETE
//            case 'A': // ΚΟΣΤΟΣ ΚΛΗΣΕΩΝ ΠΡΟΣ ΟΛΑ // FOR DELETE
//                tmp_callsCost = this.cost('A'); // FOR DELETE
//                return (this.callsToStatheroTotalSeconds * this.callToStatheroCostPerSecond) + // FOR DELETE
//                        (this.callsToKinitoTotalSeconds * this.callToKinitoCostPerSecond);//this.calcCallsToStatheroTotalCost() + this.calcCallsToKinitoTotalCost(); // FOR DELETE
            default:
                tmp_callsCost = 0.0f;
                break;
//                return -1; // FOR DELETE
        }
        this.totalCallsCost = this.totalCallsCost + tmp_callsCost;
        return tmp_callsCost;
    }
    public String showSecondsAndCost(char phoneType) { // ΕΙΝΑΙ ΙΔΙΑ ΓΙΑ ΟΛΕΣ ΤΙΣ ΥΠΟΚΛΑΣΕΙΣ
        //float tmp_totalCallsToStatheroCost = 0.0f, tmp_totalCallsToKinitoCost = 0; NO USE
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        switch (phoneType) {
            case '2':
                return ("Συνολικός χρόνος κλήσεων προς ΣΤΑΘΕΡΑ: " + this.callsToStatheroTotalSeconds + //getCallsToStatheroTotalSeconds() +
                    "sec. Συνολικό κόστος κλήσεων προς ΣΤΑΘΕΡΑ: " + this.callsToStatheroTotalSeconds * this.callToStatheroCostPerSecond + "€.");// df.format(this.cost('2')) + "€.");
            case '6':
                return ("Συνολικός χρόνος κλήσεων προς ΚΙΝΗΤΑ: " + this.callsToKinitoTotalSeconds + // .getCallsToKinitoTotalSeconds() +
                    "sec. Συνολικό κόστος κλήσεων προς ΚΙΝΗΤΑ: " + this.callsToKinitoTotalSeconds * this.callToKinitoCostPerSecond + "€.");//df.format(this.cost('6')) + "€.");
            case 'A':
                return ("Συνολικός χρόνος κλήσεων προς ΟΛΑ: " + this.totalSecondsOnCall +
                    "sec. Συνολικό κόστος κλήσεων προς ΟΛΑ: " + this.callsToStatheroTotalSeconds + this.callsToKinitoTotalSeconds + "€.");// +

            default: return ("ΔΟΘΗΚΕ ΛΑΘΟΣ ΕΙΔΟΣ ΤΗΛΕΦΩΝΟΥ.");
        }
    }
/*
    public float calcCallsToStatheroTotalCost() {
        return this.callsToStatheroTotalSeconds * this.callToStatheroCostPerSecond;
    }

*/
/*
    public float calcCallsToKinitoTotalCost() {
        return this.callsToKinitoTotalSeconds * this.callToKinitoCostPerSecond;
    }

*/
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
    // Set-Get totalCallsCost
    public void setTotalCallsCost(int new_totalCallsCost) {
        this.totalCallsCost = new_totalCallsCost;
    }
    public float getTCallsCost() {
        return this.totalCallsCost;
    }
    // Return all attributes in one string
    public String toString() {
        return ("Γραμμή: " + this.arithmosTilefonou + ". Σύνολο δευτερολέπτων σε κλήση: " + this.totalSecondsOnCall + ". Συνολικό κόστος κλήσεων: " + this.totalCallsCost + "€.");
    }
}
