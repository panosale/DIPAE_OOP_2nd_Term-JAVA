public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer(1, 1000); // Δημιουργία αντικειμένου "πελάτη" με id:1 και υπόλοιπο 1000€. Ζητούμενο της άσκησης.
/*      // ΓΙΑ ΔΟΚΙΜΕΣ
        cust.AddPayment(10);
        cust.AddPayment(100);
        cust.AddPayment(1000);
*/
        for (int i = 0; i < 10; i++) { // Καταχώρηση 10 πληρωμών. Ζητούμενο της άσκησης.
            System.out.print("Δώσε το ποσό πληρωμής[" + i + "] : ");
            cust.AddPayment(UserInput.getDouble());
            System.out.println(cust.getBalance()); // ΓΙΑ ΕΛΕΓΧΟ ΣΩΣΤΗΣ ΛΕΙΤΟΥΡΓΙΑΣ
            System.out.println(cust.getPayments(i)); // ΓΙΑ ΕΛΕΓΧΟ ΣΩΣΤΗΣ ΛΕΙΤΟΥΡΓΙΑΣ
        }

        System.out.println(cust.toString());
    }
}
