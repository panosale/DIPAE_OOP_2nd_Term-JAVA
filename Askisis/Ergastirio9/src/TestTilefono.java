// Genikefsi - Polymorfismos #2
// ergastirio 9

public class TestTilefono {
    // Έυρεση prefix 2 (για σταθερό), 6 (για κινητό) τυχαίου αριθμού
    // Δέχεται για παραμέτρους 2 για σταθερό, 6 για κινητό και 0 για οποιοδήποτε μεταξύ των 2 και 6
    public static String getRandomTelephoneNumber(int new_prefix) {
        byte tmp_prefix;
        Long tmp_number;
        String tmp_num2str;
        if (new_prefix != 0) {
            do {
                do {
                    tmp_prefix = (byte)Math.round(Math.random() * 10);
                    //System.out.println("tmp_prefix: " + tmp_prefix); // ΓΙΑ ΕΛΕΓΧΟΥΣ. ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ
                } while (tmp_prefix != new_prefix);
                tmp_number = Math.round(Math.random() * 1000000000); // Επιστρέφει 9ψήφιο αριθμό
                tmp_num2str = tmp_prefix + tmp_number.toString(); // Προσθέτει το tmp_prefix ώστε να γίνει 10ψήφιος ο αριθμός
                //System.out.println(tmp_number); // ΓΙΑ ΕΛΕΓΧΟΥΣ. ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ
                //System.out.println(tmp_num2str); // ΓΙΑ ΕΛΕΓΧΟΥΣ. ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ
            } while (tmp_num2str.length() != 10);
        }
        else {
            do {
                do {
                    tmp_prefix = (byte)Math.round(Math.random() * 10);
                    //System.out.println("tmp_prefix: " + tmp_prefix); // ΓΙΑ ΕΛΕΓΧΟΥΣ. ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ
                } while (tmp_prefix != 2 && tmp_prefix != 6);
                tmp_number = Math.round(Math.random() * 1000000000); // Επιστρέφει 9ψήφιο αριθμό
                tmp_num2str = tmp_prefix + tmp_number.toString(); // Προσθέτει το tmp_prefix ώστε να γίνει 10ψήφιος ο αριθμός
                //System.out.println(tmp_number); // ΓΙΑ ΕΛΕΓΧΟΥΣ. ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ
                //System.out.println(tmp_num2str); // ΓΙΑ ΕΛΕΓΧΟΥΣ. ΔΕΝ ΧΡΕΙΑΖΕΤΑΙ
            } while (tmp_num2str.length() != 10);
        }
        return tmp_num2str;
    }
    public static void main(String[] args) {
        // Dilosi metavliton
        int n, tmp_secondsOnCall;
        // Gia ton ypologismo ton pososton ton oximaton
        int arithmosStatheron, arithmosKiniton;
        int tmp_thesi, tmp_Stathera = 0, tmp_Kinita = 0, tmp_undefinedLines = 0;
        final float posostoStatheron = 0.6f;
//        final float posostoKiniton = 0.4f; // DEN XREIAZETAI
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
            tmp_secondsOnCall = (int)Math.round(Math.random() * 1000); // ΖΗΤΕΙΤΑΙ ΑΠΟ ΤΗΝ ΑΣΚΗΣΗ
            if (tilefona[tmp_thesi] == null) { // Αν το τηλέφωνο στη θέση [tmp_thesi] είναι null σημαίνει ότι η θέση έχει ακόμα το αρχικό ανρκείμενο Tilefono άρα είναι ελεύθερη
                Stathero tmpStathero = new Stathero(getRandomTelephoneNumber(2));
                // Οι παρακάτω γραμμές μπορούνα να αλλαχτούν ώστε να ζητούνται από τον χρήστη τα στοιχεία της γραμμής
                tilefona[tmp_thesi] = tmpStathero;
                tilefona[tmp_thesi].dial(getRandomTelephoneNumber(0), tmp_secondsOnCall);
                tmp_Stathera++;
            }
        }
        System.out.println("***** ΣΤΑΘΕΡΑ τηλέφωνα, υπολογίστηκαν. Συνεχίζουμε... *****\n");
        System.out.println("***** Υπολογισμός ΚΙΝΗΤΩΝ τηλεφώνων. Παρακαλώ περιμένετε *****");
        while (tmp_Kinita < arithmosKiniton) {
            tmp_thesi = (int)(Math.random() * n); // Εύρεση τυχαίας θέσης του αντικειμένου <Kinito> στον πίνακα
            //tmp_secondsOnCall = 200; // ΓΙΑ ΔΟΚΙΜΕΣ
            tmp_secondsOnCall = (int)Math.round(Math.random() * 1000); // ΖΗΤΕΙΤΑΙ ΑΠΟ ΤΗΝ ΑΣΚΗΣΗ
            if (tilefona[tmp_thesi] == null) { // Αν το τηλέφωνο στη θέση [tmp_thesi] είναι null σημαίνει ότι η θέση έχει ακόμα το αρχικό ανρκείμενο Tilefono άρα είναι ελεύθερη
                Kinito tmpKinito = new Kinito(getRandomTelephoneNumber(6));
                // Οι παρακάτω γραμμές μπορούνα να αλλαχτούν ώστε να ζητούνται από τον χρήστη τα στοιχεία της γραμμής
                tilefona[tmp_thesi] = tmpKinito;
                tilefona[tmp_thesi].dial(getRandomTelephoneNumber(0), tmp_secondsOnCall);
                tmp_Kinita++;
            }
        }
        System.out.println("***** ΚΙΝΗΤΑ τηλέφωνα, υπολογίστηκαν. Συνεχίζουμε... *****\n");
/*
        System.out.println("***************** Ο ΠΙΝΑΚΑΣ ΓΕΜΙΣΕ *****************");
        // Emfanisi apotelesmaton
        tmp_Kinita = 0;
        tmp_Stathera = 0;
        for (int i = 0; i < n; i++) {
            if (tilefona[i] instanceof Stathero)
                tmp_Stathera++;
            else if ((tilefona[i] instanceof Kinito))
                tmp_Kinita++;
            else tmp_undefinedLines++;
            System.out.println("To Τηλέφωνο[" + i + "]" + " είναι κλάσης: " + tilefona[i].getClass()); // GIA ELEGXO
            System.out.println(tilefona[i]);
            System.out.println("--------------------------");
        }
        // Emfanisi synolikou arithmou oximaton pou dimiourgithikan gia epalithefsi
        System.out.println("***** Υπολογισμένα σταθερά: " + tmp_Stathera + ", Υπολογισμένα κινητά: " + tmp_Kinita +
                ", Υπολογισμένα μη αναγνωρισμένα τηλέφωνα : " + tmp_undefinedLines + ". *****");

*/

/*
        Stathero stath1 = new Stathero(getRandomTelephoneNumber(2)); // Kanoniki arxikopoiisi
        Kinito kin1 = new Kinito(getRandomTelephoneNumber(6)); // Kanoniki arxikopoiisi

        Stathero stath2 = new Stathero(); // GIA DOKIMES
        Kinito kin2 = new Kinito(); // GIA DOKIMES
        stath2.setPhoneNumber(getRandomTelephoneNumber(2)); // GIA DOKIMES
        kin2.setPhoneNumber(getRandomTelephoneNumber(6)); // GIA DOKIMES
        kin2.setCallToStatheroCostPerSecond(0.06f); // GIA DOKIMES
        kin2.setCallToKinitoCostPerSecond((0.07f)); // GIA DOKIMES
        stath2.setCallToStatheroCostPerSecond(0.02f); // GIA DOKIMES
        stath2.setCallToKinitoCostPerSecond(0.05f); // GIA DOKIMES

        System.out.println("Σταθερό 1: (σύνολο) " + stath1);
        System.out.println("Σταθερό 2: (σύνολο) " + stath2);
        System.out.println("Κινητό 2 συνολο: " + kin1 );
        System.out.println("Κινητό 2 συνολο: " + kin2 );
        System.out.println("Stahero 1:");
        stath1.dial("2621111333", tmp_secondsOnCall);
        stath1.dial("6921111125", tmp_secondsOnCall);
        System.out.println("Stahero 2:");
        stath2.dial("2622222233", tmp_secondsOnCall);
        stath2.dial("6922222225", tmp_secondsOnCall);
        System.out.println("Κινητό 1:");
        kin1.dial("2621111333", tmp_secondsOnCall);
        kin1.dial("6921111125", tmp_secondsOnCall);
        System.out.println("Κινητό 2:");
        kin2.dial("2622222233", tmp_secondsOnCall);
        kin2.dial("6922222225", tmp_secondsOnCall);
        System.out.println("Σταθερό 1 πρός ΣΤΑΘΕΡΑ: " + stath1.cost('2') + "€.");
        System.out.println("Σταθερό 1 πρός ΚΙΝΗΤΑ: " + stath1.cost('6') + "€.");
//        System.out.println("Σταθερό 1 πρός ΟΛΑ: " + stath1.cost('A'));
        System.out.println("Σταθερό 2 πρός ΣΤΑΘΕΡΑ: " + stath2.cost('2') + "€.");
        System.out.println("Σταθερό 2 πρός ΚΙΝΗΤΑ: " + stath2.cost('6') + "€.");
//        System.out.println("Σταθερό 2 πρός ΟΛΑ: " + stath2.cost('A'));
        System.out.println("KINHTO 1 πρός ΣΤΑΘΕΡΑ: " + kin1.cost('2') + "€.");
        System.out.println("KINHTO 1 πρός ΚΙΝΗΤΑ: " + kin1.cost('6') + "€.");
//        System.out.println("KINHTO 1 πρός ΟΛΑ: " + kin1.cost('A'));
        System.out.println("KINHTO 2 πρός ΣΤΑΘΕΡΑ: " + kin2.cost('2') + "€.");
        System.out.println("KINHTO 2 πρός ΚΙΝΗΤΑ: " + kin2.cost('6') + "€.");
//        System.out.println("KINHTO 2 πρός ΟΛΑ: " + kin2.cost('A'));
        System.out.println("Σταθερό 1: (σύνολο) " + stath1 + "\n" + stath1.showSecondsAndCost(('2')));
        System.out.println("Σταθερό 2: (σύνολο) " + stath2 + "\n" + stath2.showSecondsAndCost(('6')));
        System.out.println("Κινητό 1: (σύνολο) " + kin1 + "\n" + kin1.showSecondsAndCost(('A')));
        System.out.println("Κινητό 2: (σύνολο) " + kin2 + "\n" + kin2.showSecondsAndCost(('s')));
        System.out.println();
        System.out.println();
        Kinito kin3 = new Kinito("398012398");
        kin3.dial("699999999", 200);
        System.out.println(kin3.showSecondsAndCost('A'));



        Stathero stath1 = new Stathero(getRandomTelephoneNumber(0)); // Kanoniki arxikopoiisi
        Kinito kin1 = new Kinito(getRandomTelephoneNumber(0)); // Kanoniki arxikopoiisi
        System.out.println(stath1);
        System.out.println(kin1);
*/
        System.out.println();
        System.out.println();
        System.out.println(tilefona[0]);
        System.out.println("Με κόστος προς ΣΤΑΘΕΡΑ: " + tilefona[0].cost('2') + "€.");
        System.out.println("Με κόστος προς ΚΙΝΗΤΑ: " + tilefona[0].cost('6') + "€.");
        tilefona[0].dial("2222222222", 100);
        tilefona[0].dial("6666666666", 100);
        System.out.println("Με δευτερόλεπτα προς ΣΤΑΘΕΡΑ: " + tilefona[0].getCallsToStatheroTotalSeconds() + "sec.");
        System.out.println("Με κόστος προς ΣΤΑΘΕΡΑ: " + tilefona[0].cost('2') + "€.");
        System.out.println("Με δευτερόλεπτα προς ΚΙΝΗΤΑ: " + tilefona[0].getCallsToKinitoTotalSeconds() + "sec.");
        System.out.println("Με κόστος προς ΚΙΝΗΤΑ: " + tilefona[0].cost('6') + "€.");
        System.out.println("ΕΠΑΝΑΛΗΨΗ ΚΛΗΣΗΣ cost.");
        System.out.println("Με δευτερόλεπτα προς ΣΤΑΘΕΡΑ: " + tilefona[0].getCallsToStatheroTotalSeconds() + "sec.");
        System.out.println("Με κόστος προς ΣΤΑΘΕΡΑ: " + tilefona[0].cost('2') + "€.");
        System.out.println("Με δευτερόλεπτα προς ΚΙΝΗΤΑ: " + tilefona[0].getCallsToKinitoTotalSeconds() + "sec.");
        System.out.println("Με κόστος προς ΚΙΝΗΤΑ: " + tilefona[0].cost('6') + "€.");
        System.out.println(tilefona[0]);
        tilefona[0].dial("2222222222", 100);
        tilefona[0].dial("6666666666", 100);
        System.out.println("ΕΠΑΝΑΛΗΨΗ ΚΛΗΣΗΣ cost.");
        System.out.println("Με δευτερόλεπτα προς ΣΤΑΘΕΡΑ: " + tilefona[0].getCallsToStatheroTotalSeconds() + "sec.");
        System.out.println("Με κόστος προς ΣΤΑΘΕΡΑ: " + tilefona[0].cost('2') + "€.");
        System.out.println("Με δευτερόλεπτα προς ΚΙΝΗΤΑ: " + tilefona[0].getCallsToKinitoTotalSeconds() + "sec.");
        System.out.println("Με κόστος προς ΚΙΝΗΤΑ: " + tilefona[0].cost('6') + "€.");
        System.out.println(tilefona[0]);
        System.out.println("ΕΠΑΝΑΛΗΨΗ ΚΛΗΣΗΣ cost.");
        System.out.println("Με δευτερόλεπτα προς ΣΤΑΘΕΡΑ: " + tilefona[0].getCallsToStatheroTotalSeconds() + "sec.");
        System.out.println("Με κόστος προς ΣΤΑΘΕΡΑ: " + tilefona[0].cost('2') + "€.");
        System.out.println("Με δευτερόλεπτα προς ΚΙΝΗΤΑ: " + tilefona[0].getCallsToKinitoTotalSeconds() + "sec.");
        System.out.println("Με κόστος προς ΚΙΝΗΤΑ: " + tilefona[0].cost('6') + "€.");
        System.out.println(tilefona[0]);
    }
}
