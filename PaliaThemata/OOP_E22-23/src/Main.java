public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer(1, 1000); // Δημιουργία αντικειμένου "πελάτη" με id:1 και υπόλοιπο 1000€. Ζητούμενο της άσκησης.
/*      // ΓΙΑ ΔΟΚΙΜΕΣ
        cust.AddPayment(10);
        cust.AddPayment(100);
        cust.AddPayment(1000);
*/
        for (int i = 0; i < 10; i++) { // Καταχώρηση 10 πληρωμών. Ζητούμενο της άσκησης.
            if (cust.getBalance() != 0) { // Έλεγχος αν μηδενίστηκε το υπόλοιπο του πελάτη.
                System.out.print("Δώσε το ποσό πληρωμής[" + i + "] : ");
                cust.AddPayment(UserInput.getDouble()); // Την εισαγωγή του χρήστη απ' το πληκτρολόγιο τη δίνει απευθείας σαν παράμετρο στη μέθοδο AddPayment().
                System.out.println(cust.getBalance()); // ΓΙΑ ΕΛΕΓΧΟ ΣΩΣΤΗΣ ΛΕΙΤΟΥΡΓΙΑΣ
                System.out.println(cust.getPayments(i)); // ΓΙΑ ΕΛΕΓΧΟ ΣΩΣΤΗΣ ΛΕΙΤΟΥΡΓΙΑΣ
            }
            else { // Αν μηδενίστηκε το υπόλοιπο του πελάτη εμφανίζει το κατάλληλο μήνυμα και "σπάει" το for.
                System.out.println("Το υπόλοιπο του πελάτη μηδενίστηκε.");
                break;
            }
        }

        System.out.println(cust.toString()); // Εμφανίζει τα στοιχεία όλων των πληρωμών. Ζητούμενο της άσκησης.
    }
}
