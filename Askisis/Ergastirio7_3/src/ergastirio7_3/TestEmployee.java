// Klironomikotita - Eidikefsi
package ergastirio7_3;

public class TestEmployee {
    static void displayStaff(Ypallilos[] emp) {
        for (int i = 0; i < emp.length; i++)
            System.out.println(emp[i].toString());
    }
    public static void main(String[] args) {
        int n, i;
        System.out.print("Dose to megethos tou pinaka: ");
        n = UserInput.getInteger();
        Ypallilos[] staff = new Ypallilos[n];

        for (i = 0; i < n; i++) {
            staff[i] = new Ypallilos();
            System.out.print("Dose ton AM tou ypallilou " + i + ": ");
            staff[i].setAM(UserInput.getString());
            System.out.print("Dose to Onoma tou ypallilou " + i + ": ");
            staff[i].setName(UserInput.getString());
            System.out.print("Dose tin Eidikotita tou ypallilou " + i + ": ");
            staff[i].setEidikotita(UserInput.getString());
            System.out.print("Dose ta Eti Apasxolisis tou ypallilou " + i + ": ");
            staff[i].setDiefthinsiKatoikias(UserInput.getString());
            System.out.println();
        }
        displayStaff(staff);
    }
}
