import java.util.Random;

// Diasindesis - Pollapli klironomikotita
// ergastirio 10.2
public class Main {
    public static void main(String[] args) {
        int n = 100; // Μέγεθος πινάκων
        Random rnd = new Random();













































































        int under50 = 0, over50 = 0;
        for (int i = 0; i < n; i++) {
            if (rnd.nextInt() < 50)
                under50++;
            else
                over50++;
        }
        System.out.println("Under 50 found: " + under50);
        System.out.println("Over 50 found: " + over50);
//        Pegasus[] Ranch = new Pegasus[n];

    }
}