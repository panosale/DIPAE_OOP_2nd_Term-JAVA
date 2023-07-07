public class Customer {
    private final int MAX_PAYMENTS = 10; // Αν θέλουμε παραλείπουμε τη σταθερά αλλά πρέπει να χρησιμοποιούμε παντού το μέγεθος πίνακα που δίνεται (10)
    private int id;
    private double balance;
    private Payment[] payments; // Έχουμε Σύνθεση και όχι κανονική Κληρονομικότητα.

    // Default Constructor
    public Customer() {
    }
    // Full Constructor
    public Customer(int newId,  double newBalance) {
        this.id = newId;
        this.balance = newBalance;
        this.payments = new Payment[MAX_PAYMENTS]; // Δημιουργία του πίνακα αντικειμένων Payment.
        for (int i = 0; i < MAX_PAYMENTS; i++) { // Αρχικοποίηση όλων των θέσεων του πίνακα με 0. Θα χρειαστεί παρακάτω στη μέθοδο AddPayment().
            this.payments[i] = new Payment(); // Δημιουργία νέου αντικειμένου Payment στη θέση [i] του πίνακα payments.
            this.payments[i].setvAT(0);
            this.payments[i].setPaidAmount(0);
        }
    }

    public void AddPayment(double paymnt) {
/*
        Οι παρακάω γραμμές μπορούν να βελτιωθούν ώστε αν το balance είναι 0 (άρα δεν υπάρχει χρωστούμενο ποσό) να μην τις εκτελεί καθόλου.
        Αυτό μπορεί να γίνει εδώ με το ανάλογο if ή στη main πριν την κλήση της AddPayment.
*/        
        try {
            if (paymnt > this.balance) // Αν η πληρωμή που δόθηκε με παράμετρο (paymnt) είναι μεγαλύτερη απ' το υπόλοιπο χρωστούμενο πόσο...
                throw new CustomerBalanceException(); // ... "πετάει" το exception που ζητάει η άσκηση.
            for (int i = 0; i < payments.length; i++)
                if (payments[i].getAmmountWithVAT() == 0) { // Βρίσκει την επόμενη κενή θέση του πίνακα πληρωμών (payments) ώστε να καταχωρήσει τη νέα πληρωμή (paymnt).
                    // 1ος τρόπος
                    payments[i].setvAT(paymnt * 0.24); // Το ποσοστό του φόρου είναι σταθερό 24%. *** ΚΑΛΟ ΕΙΝΑΙ ΝΑ ΤΟ ΔΙΕΥΚΡΙΝΗΣΕΙ Ο ΚΑΘΗΓΗΤΗΣ.
                    payments[i].setPaidAmount(paymnt - payments[i].getvAT());
                    // 2ος τρόπος. Εναλλακτικά μπορεί να γίνει και με την παρακάτω μέθοδο αρκεί να απενεργοποιηθούν οι δυο γραμμές του 1ου τρόπου.
                    //this.setPayments(i, paymnt - (paymnt * 0.24), paymnt * 0.24); // Το ποσοστό του φόρου είναι σταθερό 24%. *** ΚΑΛΟ ΕΙΝΑΙ ΝΑ ΤΟ ΔΙΕΥΚΡΙΝΗΣΕΙ Ο ΚΑΘΗΓΗΤΗΣ.
                    this.balance = this.balance - paymnt; // Αφαιρεί από το υπόλοιπο χρωστούμενο, την πληρωμή που δόθηκε με παράμετρο (paymnt).
                    return; // Αφού έχει καταχωρηθεί μια πληρωμή σε κενή θέση του πίνακα, "σπάει" η επανάληψη for.
                }
        }
        catch (CustomerBalanceException msg) { // "Πιάνει" το exception που ζητάει η άσκηση.
            System.out.println("Exception! Το ποσό πληρωμής είναι μεγαλύτερο από το υπόλοιπο. Η πληρωμή δεν καταχωρήθηκε."); // Εμφανίζει το μήνυμα του exception που ζητάει η άσκηση.
        }
    }
    // Μέθοδοι get, set & toString
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getPayments(int i) {
        return this.payments[i].toString();
    }
    public void setPayments(int i, double newPaidAmmount, double newVAT) {
        this.payments[i].setPaidAmount(newPaidAmmount);
        this.payments[i].setvAT(newVAT);
    }

    public String toString() {
        String tmpStr = "";
        for (int i = 0; i < payments.length; i++)
            tmpStr = tmpStr + "Payment no[" + i +"]: " + this.payments[i].getAmmountWithVAT() + "\n";
        return "id: " + this.id + ", Payments: \n" + tmpStr;
    }
}