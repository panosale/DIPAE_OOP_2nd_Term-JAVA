// Genikefsi - Polymorfismos #2
// ergastirio 9

import java.text.DecimalFormat;

public class TestTilefono {
    // Έυρεση prefix, 2 (για σταθερό), 6 (για κινητό) τυχαίου αριθμού
    // Δέχεται για παραμέτρους (2 για σταθερό, 6 για κινητό) και 0 για οποιοδήποτε μεταξύ των 2 και 6
    public static String getRandomTelephoneNumber(int new_prefix) {
        byte tmp_prefix;
        Long tmp_number;
        String tmp_num2str;
        if (new_prefix != 0) {
            do {
                do {
                    tmp_prefix = (byte)Math.round(Math.random() * 10);
                } while (tmp_prefix != new_prefix);
                tmp_number = Math.round(Math.random() * 1000000000); // Επιστρέφει 9ψήφιο αριθμό
                tmp_num2str = tmp_prefix + tmp_number.toString(); // Προσθέτει το tmp_prefix ώστε να γίνει 10ψήφιος ο αριθμός
            } while (tmp_num2str.length() != 10);
        }
        else {
            do {
                do {
                    tmp_prefix = (byte)Math.round(Math.random() * 10);
                } while (tmp_prefix != 2 && tmp_prefix != 6);
                tmp_number = Math.round(Math.random() * 1000000000); // Επιστρέφει 9ψήφιο αριθμό
                tmp_num2str = tmp_prefix + tmp_number.toString(); // Προσθέτει το tmp_prefix ώστε να γίνει 10ψήφιος ο αριθμός
            } while (tmp_num2str.length() != 10);
        }
        return tmp_num2str;
    }
    public static void main(String[] args) {
        // Δήλωση μεταβλητών
        DecimalFormat df = new DecimalFormat(); // Για στρογγυλοποίηση των δεκαδικών ψηφίων του float
        df.setMaximumFractionDigits(2); // Για στρογγυλοποίηση των δεκαδικών ψηφίων του float
        int n, tmp_secondsOnCall, tmp_numOfRandomCalls;
        int arithmosStatheron, arithmosKiniton; // Για τον υπολογισμό των τηλεφώνων
        int tmp_thesi, tmp_Stathera = 0, tmp_Kinita = 0;
        final float posostoStatheron = 0.6f;
        System.out.print("Δώσε τον αριθμό των γραμμών της επιχείρησης: ");
        n = UserInput.getInteger();
        arithmosStatheron = Math.round(n * posostoStatheron);
        arithmosKiniton = n - arithmosStatheron;
        System.out.println("***** Σταθερά  για υπολογισμό: " + arithmosStatheron + ". Κινητά για υπολογισμό: " + arithmosKiniton + ". *****\n");
        // Δήλωση και αρχικοποίηση αντικειμένων
        // Αρχικοποίηση πίνακα [n] θέσεων αντικειμένων της υπερκλάσης Tilefono()
        Tilefono[] tilefona = new Tilefono[n];
        // Εισαγωγή τηλεφώνων σε τυχαίες θέσεις του πίνακα ανάλογα με τα ποσοστά τους
        System.out.println("***** Υπολογισμός ΣΤΑΘΕΡΩΝ τηλεφώνων. Παρακαλώ περιμένετε *****");
        while (tmp_Stathera < arithmosStatheron) {
            tmp_thesi = (int) (Math.random() * n); // Εύρεση τυχαίας θέσης του αντικειμένου <Stathero> στον πίνακα
            //tmp_secondsOnCall = 200; // ΓΙΑ ΔΟΚΙΜΕΣ
            //tmp_secondsOnCall = (int)Math.round(Math.random() * 1000); // ΖΗΤΕΙΤΑΙ ΑΠΟ ΤΗΝ ΑΣΚΗΣΗ. Χρησιμοποιείται παρακάτω
            if (tilefona[tmp_thesi] == null) { // Αν το τηλέφωνο στη θέση [tmp_thesi] είναι null σημαίνει ότι η θέση έχει ακόμα το αρχικό ανρκείμενο Tilefono άρα είναι ελεύθερη
                Stathero tmpStathero = new Stathero(getRandomTelephoneNumber(2));
                // Οι παρακάτω γραμμές μπορούνα να αλλαχτούν ώστε να ζητούνται από τον χρήστη τα στοιχεία της γραμμής
                tilefona[tmp_thesi] = tmpStathero;
                //tilefona[tmp_thesi].dial(getRandomTelephoneNumber(0), tmp_secondsOnCall); // // Χρησιμοποιείται παρακάτω
                tmp_Stathera++;
            }
        }
        System.out.println("***** ΣΤΑΘΕΡΑ τηλέφωνα, υπολογίστηκαν. Συνεχίζουμε... *****\n");
        System.out.println("***** Υπολογισμός ΚΙΝΗΤΩΝ τηλεφώνων. Παρακαλώ περιμένετε *****");
        while (tmp_Kinita < arithmosKiniton) {
            tmp_thesi = (int)(Math.random() * n); // Εύρεση τυχαίας θέσης του αντικειμένου <Kinito> στον πίνακα
            //tmp_secondsOnCall = 200; // ΓΙΑ ΔΟΚΙΜΕΣ
            //tmp_secondsOnCall = (int)Math.round(Math.random() * 1000); // ΖΗΤΕΙΤΑΙ ΑΠΟ ΤΗΝ ΑΣΚΗΣΗ. Χρησιμοποιείται παρακάτω
            if (tilefona[tmp_thesi] == null) { // Αν το τηλέφωνο στη θέση [tmp_thesi] είναι null σημαίνει ότι η θέση έχει ακόμα το αρχικό ανρκείμενο Tilefono άρα είναι ελεύθερη
                Kinito tmpKinito = new Kinito(getRandomTelephoneNumber(6));
                // Οι παρακάτω γραμμές μπορούνα να αλλαχτούν ώστε να ζητούνται από τον χρήστη τα στοιχεία της γραμμής
                tilefona[tmp_thesi] = tmpKinito;
                //tilefona[tmp_thesi].dial(getRandomTelephoneNumber(0), tmp_secondsOnCall); // Χρησιμοποιείται παρακάτω
                tmp_Kinita++;
            }
        }
        System.out.println("***** ΚΙΝΗΤΑ τηλέφωνα, υπολογίστηκαν. Συνεχίζουμε... *****\n");
        System.out.println("***************** Ο ΠΙΝΑΚΑΣ ΓΕΜΙΣΕ *****************");
        // Γέμισμα πίνακα με τυχαίες κλήσεις
        tmp_numOfRandomCalls = (int)Math.round(Math.random() * 1900) + 100; // Τυχαίος αριθμός κλήσεων από 100 έως 2000
        for (int i = 1; i < tmp_numOfRandomCalls; i++) {
            tmp_thesi = (int)Math.abs(Math.round(Math.random() * n - 1)); // Τυχαία θέση στον πίνακα τηλεφώνων για εξερχόμενη κλήση της γραμμής
            tmp_secondsOnCall = (int)Math.round(Math.random() * 595) + 5; // Τυχαία διάρκεια κλήσης από 5 έως 600 δευτερόλεπτα
            System.out.print("Α/Α κλήσης: " + i + ": ");
            tilefona[tmp_thesi].dial(getRandomTelephoneNumber(0), tmp_secondsOnCall);
        }
        System.out.println("***************** Ο ΠΙΝΑΚΑΣ ΓΕΜΙΣΕ ΜΕ [" + tmp_numOfRandomCalls + "] ΤΥΧΑΙΕΣ ΚΛΗΣΕΙΣ *****************");
        // Εμφάνιση αποτελεσμάτων - Ζητούμενα άσκησης
        System.out.println("*********************************************************************************");
        System.out.println("******************************* ΖΗΤΟΥΜΕΝΑ ΑΣΚΗΣΗΣ *******************************");
        // Ζητούμενο άσκησης i.
        System.out.println("***** i. Κατάλογος με τον αριθμό και το συνολικό κόστος κάθε τηλεφώνου **********");
        for (int i = 0; i < n; i++)
            System.out.println("[" + i +"] " + tilefona[i]);
        System.out.println("*********************************************************************************");
        // Ζητούμενο άσκησης ii.
        System.out.println("***** ii. Σύνολο δευτερολέπτων και κόστους κλήσεων των ΣΤΑΘΕΡΩΝ τηλεφώνων *******");
        int tmp_callsSecondsFromStahera = 0;
        float tmp_callsCostFromStahera = 0.0f;
        for (int i = 0; i < n; i++)
            if (tilefona[i] instanceof Stathero) {
                tmp_callsSecondsFromStahera = tmp_callsSecondsFromStahera + ((Stathero)tilefona[i]).getTotalSecondsOnCallFromLine();
                tmp_callsCostFromStahera = tmp_callsCostFromStahera + ((Stathero)tilefona[i]).getTotalCostFromLine();
            }
        System.out.println(tmp_callsSecondsFromStahera + "sec. / " + df.format(tmp_callsCostFromStahera) + "€.");
        System.out.println("*********************************************************************************");
        // Ζητούμενο άσκησης iii.
        System.out.println("***** iii. Σύνολο δευτερολέπτων και κόστους κλήσεων των ΚΙΝΗΤΩΝ τηλεφώνων *******");
        int tmp_callsSecondsFromKinita = 0;
        float tmp_callsCostFromKinita = 0.0f;
        for (int i = 0; i < n; i++)
            if (tilefona[i] instanceof Kinito) {
                tmp_callsSecondsFromKinita = tmp_callsSecondsFromKinita + ((Kinito)tilefona[i]).getTotalSecondsOnCallFromLine();
                tmp_callsCostFromKinita = tmp_callsCostFromKinita + ((Kinito)tilefona[i]).getTotalCostFromLine();
            }
        System.out.println(tmp_callsSecondsFromKinita + "sec. / " + df.format(tmp_callsCostFromKinita) + "€.");
        System.out.println("*********************************************************************************");
        // Ζητούμενο άσκησης iv.
        float tmp_sumOfCostToStathera = 0.0f;
        System.out.print("***** iv. Συνολικό κόστος κλήσεων προς ΣΤΑΘΕΡΑ: ");
        for (int i = 0; i < n; i++)
            tmp_sumOfCostToStathera = tmp_sumOfCostToStathera + (tilefona[i].getCallsToStatheroTotalSeconds() * tilefona[i].getCallToStatheroCostPerSecond());
        System.out.println(df.format(tmp_sumOfCostToStathera) + "€. *******************");
        System.out.println("*********************************************************************************");
        // Ζητούμενο άσκησης v.
        float tmp_sumOfCostToKinita = 0.0f;
        System.out.print("***** v. Συνολικό κόστος κλήσεων προς ΚΙΝΗΤΑ: ");
        for (int i = 0; i < n; i++)
            tmp_sumOfCostToKinita = tmp_sumOfCostToKinita + (tilefona[i].getCallsToKinitoTotalSeconds() * tilefona[i].getCallToKinitoCostPerSecond());
        System.out.println(df.format(tmp_sumOfCostToKinita) + "€. *******************");
        System.out.println("*********************************************************************************");
        System.out.print("***** vi. Συνολικό κόστος κλήσεων της επιχείρησης: "); // Ζητούμενο άσκησης vi.
        float tmp_totalSumOfCost = tmp_sumOfCostToStathera + tmp_sumOfCostToKinita;
        System.out.println(df.format(tmp_totalSumOfCost) + "€. *******************");
    }
}
