public class Payment extends Transaction implements iFinancialTransaction{
    private double paidAmount;
    private double vAT;

    // Default constructor
    public Payment() {
        this.vAT = 0;
        this.paidAmount = 0;
    }
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

    @Override
    public double getAmmountWithVAT() {
        return this.paidAmount + this.vAT;
    }

    public String toString() {
        return "id: " + super.getId() + ", paidAmount: " + this.paidAmount + ", vAT: " + this.vAT;
    }
}
