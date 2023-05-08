// Genikefsi - Polymorfismos
package ergastirio8;
public class TestVehicle {
    public static void main(String[] args) {
        // To megethos tou pinaka zititai apo ton xristi
        int n, tmp_eidosOximatos;
        System.out.print("Dose to megethos tou pinaka oximaton: ");
        n = UserInput.getInteger();
        // Arxikopoiisi pinaka oximaton
        Vehicle[] oxima = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Dose to Eidos tou oximatos (1 = Car, 2 = Truck, 3 = Motorcycle) [" + i + "]: ");
                tmp_eidosOximatos = UserInput.getShort();
            } while (tmp_eidosOximatos < 1 || tmp_eidosOximatos > 3);
            switch (tmp_eidosOximatos) { // OLES OI EISAGOGES THA GINOYN MESA STIN switch
                case 1:
                    oxima[i] = new Car();
                    break;
                case 2:
                    oxima[i] = new Truck();
                    break;
                case 3:
                    oxima[i] = new Motorcycle();
                    break;
            }
//            oxima[i] = new Car();

        }
    }
}
        // Oxima 1
/*        oxima[0].setIdioktitis("Panos");
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
            System.out.print("Dose tin thesi tou oximatos ston pinaka gia emfanisi tou Kyvismou:  ");
            thesi = UserInput.getInteger();
        }
        while (thesi < 0 || thesi > n);
        System.out.println("To oxima sti thesi [" + thesi + "] exei Kyvismo: " + oxima[thesi].eng.getKyvismos()); // *** GIA ELEGXO
        do {
            System.out.print("Dose tin thesi tou oximatos ston pinaka gia emfanisi tis Ippodynamis:  ");
            thesi = UserInput.getInteger();
        }
        while (thesi < 0 || thesi > n);
        System.out.println("To oxima sti thesi [" + thesi + "] exei Ippodynamis: " + oxima[thesi].eng.getIppodynami()); // *** GIA ELEGXO
        do {
            System.out.print("Dose tin thesi tou oximatos ston pinaka gia emfanisi tou onomatos idioktiti kai tou etous kataskevis:  ");
            thesi = UserInput.getInteger();
        }
        while (thesi < 0 || thesi > n);
        System.out.println("To oxima sti thesi [" + thesi + "] exei Idioktitii '" + oxima[thesi].getIdioktitis() + "' kei etos kataskevis to " + oxima[thesi].getEtosKat()); // *** GIA ELEGXO
    }
}