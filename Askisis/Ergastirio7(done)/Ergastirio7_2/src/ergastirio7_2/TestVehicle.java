package ergastirio7_2;
public class TestVehicle {
    public static void main(String[] args) {
        // To megethos tou pinaka dinetai apo tin askisi
        int n = 3;
        // Arxikopoiisi pinaka oximaton
        Vehicle[] oxima = new Vehicle[n];
        // Oxima 1
        SystimaDieythynsis sysdief1 = new SystimaDieythynsis();
        Mihani mihani1 = new Mihani(1600, 120);
        oxima[0] = new Vehicle(mihani1, sysdief1);
        oxima[0].setIdioktitis("Idioktitis 0");
        oxima[0].setArKykloforias("HJD2701");
        oxima[0].setEtosKat(2015);
        // oxima[0] = new Vehicle("Idioktitis 0", "HJD2701", 2015, 1600, 120);; // Enallaktiki ilopoiisi
        // Oxima 2
        SystimaDieythynsis sysdief2 = new SystimaDieythynsis();
        Mihani mihani2 = new Mihani(1300, 83);
        oxima[1] = new Vehicle(mihani2, sysdief2);
        oxima[1].setIdioktitis("Idioktitis 1");
        oxima[1].setArKykloforias("FIW7612");
        oxima[1].setEtosKat(1998);
        // oxima[1] = new Vehicle("Idioktitis 1", "FIW7612", 1998, 1300, 83);; // Enallaktiki ilopoiisi
        // Oxima 3
        SystimaDieythynsis sysdief3 = new SystimaDieythynsis();
        Mihani mihani3 = new Mihani(1900, 150);
        oxima[2] = new Vehicle(mihani3, sysdief3);
        oxima[2].setIdioktitis("Idioktitis 2");
        oxima[2].setArKykloforias("sta2p101");
        oxima[2].setEtosKat(2002);
        // oxima[2] = new Vehicle("Idioktitis 2", "HJD2701", 2002, 1900, 150); // Enallaktiki ilopoiisi
        // Provoli apotelesmaton
        int thesi;
        // Erotima 2.3.1
        do {
            System.out.print("Dose tin thesi (0 eos " + (n-1) + ") tou oximatos ston pinaka gia emfanisi tou Kyvismou:  ");
            thesi = UserInput.getInteger();
        }
        while (thesi < 0 || thesi > n - 1);
        System.out.println("To oxima sti thesi [" + thesi + "] exei Kyvismo: " + oxima[thesi].eng.getKyvismos());
        oxima[thesi].sysdief.vazeiEmpros(); // Erotima 2.3.4
        oxima[thesi].sysdief.svynei(); // Erotima 2.3.4
        System.out.println();
        // Erotima 2.3.2
        do {
            System.out.print("Dose tin thesi (0 eos " + (n-1) + ") tou oximatos ston pinaka gia emfanisi tis Ippodynamis:  ");
            thesi = UserInput.getInteger();
        }
        while (thesi < 0 || thesi > n - 1);
        System.out.println("To oxima sti thesi [" + thesi + "] exei Ippodynamis: " + oxima[thesi].eng.getIppodynami());
        oxima[thesi].sysdief.vazeiEmpros(); // Erotima 2.3.4
        oxima[thesi].sysdief.striveiAristera(); // Erotima 2.3.4
        oxima[thesi].sysdief.svynei(); // Erotima 2.3.4
        System.out.println();
        // Erotima 2.3.3
        do {
            System.out.print("Dose tin thesi (0 eos " + (n-1) + ") tou oximatos ston pinaka gia emfanisi tou onomatos idioktiti kai tou etous kataskevis:  ");
            thesi = UserInput.getInteger();
        }
        while (thesi < 0 || thesi > n - 1);
        System.out.println("To oxima sti thesi [" + thesi + "] exei Idioktitii '" + oxima[thesi].getIdioktitis() + "' kei etos kataskevis to " + oxima[thesi].getEtosKat());
        oxima[thesi].sysdief.vazeiEmpros(); // Erotima 2.3.4
        oxima[thesi].sysdief.striveiDexia(); // Erotima 2.3.4
        oxima[thesi].sysdief.svynei(); // Erotima 2.3.4
        System.out.println();
    }
}
