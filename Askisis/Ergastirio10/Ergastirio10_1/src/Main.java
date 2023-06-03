// Diasindesis - Pollapli klironomikotita
// ergastirio 10.1
public class Main {
    public static short showBasicMenu() {
        System.out.println("Menu");
        System.out.println("1. Enter work of art");
        System.out.println("2. Prepare work of art for delivery");
        System.out.println("3. Deliver work of art");
        System.out.println("4. Display all available photographs");
        System.out.println("5. Display all available paintings");
        System.out.println("6. Display all available work of arts");
        System.out.println("7. Display all work of arts to be delivered");
        System.out.println("8. End program");
        System.out.print("\nEnter selection (1-8): ");
        return UserInput.getShort();
    }
    public static short showInsertSubMenu() {
        System.out.println("Μενού εισαγωγής");
        System.out.println("1. Εισαγωγή Φωτογραφίας");
        System.out.println("2. Εισαγωγή Πίνακα");
        System.out.print("\nΔώστε επιλογή (1, 2, άλλο για έξοδο): ");
        return UserInput.getShort();
    }
    public static short showMoveErgoTexnisSubMenu() {
        System.out.println("Μενού μεταφοράς");
        System.out.println("1. Μεταφορά Φωτογραφίας");
        System.out.println("2. Μεταφορά Πίνακα");
        System.out.print("\nΔώστε επιλογή (1-2): ");
        return UserInput.getShort();
    }
    public static boolean EisagogiErgou(ProsPolisi[] new_ergaProsPolisi, int new_thesi) {
        boolean tmp_insertedSuccessfully = true;
        if (new_thesi < new_ergaProsPolisi.length) {
            if (new_ergaProsPolisi[new_thesi] == null) {
                switch (showInsertSubMenu()) {
                    case 1:
                        new_ergaProsPolisi[new_thesi] = new Photograph();
                        System.out.print("Δώσε το όνομα της φωτογραφίας: ");
                        ((Photograph) new_ergaProsPolisi[new_thesi]).setPerigrafi(UserInput.getString());
                        System.out.print("Δώσε την τιμή της φωτογραφίας: ");
                        ((Photograph) new_ergaProsPolisi[new_thesi]).setTimi(UserInput.getFloat());
                        boolean tmp_exitMenu = false;
                        do {
                            System.out.print("Είναι έγχρωμη η φωτογραφία (Y/N); ");
                            switch (UserInput.getChar()) {
                                case 'Y':
                                    ((Photograph) new_ergaProsPolisi[new_thesi]).setEgxromi(true);
                                case 'y':
                                    ((Photograph) new_ergaProsPolisi[new_thesi]).setEgxromi(true);
                                    tmp_exitMenu = true;
                                    break;
                                case 'N':
                                    ((Photograph) new_ergaProsPolisi[new_thesi]).setEgxromi(false);
                                case 'n':
                                    ((Photograph) new_ergaProsPolisi[new_thesi]).setEgxromi(false);
                                    tmp_exitMenu = true;
                                    break;
                            }
                        } while (!tmp_exitMenu);
                        break;
                    case 2:
                        new_ergaProsPolisi[new_thesi] = new Painting();
                        System.out.print("Δώσε το όνομα του πίνακα: ");
                        ((Painting) new_ergaProsPolisi[new_thesi]).setPerigrafi(UserInput.getString());
                        System.out.print("Δώσε την τιμή του πίνακα: ");
                        ((Painting) new_ergaProsPolisi[new_thesi]).setTimi(UserInput.getFloat());
                        System.out.print("Δώσε την τεχνοτροπία του πίνακα: ");
                        ((Painting) new_ergaProsPolisi[new_thesi]).setTexnotropia(UserInput.getString());
                        break;
                    default:
                        System.out.println("*** Λάθος είδος έργου τέχνης. ***");
                        tmp_insertedSuccessfully = false;
                        break;
                }

            } else {
                System.out.println("***** Ο πίνακας γέμισε. Δεν επιτρέπονται άλλες καταχωρήσεις. *****");
                tmp_insertedSuccessfully = false;
            }
            if (tmp_insertedSuccessfully)
                System.out.println("Το έργο καταχωρήθηκε στη θέση [" + new_thesi + "] του πίνακα.");
        }
        return tmp_insertedSuccessfully;
    }
    public static boolean ProetoimsiaErgouProsMetafora(ProsPolisi[] ergaProsPolisi, AgoraParadosi[] ergaProsMetafora, int tmp_thesiProsMetafora, int tmp_maxTheseisProsPolisi) {
        int thesi;
        boolean tmp_preparedSuccessfully = false;
        if (tmp_thesiProsMetafora < ergaProsMetafora.length) {
            if (tmp_maxTheseisProsPolisi > 0) {
                ShowAllErga(ergaProsPolisi, tmp_maxTheseisProsPolisi);
                System.out.print("Δώσε τη θέση του έργου που θέλεις να προετοιμάσεις για μεταφορά (διαφορετική επιλογή για επιστροφή): ");
                thesi = UserInput.getInteger();
                if (thesi >= 0 && thesi < ergaProsMetafora.length)
                    if (ergaProsPolisi[thesi] != null) {
                        ergaProsMetafora[tmp_thesiProsMetafora] = new AgoraParadosi();
                        ergaProsMetafora[tmp_thesiProsMetafora].setErgoProsPolisi(ergaProsPolisi[thesi]);
                        ergaProsPolisi[thesi] = null;
                        tmp_preparedSuccessfully = true;
                    } else
                        System.out.println("***** Η προετοιμασία έργου είναι αδύνατη. Έδωσες λάθος θέση. *****");
                else {
                    System.out.println("***** Η προετοιμασία ακυρώθηκε. *****");
                }
            } else System.out.println("***** Ο πίνακας έργων προς πώληση είναι κενός. *****");
        }
        else
            System.out.println("***** Ο πίνακας έργων προς μεταφορά είναι γεμάτος. *****");
        return tmp_preparedSuccessfully;
    }
    public static boolean MetaforaErgou(AgoraParadosi[] ergaProsMetafora, int tmp_thesiProsMetafora) {
        int thesi;
        boolean tmp_transferedSuccessfully = false;
        showAllErgaProsMetafora(ergaProsMetafora, tmp_thesiProsMetafora);
        if (tmp_thesiProsMetafora != 0) {
            System.out.print("Δώσε τη θέση του έργου που θέλεις να μεταφέρεις (διαφορετική επιλογή για επιστροφή): ");
            thesi = UserInput.getInteger();
            if (thesi >= 0 && thesi < ergaProsMetafora.length && ergaProsMetafora[thesi] != null){
                ergaProsMetafora[thesi] = null;
                tmp_transferedSuccessfully = true;
            }
        }
        return tmp_transferedSuccessfully;
    }
    public static void ShowAllPhotographs(ProsPolisi[] erga, int tmp_maxTheseisProsPolisi) {
        if (tmp_maxTheseisProsPolisi > 0) {
            for (int i = 0; i < erga.length; i++)
                if (erga[i] != null && erga[i] instanceof Photograph)
                    System.out.println("Θέση [" + i + "]. " + ((Photograph) erga[i]).toString());
//                    System.out.println("Θέση [" + i + "]. " + (erga[i]).toString()); // Εκτελείται και έτσι
        }
        else
            System.out.println("***** Ο πίνακας έργων προς πώληση είναι κενός. *****");
    }
    public static void ShowAllPaintings(ProsPolisi[] erga, int tmp_maxTheseisProsPolisi) {
        if (tmp_maxTheseisProsPolisi > 0) {
            for (int i = 0; i < erga.length; i++)
                if (erga[i] != null && erga[i] instanceof Painting)
                    System.out.println("Θέση [" + i + "]. " + ((Painting) erga[i]).toString());
//                    System.out.println("Θέση [" + i + "]. " + (erga[i]).toString()); // Εκτελείται και έτσι
        }
        else
            System.out.println("***** Ο πίνακας έργων προς πώληση είναι κενός. *****");
    }
    public static void ShowAllErga(ProsPolisi[] erga, int tmp_maxTheseisProsPolisi) {
        if (tmp_maxTheseisProsPolisi > 0) {
            for (int i = 0; i < erga.length; i++)
                if (erga[i] != null)
                    System.out.println("Θέση [" + i + "]. " + erga[i].toString());
        }
        else
            System.out.println("***** Ο πίνακας έργων προς πώληση είναι κενός. *****");
    }
    public static void showAllErgaProsMetafora(AgoraParadosi[] erga, int new_thesiProsMetafora) {
        if (new_thesiProsMetafora != 0) {
            for (int i = 0; i < erga.length; i++)
                if (erga[i] != null)
                    System.out.println("Θέση [" + i + "]. " + erga[i].toString());
        }
        else
            System.out.println("***** Ο πίνακας έργων προς μεταφορά είναι κενός. *****");
    }
    public static void main(String[] args) {
        int n = 10; // Μέγεθος πίνακα. Ζητείται από την άσκηση.
        int maxTheseisProsPolisi = 0 , thesiProsMetafora = 0;
        ProsPolisi[] ErgaProsPolisi = new ProsPolisi[n];
        AgoraParadosi[] ErgaProsMetafora = new AgoraParadosi[n];

        short menuChoise;
        boolean exitMenu = false;
        do {
            menuChoise = showBasicMenu();
            switch (menuChoise) {
                case 1: System.out.println("*** Choise: 1. Enter work of art");
                    if (EisagogiErgou(ErgaProsPolisi, maxTheseisProsPolisi))
                        maxTheseisProsPolisi++;
                    System.out.println();
                    break;
                case 2: System.out.println("*** Choise: 2. Prepare work of art for delivery");
                    if (ProetoimsiaErgouProsMetafora(ErgaProsPolisi, ErgaProsMetafora, thesiProsMetafora, maxTheseisProsPolisi)) {
                        maxTheseisProsPolisi--;
                        thesiProsMetafora++;
                        System.out.println("***** Η προετοιμασία του έργου για μεταφορά ολοκληρώθηκε *****");
                    }
                    else
                        System.out.println("***** Η προετοιμασία του έργου για μεταφορά δεν ολοκληρώθηκε *****");
                    System.out.println();
                    break;
                case 3: System.out.println("*** Choise: 3. Deliver work of art");
                    if (MetaforaErgou(ErgaProsMetafora, thesiProsMetafora)) {
                        thesiProsMetafora--;
                        System.out.println("***** Η μεταφορά του έργου ολοκληρώθηκε *****");
                    }
                    else
                        System.out.println("***** Η μεταφορά του έργου δεν ολοκληρώθηκε *****");
                    System.out.println();
                    break;
                case 4: System.out.println("*** Choise: 4. Display all available photographs");
                    ShowAllPhotographs(ErgaProsPolisi, maxTheseisProsPolisi);
                    System.out.println();
                    break;
                case 5: System.out.println("*** Choise: 5. Display all available paintings");
                    ShowAllPaintings(ErgaProsPolisi, maxTheseisProsPolisi);
                    System.out.println();
                    break;
                case 6: System.out.println("*** Choise: 6. Display all available work of arts");
                    ShowAllErga(ErgaProsPolisi, maxTheseisProsPolisi);
                    System.out.println();
                    break;
                case 7: System.out.println("*** Choise: 7. Display all work of arts to be delivered");
                    showAllErgaProsMetafora(ErgaProsMetafora, thesiProsMetafora);//, maxTheseisProsPolisi);
                    System.out.println();
                    break;
                case 8: exitMenu = true;
                    System.out.println();
                    break;
                default: System.out.println("*** Choise: " + menuChoise + " not available.");
                    System.out.println();
                    break;
            }
        } while (!exitMenu);
        System.out.println("Goodbye.");
    }
}
