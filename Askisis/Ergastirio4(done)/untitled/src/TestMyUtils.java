public class TestMyUtils {
    public static void main(String[] args) {
        int n = 10;
        Foititis[] PinakasFoititon = new Foititis[n];
        PinakasFoititon[0] = new Foititis((short)5,"Panos", "Alevropoulos", (short)2022);
        PinakasFoititon[1] = new Foititis((short)15,"Kostas", "Nikolaou", (short)2020);
        PinakasFoititon[2] = new Foititis((short)36,"Eleni", "Georgiadou", (short)2019);
        PinakasFoititon[3] = new Foititis((short)57,"Nikos", "Aliagas", (short)2018);
        PinakasFoititon[4] = new Foititis((short)74,"Maria", "Dimitriadou", (short)2016);
        PinakasFoititon[5] = new Foititis((short)93,"Petros", "Georgiou", (short)2019);
        PinakasFoititon[6] = new Foititis((short)102,"Konstantina", "Papadopoulou", (short)2022);
        PinakasFoititon[7] = new Foititis((short)142,"Georgios", "Nikolaidis", (short)2018);
        PinakasFoititon[8] = new Foititis((short)174,"Despoina", "Papathanasiou", (short)2020);
        PinakasFoititon[9] = new Foititis((short)204,"Athanasia", "Sotiriadou", (short)2020);
//      Eisagogi foititon ston pinaka apo ton xristi
/*
        System.out.print("Dose to megethos tou pinaka foititon: ");
        n = UserInput.getInteger();
        for (int i = 0; i < n; i++) {
            // Arxikopoiisi eggrafis i antikeimenou Foititis
            PinakasFoititon[i] = new Foititis();
            // Eisagogi stoixeion i Employee
            System.out.print("Dose ton AM tou foititi " + i + ": ");
            PinakasFoititon[i].setAM(UserInput.getString());
            System.out.print("Dose to Onoma tou foititi " + i + ": ");
            PinakasFoititon[i].setFirstName(UserInput.getString());
            System.out.print("Dose to Epitheto tou foititi " + i + ": ");
            PinakasFoititon[i].setLastName(UserInput.getString());
            System.out.print("Dose ta Eti Apasxolisis tou foititi " + i + ": ");
            System.out.println();
        }
*/
        System.out.print("Dose to Epitheto tou foititi gia anazitisi: ");
        String foititis2Search = UserInput.getString();
        int posFoititi = MyUtils.anazitisiMeEpwnymo(PinakasFoititon, foititis2Search);
        if (posFoititi !=-1) {
            System.out.println("O foititis '" + foititis2Search + "' vrethike stin thesi " + posFoititi + ".");
            System.out.println(PinakasFoititon[posFoititi]);
        }
        else
            System.out.println("O foititis '" + foititis2Search + "' den vrethike.");
        System.out.println();
        // Diadiki anaziti foititi.
        System.out.print("Dose ton AM tou foititi gia diadiki anazitisi: ");
        short foitis2BinarySearch = UserInput.getShort();
        int binaryPosFoititi = MyUtils.diadikiAnazitisiMeAM(PinakasFoititon, foitis2BinarySearch);
        if (binaryPosFoititi !=-1) {
            System.out.println("O foititis '" + foitis2BinarySearch + "' vrethike stin thesi " + binaryPosFoititi + ".");
            System.out.println(PinakasFoititon[binaryPosFoititi]);
        }
        else
            System.out.println("O foititis '" + foitis2BinarySearch + "' den vrethike.");
        System.out.println();
        // Diadiki anaziti foititi me anadromi.
        System.out.print("Dose ton AM tou foititi gia anadromiki diadiki anazitisi: ");
        foitis2BinarySearch = UserInput.getShort();
        binaryPosFoititi = MyUtils.anadromikiDiadikiAnazitisiMeAM(PinakasFoititon, foitis2BinarySearch, 0, PinakasFoititon.length - 1);
        if (binaryPosFoititi !=-1) {
            System.out.println("O foititis '" + foitis2BinarySearch + "' vrethike stin thesi " + binaryPosFoititi + ".");
            System.out.println(PinakasFoititon[binaryPosFoititi]);
        }
        else
            System.out.println("O foititis '" + foitis2BinarySearch + "' den vrethike.");
        System.out.println();
    }
}
