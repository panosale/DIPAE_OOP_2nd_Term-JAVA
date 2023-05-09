public class TestEmployee {
    static void displayStaff(Employee emp[]) {
        for (int i = 0; i < emp.length; i++)
            System.out.println(emp[i].toString());
    }
    public static void main(String[] args) {
        int n, i;
        System.out.print("Dose to megethos tou pinaka: ");
        n = UserInput.getInteger();
        Employee[] staff = new Employee[n];

        for (i = 0; i < n; i++) {
            staff[i] = new Employee();
            System.out.print("Dose ton AM tou ypallilou " + i + ": ");
            staff[i].setAM(UserInput.getString());
            System.out.print("Dose to Onoma tou ypallilou " + i + ": ");
            staff[i].setFirstName(UserInput.getString());
            System.out.print("Dose to Epitheto tou ypallilou " + i + ": ");
            staff[i].setLastName(UserInput.getString());
            System.out.print("Dose ta Eti Apasxolisis tou ypallilou " + i + ": ");
            staff[i].setEtiApasxolisis(UserInput.getInteger());
            System.out.print("Dose ton Vasiko Mistho tou ypallilou " + i + ": ");
            staff[i].setVasikosMisthos(UserInput.getDouble());
            System.out.print("Dose to Bonus tou ypallilou " + i + ": ");
            staff[i].setBonus(UserInput.getDouble());
            System.out.println();
        }
        displayStaff(staff);
    }
}
