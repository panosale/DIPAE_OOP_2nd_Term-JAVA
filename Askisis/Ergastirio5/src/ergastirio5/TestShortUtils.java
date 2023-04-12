package ergastirio5;

public class TestShortUtils {
    public static void main(String[] args) {
//      Arxikopoiisi pinaka foition me times
/*
        int n = 7;
        Foititis[] PinakasFoititon = new Foititis[n];
        PinakasFoititon[0] = new Foititis((short)25,"Panos", "Alevropoulos", (short)2022);
        PinakasFoititon[1] = new Foititis((short)115,"Kostas", "Nikolaou", (short)2020);
        PinakasFoititon[2] = new Foititis((short)6,"Eleni", "Georgiadou", (short)2019);
        PinakasFoititon[3] = new Foititis((short)102,"Nikos", "Aliagas", (short)2018);
        PinakasFoititon[4] = new Foititis((short)74,"Maria", "Dimitriadou", (short)2016);
        PinakasFoititon[5] = new Foititis((short)93,"Petros", "Georgiou", (short)2019);
        PinakasFoititon[6] = new Foititis((short)57,"Konstantina", "Papadopoulou", (short)2022);
        PinakasFoititon[7] = new Foititis((short)42,"Georgios", "Nikolaidis", (short)2018);
        PinakasFoititon[8] = new Foititis((short)14,"Despoina", "Papathanasiou", (short)2020);
        PinakasFoititon[9] = new Foititis((short)124,"Athanasia", "Sotiriadou", (short)2020);
         */
//      Eisagogi foititon ston pinaka apo ton xristi
        int n;
        short tmpAM, tmpEtosEisagogis;
        String tmpFirstName, tmpLastName;
        System.out.print("Dose to megethos tou pinaka foititon: ");
        n = UserInput.getInteger();
        Foititis[] PinakasFoititon = new Foititis[n];
        for (int i = 0; i < n; i++) {
            // Eisagogi stoixeion i Foititis
            System.out.print("Dose to Onoma tou foititi " + i + ": ");
            tmpFirstName = UserInput.getString();
            System.out.print("Dose to Epitheto tou foititi " + i + ": ");
            tmpLastName = UserInput.getString();
            // Arxikopoiisi eggrafis i antikeimenou Foititis
            PinakasFoititon[i] = new Foititis(tmpFirstName, tmpLastName);
            System.out.println("*******");
            System.out.println(PinakasFoititon[i].toString());
            System.out.println("*******");
            System.out.print("Dose ton AM tou foititi " + i + ": ");
            tmpAM = UserInput.getShort();
            System.out.print("Dose to Etos Eisagogis tou foititi " + i + ": ");
            tmpEtosEisagogis = UserInput.getShort();
            PinakasFoititon[i].setAM((short) tmpAM);
            PinakasFoititon[i].setEtosEisagogis((short) tmpEtosEisagogis);
            System.out.println("*******");
            System.out.println(PinakasFoititon[i].toString());
            System.out.println("*******");
            MyUtils.insertSortAM(PinakasFoititon, PinakasFoititon[i]);
            System.out.println();
        }

        // Emfanisi pinaka foititon
        for (int i = 0; i < PinakasFoititon.length; i++) {
            System.out.println(PinakasFoititon[i].toString());
            System.out.println();
        }
                
/*        System.out.print("Dose to Epitheto tou foititi gia anazitisi: ");
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
*/
    }
