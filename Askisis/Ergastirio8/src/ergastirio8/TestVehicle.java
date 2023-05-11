// Genikefsi - Polymorfismos
package ergastirio8;
public class TestVehicle {
    public static void main(String[] args) {
        int n; // To megethos tou pinaka zititai apo ton xristi
        short tmp_eidosOximatos; // Gia tin kataxorisi tou eidous tou oximatos
        // Gia ton ypologismo ton pososton ton oximaton
        int arithmosCars, arithmosTrucks, arithmosMotorcycles, tmp_Cars = 0, tmp_Trucks = 0, tmp_Motorcycles = 0;
        int final posostoCars = 70;
        int final posostoTrucks = 15;
        int final posostoMotorcycles = 15;
        System.out.print("Dose to megethos tou pinaka oximaton: ");
        n = UserInput.getInteger();
        arihmosCars = n * (posostoCars / 100);
        arihmosTrucks = n * (posostoTrucks / 100);
        arihmosMotorcycles = n * (posostoMotorcycles / 100);
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
                    oxima[i].setIdioktitis("Idioktitis Oximatos " + i);
                    oxima[i].setArKykloforias("Pinakida" + ((i+1) * 1000 + 1));
                    oxima[i].setArithmosThyron((short)4);
                    break;
                case 2:
                    oxima[i] = new Truck();
                    oxima[i].setEtosKat(1900);
                    oxima[i].setIdioktitis("Idioktitis Oximatos " + i);
                    oxima[i].setArKykloforias("Pinakida" + ((i+1) * 1000 + 1));
                    oxima[i].setArithmosAksonon((short)3);
                    break;
                case 3:
                    oxima[i] = new Motorcycle();
                    oxima[i].setEtosKat(2000);
                    oxima[i].setIdioktitis("Idioktitis Oximatos " + i);
                    oxima[i].setArKykloforias("Pinakida" + ((i+1) * 1000 + 1));
                    oxima[i].setDiatheteiPlainoOxima(true);
                    break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("To Oxima[" + i + "]" + " einai klasis: " + oxima[i].getClass() + "\n" + oxima[i]);
            oxima[i].drive();
            System.out.println("--------------------------");
        }
    }
}
