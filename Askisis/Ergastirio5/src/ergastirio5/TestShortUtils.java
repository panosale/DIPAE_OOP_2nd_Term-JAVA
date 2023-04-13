package ergastirio5;

public class TestShortUtils {
    public static void main(String[] args) {
//      Arxikopoiisi pinaka foition me times
        int n = 7;
        Foititis[] PinakasFoititon = new Foititis[n];
        PinakasFoititon[0] = new Foititis((short) 25, "Panos", "Alevropoulos", (short) 2022);
        PinakasFoititon[1] = new Foititis((short) 115, "Kostas", "Nikolaou", (short) 2020);
        PinakasFoititon[2] = new Foititis((short) 6, "Eleni", "Georgiadou", (short) 2019);
        PinakasFoititon[3] = new Foititis((short) 102, "Nikos", "Aliagas", (short) 2018);
        PinakasFoititon[4] = new Foititis((short) 74, "Maria", "Dimitriadou", (short) 2016);
        PinakasFoititon[5] = new Foititis((short) 93, "Petros", "Georgiou", (short) 2019);
        PinakasFoititon[6] = new Foititis((short) 57, "Konstantina", "Papadopoulou", (short) 2022);

//      Eisagogi foititon ston pinaka apo ton xristi
/*        int n;
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
            System.out.println("***** ARXIKA STOIXEIA FOITITI *****");
            System.out.println(PinakasFoititon[i].toString());
            System.out.println("***********************************");
            System.out.print("Dose ton AM tou foititi " + tmpLastName + " " + tmpFirstName + ": ");
            tmpAM = UserInput.getShort();
            System.out.print("Dose to Etos Eisagogis tou foititi "  + tmpLastName + " " + tmpFirstName + ": ");
            tmpEtosEisagogis = UserInput.getShort();
            PinakasFoititon[i].setAM((short)tmpAM);
            PinakasFoititon[i].setEtosEisagogis((short)tmpEtosEisagogis);
            System.out.println("***** TELIKA STOIXEIA FOITITI *****");
            System.out.println(PinakasFoititon[i].toString());
            System.out.println("***********************************");
        }
*/
        int i;
        // Insertion Sort
        MyUtils.insertSortAM(PinakasFoititon);
        System.out.println();
        System.out.println("***** Emfanisi pinaka foititon meta tin Insertion Sort *****");
        for (i = 0; i < PinakasFoititon.length; i++) {
            System.out.println(PinakasFoititon[i].toString());
            System.out.println();
        }
        // Selection Sort
        MyUtils.selectSortEponymo(PinakasFoititon);
        System.out.println();
        System.out.println("\n***** Emfanisi pinaka foititon meta tin Selection Sort *****");
        for (i = 0; i < PinakasFoititon.length; i++) {
            System.out.println(PinakasFoititon[i].toString());
            System.out.println();
        }

    }
}