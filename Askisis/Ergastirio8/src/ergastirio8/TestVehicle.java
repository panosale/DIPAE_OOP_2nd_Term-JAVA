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
                System.out.print("Dose to eidos (1 = Car, 2 = Truck, 3 = Motorcycle) tou oximatos [" + i + "]: ");
                tmp_eidosOximatos = UserInput.getShort();
            } while (tmp_eidosOximatos < 1 || tmp_eidosOximatos > 3);
            switch (tmp_eidosOximatos) { // OLES OI EISAGOGES THA GINOYN MESA STIN switch
                case 1:
                    oxima[i] = new Car();
                    oxima[i].setEtosKat(1800);
                    break;
                case 2:
                    oxima[i] = new Truck();
                    oxima[i].setEtosKat(1900);
                    break;
                case 3:
                    oxima[i] = new Motorcycle();
                    oxima[i].setEtosKat(2000);
                    break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Oxima[" + i + "]:\n" + oxima[i]);
            oxima[i].drive();
            System.out.println("--------------------------");
        }
    }
}
