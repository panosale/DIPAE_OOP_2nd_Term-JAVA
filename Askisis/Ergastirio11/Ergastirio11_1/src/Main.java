// Exceptions
// ergastirio 11.1
public class Main {
    public static void main(String[] args) throws InvalidOvertimeException, InvalidBirthDateException {
//        short tmp_childNo;
        double[] tmp_workingHours = {160, 150, 125, 140, 145, 146, 157, 148, 139, 150, 141, 152};
        double[] tmp_overTime = {22, 12, 24, 0, 4, 3, 15, 7, 1, 2, 0, 11};
        Employee employee1 = new Employee("Test Employee 1", "30/11/2000", (short) 0, 10, tmp_workingHours, tmp_overTime);
        System.out.println(employee1.getName() + ": Αποδοχές Ιανουαρίου: " + employee1.computeMonthlyIncome((short)2));
        System.out.println(employee1);
/*
        System.out.print("Δώσε τον αριθμό των παιδιών του υπαλλήλου: ");
        tmp_childNo = UserInput.getShort();
        employee.setChildNo(tmp_childNo);
*/
//        if (tmp_childNo <= 0)
//            throw new NonPositiveException();
    }
}