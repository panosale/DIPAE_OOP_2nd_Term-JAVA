public class Customer {
    private final int MAX_PAYMENTS = 10; // Αν θέλουμε παραλείπουμε τη σταθερά αλλά πρέπει να χρησιμοποιούμε παντού το μέγεθος πίνακα που δίνεται (10)
    private int id;
    private double balance;
    private Payment[] payments;

    // Default Constructor
    public Customer() {
    }
    // Full Constructor
    public Customer(int newId,  double newBalance) {
        this.id = newId;
        this.balance = newBalance;
        this.payments = new Payment[MAX_PAYMENTS];
        for (int i = 0; i < MAX_PAYMENTS; i++) {
            this.payments[i] = new Payment();
            this.payments[i].setvAT(0);
            this.payments[i].setPaidAmount(0);
        }
    }

    public void AddPayment(double paymnt){
        try {
            if (paymnt > this.balance)
                throw new CustomerBalanceException();
            for (int i = 0; i < payments.length; i++)
                if (payments[i].getAmmountWithVAT() == 0) {
                    // 1ος τρόπος
                    payments[i].setvAT(paymnt * 0.24); // Το ποσοστό του φόρου είναι σταθερό 24%
                    payments[i].setPaidAmount(paymnt - payments[i].getvAT());
                    // 2ος τρόπος. Εναλλακτικά γίνεται και με την παρακάτω μέθοδο αρκεί να απενεργοποιηθούν οι δυο παραπάνω γραμμές
                    //this.setPayments(i, paymnt - (paymnt * 0.24), paymnt * 0.24); // Το ποσοστό του φόρου είναι σταθερό 24%
                    this.balance = this.balance - paymnt;
                    return;
                }
        }
        catch (CustomerBalanceException msg) {
            System.out.println("Exception! Το ποσό πληρωμής είναι μεγαλύτερο από το υπόλοιπο. Η πληρωμή δεν καταχωρήθηκε.");
        }
    }
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
