public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer(1, 1000); // Δημιουργία αντικειμένου "πελάτη"
/*      // ΓΙΑ ΔΟΚΙΜΕΣ
        cust.AddPayment(10);
        cust.AddPayment(100);
        cust.AddPayment(1000);
*/
        for (int i = 0; i < 10; i++) {
            System.out.print("Δώσε το ποσό πληρωμής[" + i + "] : ");
            cust.AddPayment(UserInput.getDouble());
            System.out.println(cust.getBalance()); // ΓΙΑ ΕΛΕΓΧΟ ΣΩΣΤΗΣ ΛΕΙΤΟΥΡΓΙΑΣ
            System.out.println(cust.getPayments(i)); // ΓΙΑ ΕΛΕΓΧΟ ΣΩΣΤΗΣ ΛΕΙΤΟΥΡΓΙΑΣ
        }

        System.out.println(cust.toString());
    }
}
