abstract class Transaction {
  private int id;
  private String code;
  
}
public class Customer {
  private int id;
  private double balance;
  private Payment[] payments;
}

public class Payment extends Transaction {
  private double paidAmount;
  private double vAT;

  public String toString() {
    return "id: " + [TODO_here].getId + ", paidAmount: " + this.paidAmount + ", vAT: " + this.vAT;
  }
}
