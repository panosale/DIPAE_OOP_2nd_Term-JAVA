import java.util.Random;

// Diasindesis - Pollapli klironomikotita
// ergastirio 10.2
public class Main {
    public static void main(String[] args) {
        int n = 4; // Μέγεθος πινάκων
        Random rnd = new Random();
        int i, tmp_rnd;
        Horse[] Ranch = new Horse[n];
        iBird[] Aviary = new iBird[n];
        System.out.println("***** Adding to Ranch array *****");
        for (i = 0; i < n; i++) {
            tmp_rnd = rnd.nextInt(2);
            if (tmp_rnd == 0) {
                Ranch[i] = new Horse(2, 200);
                System.out.println(Ranch[i].toString());
                Ranch[i].whinny();
                Ranch[i].gallop();
            } else {
                Ranch[i] = new Pegasus(1000, 444);
                System.out.println(Ranch[i].toString());
                Ranch[i].whinny();
                Ranch[i].gallop();
                ((Pegasus) Ranch[i]).fly();
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println("***** Adding to Aviary array *****");
            for (i = 0; i < n; i++) {
                tmp_rnd = rnd.nextInt(2);
                if (tmp_rnd == 0) {
                    Aviary[i] = new Bird(2, 200);
                    System.out.println(((Bird) Aviary[i]).toString());
                    Aviary[i].fly();
                    Aviary[i].chirp();
                } else {
                    Aviary[i] = new Pegasus(1200, 555);
                    System.out.println(((Pegasus) Aviary[i]).toString());
                    ((Pegasus) Aviary[i]).whinny();
                    ((Pegasus) Aviary[i]).gallop();
                }
            }
        }
    }
}
