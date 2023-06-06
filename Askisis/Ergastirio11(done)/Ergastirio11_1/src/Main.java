// Exceptions
// ergastirio 11.1
public class Main {
    public static void main(String[] args) { // throws InvalidOvertimeException, InvalidBirthDateException {
        System.out.println("************ Employee 1 ************");
        double[] tmp_workingHours1 = {140, 155, 135, 160, 150, 157, 129, 139, 120, 155, 135, 149};
        double[] tmp_overTime1 = {12, 2, 20, 0, 1, 13, 12, 7, 1, 2, 0, 10};
        Employee employee1 = new Employee("Test Employee 1", "32/11/2000", (short) -1, 10, tmp_workingHours1, tmp_overTime1);
        System.out.println(employee1.getName() + ": Αποδοχές Ιανουαρίου: " + employee1.computeMonthlyIncome((short)1));
        System.out.println(employee1);
        System.out.println("************ Employee 2 ************");
        double[] tmp_workingHours2 = {143, 125, 145, 145, 152, 150, 123, 119, 120, 136, 124, 142};
        double[] tmp_overTime2 = {22, 12, 24, 0, 4, 3, 15, 7, 1, 2, 0, 11};
        Employee employee2 = new Employee("Test Employee 2", "03/03/1999", (short) 2, 11, tmp_workingHours2, tmp_overTime2);
        System.out.println(employee2.getName() + ": Αποδοχές Νοεμβρίου: " + employee2.computeMonthlyIncome((short)11));
        System.out.println(employee2);
/*
        System.out.println("************ Employee 3 ************");
        Employee employee3 = new Employee("Test Employee 3", "10/02/2000", (short) 1, 12, tmp_workingHours2, tmp_overTime2);
        System.out.println(employee3.getName() + ": Αποδοχές Ιανουαρίου: " + employee3.computeMonthlyIncome((short)1));
        System.out.println(employee3);
*/
        System.out.println("************ Employee 1 is equal to Employee 2? ************");
        System.out.println(employee1.equals(employee2));
    }
}