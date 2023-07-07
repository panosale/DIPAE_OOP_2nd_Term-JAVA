public class Payment extends Transaction implements iFinancialTransaction{
    private double paidAmount;
    private double vAT;

    // Default constructor
    public Payment() { // Αρχικοποίηση των χαρακτηριστικών της κλάσης.
        this.vAT = 0;
        this.paidAmount = 0;
    }

    @Override
    public double getAmmountWithVAT() { // Υλοποίηση της getAmmountWithVAT() που δηλώνεται στο interface iFinancialTransaction. Ζητούμενο της άσκησης.
        return this.paidAmount + this.vAT;
    }

    // Μέθοδοι get, set & toString
    public void setvAT(double vAT) {
        this.vAT = vAT;
    }

    public double getvAT() {
        return this.vAT;
    }

    public double getPaidAmount() {
        return this.paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getCode() {
        return super.getCode();
    }

    @Override
    public void setCode(String code) {
        super.setCode(code);
    }

    public String toString() {
        return "id: " + super.getId() + ", paidAmount: " + this.paidAmount + ", vAT: " + this.vAT;
    }
}
