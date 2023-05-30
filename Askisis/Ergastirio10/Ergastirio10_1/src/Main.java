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
        System.out.print("\nΔώστε επιλογή (1-2): ");
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
            switch (showInsertSubMenu()) {
                case 1: new_ergaProsPolisi[new_thesi] = new Photograph();
                    System.out.print("Δώσε το όνομα της φωτογραφίας: ");
                    ((Photograph)new_ergaProsPolisi[new_thesi]).setPerigrafi(UserInput.getString());
                    System.out.print("Δώσε την τιμή της φωτογραφίας: ");
                    ((Photograph)new_ergaProsPolisi[new_thesi]).setTimi(UserInput.getFloat());
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
                case 2: new_ergaProsPolisi[new_thesi] = new Painting();
                    System.out.print("Δώσε το όνομα του πίνακα: ");
                    ((Painting)new_ergaProsPolisi[new_thesi]).setPerigrafi(UserInput.getString());
                    System.out.print("Δώσε την τιμή του πίνακα: ");
                    ((Painting)new_ergaProsPolisi[new_thesi]).setTimi(UserInput.getFloat());
                    System.out.print("Δώσε την τεχνοτροπία του πίνακα: ");
                    ((Painting)new_ergaProsPolisi[new_thesi]).setTexnotropia(UserInput.getString());
                    break;
                default: System.out.println("*** Λάθος είδος έργου τέχνης. ***");
                    tmp_insertedSuccessfully = false;
                    break;
            }
        }
        else {
            System.out.println("Ο πίνακας γέμισε.");
            tmp_insertedSuccessfully = false;
        }
        if (tmp_insertedSuccessfully)
            System.out.println("Το έργο καταχωρήθηκε στη θέση [" + new_thesi + "] του πίνακα.");
        return tmp_insertedSuccessfully;
    }
    public static void MetaforaErgou(ProsPolisi[] new_ergaProsPolisi, ProsMetafora[] new_ergaProsMetafora, int max_theseis, int new_thesi) {
        int thesi;
        do {
            System.out.print("Δώσε το έργο που θέλεις να μεταφέρεις από θέση [0]" + new_thesi + "]");
            thesi = UserInput.getInteger();
        } while (thesi < max_theseis);
/*
        if (new_thesi < new_ergaProsMetafora.length) {
            switch (showMoveErgoTexnisSubMenu()) {
                case 1: new_ergaProsMetafora[new_thesi] = new AgoraParadosi(new Photograph(new_ergaProsPolisi));
                    break;
                case 2: new_ergaProsMetafora[new_thesi] = new Painting();
                    break;
                default: System.out.println("*** Λάθος είδος έργου τέχνης. ***");
                    tmp_insertedSuccessfully = false;
                    break;
            }
        }
        else {
            System.out.println("Ο πίνακας γέμισε.");
            tmp_insertedSuccessfully = false;
        }
        if (tmp_insertedSuccessfully)
            System.out.println("Το έργο καταχωρήθηκε στη θέση [" + new_thesi + "] του πίνακα.");
*/
    }
    public static void main(String[] args) {
        int n = 10; // Μέγεθος πίνακα. Ζητείται από την άσκηση.
        int thesiProsPolisi = 0 , thesiProsMetafora = 0;
        ProsPolisi ErgaProsPolisi[] = new ProsPolisi[n];
        ProsMetafora ErgaProsMetafora[] = new ProsMetafora[n];

        short menuChoise;
        boolean exitMenu = false;
        do {
            menuChoise = showBasicMenu();
            switch (menuChoise) {
                case 1: System.out.println("*** Choise: 1. Enter work of art");
                    if (EisagogiErgou(ErgaProsPolisi, thesiProsPolisi))
                        thesiProsPolisi++;
                    System.out.println();
                    break;
                case 2: System.out.println("*** Choise: 2. Prepare work of art for delivery");
                    MetaforaErgou(ErgaProsPolisi, ErgaProsMetafora,thesiProsPolisi, thesiProsMetafora++);
                    System.out.println();
                    break;
                case 3: System.out.println("*** Choise: 3. Deliver work of art");
                    break;
                case 4: System.out.println("*** Choise: 4. Display all available photographs");
                    for (int i = 0; i < n; i++) {
                        if (ErgaProsPolisi[i] instanceof Photograph)
                            System.out.println(((Photograph)ErgaProsPolisi[i]).toString());
                    }
                    System.out.println();
                    break;
                case 5: System.out.println("*** Choise: 5. Display all available paintings");
                    for (int i = 0; i < n; i++) {
                        if (ErgaProsPolisi[i] instanceof Painting)
                            System.out.println(((Painting)ErgaProsPolisi[i]).toString());
                    }
                    System.out.println();
                    break;
                case 6: System.out.println("*** Choise: 6. Display all available work of arts");
                    for (int i = 0; i < n; i++) {
                        if (ErgaProsPolisi[i] != null)
                            System.out.println(ErgaProsPolisi[i].toString());
                    }
                    System.out.println();
                    break;
                case 7: System.out.println("*** Choise: 7. Display all work of arts to be delivered");
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
/*      ΓΙΑ ΔΟΚΙΜΕΣ - ΑΡΧΗ
        Photograph ph1 = new Photograph("Διακοπές", 10.50f, true);
        System.out.println(ph1.toString());
        System.out.println("Τιμή καταλόγου: " + ph1.getTimiKatalogou());
        System.out.println("Χαμηλότερη αποδεκτή τιμή: " + ph1.getChamiloteriApodektiTimi(50));

        Painting paint1 = new Painting("Τρικυμία", 100.55f, "Ελαιογραφία");
        System.out.println(paint1.toString());
        System.out.println("Τιμή καταλόγου: " + paint1.getTimiKatalogou());
        System.out.println("Χαμηλότερη αποδεκτή τιμή: " + paint1.getChamiloteriApodektiTimi(50));
        ΓΙΑ ΔΟΚΙΜΕΣ - ΤΕΛΟΣ
*/
}