package ergastirio8;

public class TestShortUtils {
    public static void main(String[] args) {
//      Eisagogi foititon ston pinaka apo ton xristi
        short tmpAM, tmpEtosEisagogis;
        String tmpFirstName, tmpLastName;
        int n = 7; // Zitoumeno ergastiriou
        Foititis[] PinakasFoititon = new Foititis[n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            // Eisagogi onomateponimou i Foititi
            System.out.print("Dose to Onoma tou foititi " + i + ": ");
            tmpFirstName = UserInput.getString();
            System.out.print("Dose to Epitheto tou foititi " + i + ": ");
            tmpLastName = UserInput.getString();
            // Arxikopoiisi eggrafis i antikeimenou Foititi
            PinakasFoititon[i] = new Foititis(tmpFirstName, tmpLastName);
            // Eisagogi ypoloipon stoixeion i Foititi
            System.out.print("Dose ton AM tou foititi " + tmpLastName + " " + tmpFirstName + ": ");
            tmpAM = UserInput.getShort();
            System.out.print("Dose to Etos Eisagogis tou foititi "  + tmpLastName + " " + tmpFirstName + ": ");
            tmpEtosEisagogis = UserInput.getShort();
            PinakasFoititon[i].setAM((short)tmpAM);
            PinakasFoititon[i].setEtosEisagogis((short)tmpEtosEisagogis);
        }
        int i;
        // Quick Sort
        MyUtils.quickSortAM(PinakasFoititon);
        System.out.println();
        System.out.println("***** Emfanisi pinaka foititon meta tin Quick Sort *****");
        System.out.println("***** Quick Sort by Arithmos Mitroou *****");
        for (i = 0; i < PinakasFoititon.length; i++) {
            System.out.println(PinakasFoititon[i].toString());
            System.out.println();
        }
        // Merge Sort
        MyUtils.mergeSortEponymo(PinakasFoititon);
        System.out.println();
        System.out.println("***** Emfanisi pinaka foititon meta tin Merge Sort *****");
        System.out.println("***** Merge sort by Eponymo *****");
        for (i = 0; i < PinakasFoititon.length; i++) {
            System.out.println(PinakasFoititon[i].toString());
            System.out.println();
        }
    }
}
