public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer(1, 1000);
/*      // Για δοκιμές
        cust.AddPayment(10);
        cust.AddPayment(100);
        cust.AddPayment(1000);
*/
        for (int i = 0; i < 10; i++) {
            System.out.print("Δώσε το ποσό πληρωμής[" + i + "] : ");
            cust.AddPayment(UserInput.getDouble());
        }

        System.out.println(cust.toString());
    }
}