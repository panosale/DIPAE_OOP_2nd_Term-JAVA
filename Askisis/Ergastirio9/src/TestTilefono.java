// Genikefsi - Polymorfismos #2
// ergastirio 9

public class TestTilefono {
    // Έυρεση prefix 2 (για σταθερό) ή 6 (για κινητό) τυχαίου αριθμού
    public static String getRandomTelephoneNumber(int new_prefix) {
        byte tmp_prefix;
        Long tmp_number;
        String tmp_num2str;
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
        return tmp_num2str;
    }
    public static void main(String[] args) {
        // Dilosi metavliton
        int n, tmp_secondsOnCall = 100;
        // Gia ton ypologismo ton pososton ton oximaton
        int arithmosStatheron, arithmosKiniton;
        int tmp_thesi, tmp_Stathera = 0, tmp_Kiniita = 0, tmp_undefinedLines = 0;
        final float posostoStatheron = 0.6f;
//        final float posostoKiniton = 0.4f; // DEN XREIAZETAI
        System.out.print("Δώσε τον αριθμό των γραμμών της επιχείρισης: ");
        n = UserInput.getInteger();
        arithmosStatheron = Math.round(n * posostoStatheron);
        arithmosKiniton = n - arithmosStatheron;
        System.out.println("***** Σταθερά  για υπολογισμό: " + arithmosStatheron + ". Κινητά για υπολογισμό: " + arithmosKiniton + ". *****\n");

        // Dilosi & arxikopoiisi antikeimenon
        //tmp_secondsOnCall = (int)Math.round(Math.random() * 1000); // ZITITAI APO TIN ASKISI

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


        System.out.println();
        System.out.println();

    }
}
