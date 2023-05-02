// Klironomikotita - Eidikefsi
package ergastirio7_3;

public class TestEmployee {
    static void displayStaff(Ypallilos[] emp) {
        for (int i = 0; i < emp.length; i++)
            System.out.println(emp[i].toString());
    }
    public static void main(String[] args) {
        int i, n = 6; // To megethos tou pinaka dinetai apo tin askisi
        short tmp_eidikotita;
        // ********* DEN THA DIMIOURGETAI PINAKAS *********
        Ypallilos[] staff = new Ypallilos[n]; // DEN THA DIMIOURGEITAI YPALLHLOS ALLA EIDIKOTITA META TIN EISAGOGI APO TON XRISTI PARAKATO
        for (i = 0; i < n; i++) {
            do {
                System.out.print("Dose tin Eidikotita tou ypallilou (1 = Oromisthios, 2 = Misthotos, 3 = Proistamenos) [" + i + "]: ");
                tmp_eidikotita = UserInput.getShort();
            } while (tmp_eidikotita < 1 || tmp_eidikotita > 3);
            switch (tmp_eidikotita) { // OLES OI EISAGOGES THA GINOYN MESA STIN switch
                case 1:
                    staff[i] = new Oromisthios();
                    staff[i].setEidikotita("Oromisthios");
                    System.out.print("Dose tis ores ergasias tou ypallilou [" + i + "]: ");
                    staff[i].se(UserInput.getString());
                    break;
                case 2:
                    staff[i] = new Misthotos();
                    staff[i].setEidikotita("Misthotos");
                    break;
                case 3:
                    staff[i] = new Proistamenos();
                    staff[i].setEidikotita("Proistamenos");
                    break;
                }
            System.out.print("Dose ton AM tou ypallilou [" + i + "]: ");
            staff[i].setAM(UserInput.getString());
            System.out.print("Dose to Onoma tou ypallilou [" + i + "]: ");
            staff[i].setName(UserInput.getString());
            System.out.print("Dose ta Eti Apasxolisis tou ypallilou [" + i + "]: ");
            staff[i].setDiefthinsiKatoikias(UserInput.getString());
            System.out.println();
        }
    }
}
