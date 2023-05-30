// Diasindesis - Pollapli klironomikotita
// ergastirio 11.1
public class Main {
    public static void main(String[] args) {
        short tmp_childNo;
        Employee employee = new Employee();
        System.out.print("Δώσε τον αριθμό των παιδιών του υπαλλήλου: ");
        tmp_childNo = UserInput.getShort();
        if (tmp_childNo <= 0)
            throw new NonPositiveException
    }
}