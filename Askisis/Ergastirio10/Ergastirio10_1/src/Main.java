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
    public static short showSubMenu() {
        System.out.println("Menu");
        System.out.println("1. Insert Photograph");
        System.out.println("2. Insert Painting");
        System.out.print("\nEnter selection (1-2): ");
        return UserInput.getShort();
    }
    public static void EisagogiErgou(ProsPolisi[] new_ergaTexnisProsPolisi, int new_thesi) {
        if (new_thesi < new_ergaTexnisProsPolisi.length) {
            switch (showSubMenu()) {
                case 1: new_ergaTexnisProsPolisi[new_thesi] = new Photograph();
                    System.out.println("Δώσε το όνομα της φωτογραφίας: ");
                    ((Photograph)new_ergaTexnisProsPolisi[new_thesi]).setPerigrafi(UserInput.getString());
                    System.out.println("Δώσε την τιμή της φωτογραφίας: ");
                    ((Photograph)new_ergaTexnisProsPolisi[new_thesi]).setTimi(UserInput.getFloat());
                    boolean tmp_exitMenu = false;
                    do {
                        System.out.println("Είναι έγχρωμη η φωτογραφία (Y/N); ");
                        switch (UserInput.getChar()) {
                            case 'Y':
                                ((Photograph) new_ergaTexnisProsPolisi[new_thesi]).setEgxromi(true);
                            case 'y':
                                ((Photograph) new_ergaTexnisProsPolisi[new_thesi]).setEgxromi(true);
                                tmp_exitMenu = true;
                                break;
                            case 'N':
                                ((Photograph) new_ergaTexnisProsPolisi[new_thesi]).setEgxromi(false);
                            case 'n':
                                ((Photograph) new_ergaTexnisProsPolisi[new_thesi]).setEgxromi(false);
                                tmp_exitMenu = true;
                                break;
                        }
                    } while (!tmp_exitMenu);
                    break;
                case 2: new_ergaTexnisProsPolisi[new_thesi] = new Painting();
                    System.out.println("Δώσε το όνομα του πίνακα: ");
                    ((Painting)new_ergaTexnisProsPolisi[new_thesi]).setPerigrafi(UserInput.getString());
                    System.out.println("Δώσε την τιμή του πίνακα: ");
                    ((Painting)new_ergaTexnisProsPolisi[new_thesi]).setTimi(UserInput.getFloat());
                    System.out.println("Δώσε την τεχνοτροπία του πίνακα: ");
                    ((Painting)new_ergaTexnisProsPolisi[new_thesi]).setTexnotropia(UserInput.getString());
                    break;
                default: System.out.println("*** Λάθος είδος έργου τέχνης. ***");
            }
        }
        else
            System.out.println("Ο πίνακας γέμισε.");
    }
    public static void main(String[] args) {
        int n = 10; // Μέγεθος πίνακα. Ζητείται από την άσκηση.
        int thesi = 0;
        ProsPolisi ErgaTexnisProsPolisi[] = new ProsPolisi[n];
        ProsMetafora ErgaTexnisProsMetafora[] = new ProsMetafora[n];

        short menuChoise;
        boolean exitMenu = false;
        do {
            menuChoise = showBasicMenu();
            switch (menuChoise) {
                case 1: System.out.println("Choise: 1. Enter work of art");
                    EisagogiErgou(ErgaTexnisProsPolisi, thesi++);
                    break;
                case 2: System.out.println("Choise: 2. Prepare work of art for delivery");
                    break;
                case 3: System.out.println("Choise: 3. Deliver work of art");
                    break;
                case 4: System.out.println("Choise: 4. Display all available photographs");
                    break;
                case 5: System.out.println("Choise: 5. Display all available paintings");
                    break;
                case 6: System.out.println("Choise: 6. Display all available work of arts");
                    break;
                case 7: System.out.println("Choise: 7. Display all work of arts to be delivered");
                    break;
                case 8: exitMenu = true;
                    break;
                default: System.out.println("Choise: " + menuChoise + " not available.");
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