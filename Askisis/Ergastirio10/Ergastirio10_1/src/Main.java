// Diasindesis - Pollapli klironomikotita
// ergastirio 10.1
public class Main {
    public static short showMenu() {
        System.out.println("Menu");
        System.out.println("1. Enter work of art");
        System.out.println("2. Prepare work of art for delivery");
        System.out.println("3. Deliver work of art");
        System.out.println("4. Display all availabe photographs");
        System.out.println("5. Display all availabe paintings");
        System.out.println("6. Display all availabe work of arts");
        System.out.println("7. Display all work of arts to be delivered");
        System.out.println("8. End program");
        System.out.print("\nEnter selection (1-8): ");
        return UserInput.getShort();
    }
    public static void main(String[] args) {
        Photograph ph1 = new Photograph("Διακοπές", 10.50f, true);
        System.out.println(ph1.toString());
        System.out.println("Τιμή καταλόγου: " + ph1.getTimiKatalogou());
        System.out.println("Χαμηλότερη αποδεκτή τιμή: " + ph1.getChamiloteriApodektiTimi(50));

        Painting paint1 = new Painting("Τρικυμία", 100.55f, "Ελαιογραφία");
        System.out.println(paint1.toString());
        System.out.println("Τιμή καταλόγου: " + paint1.getTimiKatalogou());
        System.out.println("Χαμηλότερη αποδεκτή τιμή: " + paint1.getChamiloteriApodektiTimi(50));

        short menuChoise;
        do {
            menuChoise = showMenu();
            switch (menuChoise) {
                case 1: System.out.println("Choise: 1. Enter work of art");
                    break;
                case 2: System.out.println("Choise: 2. Prepare work of art for delivery");
                    break;
                case 3: System.out.println("Choise: 3. Deliver work of art");
                    break;
                default: System.out.println("Choise: " + menuChoise);
            }
        } while (menuChoise < 8);
        System.out.println("Goodbye.");
    }
}