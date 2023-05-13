// Genikefsi - Polymorfismos
package ergastirio8;

import java.lang.Math;
public class TestVehicle {
    public static void main(String[] args) {
        int n, i;
        // Gia ton ypologismo ton pososton ton oximaton
        int arithmosCars, arithmosTrucks, arithmosMotorcycles, tmp_thesi, tmp_Cars = 0, tmp_Trucks = 0, tmp_Motorcycles = 0, tmp_undefinedVehicles = 0;
        final float posostoCars = 0.7f;
        final float posostoTrucks = 0.15f;
        final float posostoMotorcycles = 0.15f; // Den xreiazetai
        // To megethos tou pinaka zititai apo ton xristi
        System.out.print("Dose to megethos tou pinaka oximaton: ");
        n = UserInput.getInteger();
        // Ypologismos pososton oximaton analoga me to eidos tous. 70%=Cars, 15%=Trucks, 15%=Motorcycles
        arithmosCars = Math.round(n * posostoCars);
        arithmosTrucks = Math.round(n * posostoTrucks);
        arithmosMotorcycles = n - arithmosCars - arithmosTrucks; //Math.round(n * posostoMotorcycles); // Den xreiaetai
        // Emfanisi oximaton ana pososto. Einai ektimisi
        System.out.println("***** Cars to calculate: " + arithmosCars + ", Trucks to calculate: " + arithmosTrucks + ", Motorcycles to calculate: " + arithmosMotorcycles + ". *****\n");
        // Arxikopoiisi pinaka [n] theseon antikeimenon tis superclass Vehicle()
        Vehicle[] oxima = new Vehicle[n];
        for (i = 0; i < n; i++) {
            oxima[i] = new Vehicle() {
                @Override
                void drive() {}
                @Override
                short getArithmosThyron() { return 0; }
                @Override
                void setArithmosThyron(short new_arithmosThyron) { }
                @Override
                short getArithmosAksonon() { return 0; }
                @Override
                void setArithmosAksonon(short new_arithmosAksonon) { }
                boolean getDiatheteiPlainoOxima() { return false;}
                @Override
                void setDiatheteiPlainoOxima(boolean new_diatheteiPlainoOxima) { }
            };
        }
        // Eisagogi oximaton se tyxaies thesis tou pinaka analoga me ta pososta tous
        i = 0;
        System.out.println("***** Calculating Cars. Please wait *****");
        Car tmpCar = new Car();
        while (tmp_Cars < arithmosCars && i < n) {
            tmp_thesi = (int) (Math.random() * n); // Evresi tixaias thesis gia kataxorisi tou antikeimenou <Car> ston pinaka
            while (oxima[tmp_thesi].getEtosKat() == -1) { // An to etos kataskevis einai -1 simainei oti h thesi [i] exei akoma to arxiko antikeimeno Vehicle kai oxi kapoio Oxima
//                System.out.println("Calculating Cars. Please wait. [tmp_thesi = " + tmp_thesi + "], [i = " + i + "]."); // GIA ELEGXO
                // Oi parakato grammes mporoun na allaxtoun oste na zitountai ta stoixeia tou oximatos
                oxima[tmp_thesi] = tmpCar;
                oxima[tmp_thesi].setEtosKat(1800);
                oxima[tmp_thesi].setIdioktitis("Idioktitis Oximatos " + tmp_thesi);
                oxima[tmp_thesi].setArKykloforias("Pinakida" + ((tmp_thesi + 1) * 1000 + 1));
                oxima[tmp_thesi].setArithmosThyron((short) 4);
                tmp_Cars++;
                i++;
            }
        }
        System.out.println("***** Cars calculation finished. Go on *****\n");
        System.out.println("***** Calculating Trucks. Please wait *****");
        Truck tmpTruck = new Truck();
        while (tmp_Trucks < arithmosTrucks && i < n) {
            tmp_thesi = (int)(Math.random() * n); // Evresi tixaias thesis gia kataxorisi tou antikeimenou <Truck> ston pinaka
            while (oxima[tmp_thesi].getEtosKat() == -1) { // An to etos kataskevis einai -1 simainei oti h thesi [i] exei akoma to arxiko antikeimeno Vehicle kai oxi kapoio Oxima
//                System.out.println("Calculating Trucks. Please wait. [tmp_thesi = " + tmp_thesi + "], [i = " + i + "]."); // GIA ELEGXO
                // Oi parakato grammes mporoun na allaxtoun oste na zitountai ta stoixeia tou oximatos
                oxima[tmp_thesi] = tmpTruck;
                oxima[tmp_thesi].setEtosKat(1900);
                oxima[tmp_thesi].setIdioktitis("Idioktitis Oximatos " + tmp_thesi);
                oxima[tmp_thesi].setArKykloforias("Pinakida" + ((tmp_thesi + 1) * 1000 + 1));
                oxima[tmp_thesi].setArithmosAksonon((short)3);
                tmp_Trucks++;
                i++;
            }
        }
        System.out.println("***** Trucks calculation finished. Go on *****\n");
        System.out.println("***** Calculating Motorcycles. Please wait *****");
        Motorcycle tmpMotorcycle = new Motorcycle();
        while (tmp_Motorcycles < arithmosMotorcycles && i < n) {
            tmp_thesi = (int)(Math.random() * n); // Evresi tixaias thesis gia kataxorisi tou antikeimenou <Motorcycle> ston pinaka
            while (oxima[tmp_thesi].getEtosKat() == -1) { // An to etos kataskevis einai -1 simainei oti h thesi [i] exei akoma to arxiko antikeimeno Vehicle kai oxi kapoio Oxima
//                System.out.println("Calculating Motorcycles. Please wait. [tmp_thesi = " + tmp_thesi + "], [i = " + i + "]."); // GIA ELEGXO
                // Oi parakato grammes mporoun na allaxtoun oste na zitountai ta stoixeia tou oximatos
                oxima[tmp_thesi] = tmpMotorcycle;
                oxima[tmp_thesi].setEtosKat(2000);
                oxima[tmp_thesi].setIdioktitis("Idioktitis Oximatos " + tmp_thesi);
                oxima[tmp_thesi].setArKykloforias("Pinakida" + ((tmp_thesi + 1) * 1000 + 1));
                oxima[tmp_thesi].setDiatheteiPlainoOxima(true);
                tmp_Motorcycles++;
                i++;
            }
        }
        System.out.println("***** Motorcycles calculation finished. Go on *****\n");
        System.out.println("***************** O PINAKAS GEMISE *****************");
        // Emfanisi apotelesmaton
        tmp_Cars = 0;
        tmp_Trucks = 0;
        tmp_Motorcycles = 0;
        for (i = 0; i < n; i++) {
            if (oxima[i] instanceof Car)
                tmp_Cars++;
            else if ((oxima[i] instanceof Truck))
                tmp_Trucks++;
            else if ((oxima[i] instanceof Motorcycle))
                tmp_Motorcycles++;
            else tmp_undefinedVehicles++;
            System.out.println("To Oxima[" + i + "]" + " einai klasis: " + oxima[i].getClass()); // GIA ELEGXO
            System.out.println(oxima[i]);
            oxima[i].drive();
            System.out.println("--------------------------");
        }
        // Emfanisi synolikou arithmou oximaton pou dimiourgithikan gia epalithefsi
        System.out.println("***** Cars calculated: " + tmp_Cars + ", Trucks calculated: " + tmp_Trucks + ", Motorcyles calculated: " + tmp_Motorcycles + ", " +
                "Undefined Vehicles calculated: " + tmp_undefinedVehicles + ". *****");
    }
}
