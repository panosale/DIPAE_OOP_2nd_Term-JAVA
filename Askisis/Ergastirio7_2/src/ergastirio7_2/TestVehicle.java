package ergastirio7_2;
public class TestVehicle {
    public static void main(String[] args) {
        // To megethos tou pinaka dinetai apo tin askisi
        int n = 3;
        // Arxikopoiisi pinaka oximaton
        Vehicle[] oxima = new Vehicle[n];
        for (int i = 0; i < n; i++)
            oxima[i] = new Vehicle();
        // Oxima 1
        oxima[0].setIdioktitis("Panos");
        oxima[0].setArKykloforias("HJD2701");
        oxima[0].setEtosKat(2015);
        oxima[0].eng.setKyvismos(1600); // *** GIA ELEGXO
        oxima[0].eng.setIppodynami(120); // *** GIA ELEGXO
        // Oxima 2
        oxima[1].setIdioktitis("Eleftheria");
        oxima[1].setArKykloforias("FIW7612");
        oxima[1].setEtosKat(1998);
        oxima[1].eng.setKyvismos(1300); // *** GIA ELEGXO
        oxima[1].eng.setIppodynami(83); // *** GIA ELEGXO
        // Oxima 3
        oxima[2].setIdioktitis("Mitsos");
        oxima[2].setArKykloforias("sta2p101");
        oxima[2].setEtosKat(2002);
        oxima[2].eng.setKyvismos(1900); // *** GIA ELEGXO
        oxima[2].eng.setIppodynami(150); // *** GIA ELEGXO
        // Provoli apotelesmaton
        int thesi;
        do {
            System.out.print("Dose tin thesi (0 eos " + (n-1) + ") tou oximatos ston pinaka gia emfanisi tou Kyvismou:  ");
            thesi = UserInput.getInteger();
        }
        while (thesi < 0 || thesi > n - 1);
        System.out.println("To oxima sti thesi [" + thesi + "] exei Kyvismo: " + oxima[thesi].eng.getKyvismos()); // *** GIA ELEGXO
        do {
            System.out.print("Dose tin thesi (0 eos " + (n-1) + ") tou oximatos ston pinaka gia emfanisi tis Ippodynamis:  ");
            thesi = UserInput.getInteger();
        }
        while (thesi < 0 || thesi > n - 1);
        System.out.println("To oxima sti thesi [" + thesi + "] exei Ippodynamis: " + oxima[thesi].eng.getIppodynami()); // *** GIA ELEGXO
        do {
            System.out.print("Dose tin thesi (0 eos " + (n-1) + ") tou oximatos ston pinaka gia emfanisi tou onomatos idioktiti kai tou etous kataskevis:  ");
            thesi = UserInput.getInteger();
        }
        while (thesi < 0 || thesi > n - 1);
        System.out.println("To oxima sti thesi [" + thesi + "] exei Idioktitii '" + oxima[thesi].getIdioktitis() + "' kei etos kataskevis to " + oxima[thesi].getEtosKat()); // *** GIA ELEGXO
    }
}
