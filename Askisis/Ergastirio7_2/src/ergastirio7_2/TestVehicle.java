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
        oxima[0].setIdioktitis("Idioktitis 0");
        oxima[0].setArKykloforias("HJD2701");
        oxima[0].setEtosKat(2015);
        oxima[0].eng.setKyvismos(1600);
        oxima[0].eng.setIppodynami(120);
        // Oxima 2
        oxima[1].setIdioktitis("Idioktitis 1");
        oxima[1].setArKykloforias("FIW7612");
        oxima[1].setEtosKat(1998);
        oxima[1].eng.setKyvismos(1300);
        oxima[1].eng.setIppodynami(83);
        // Oxima 3
        oxima[2].setIdioktitis("Idioktitis 2");
        oxima[2].setArKykloforias("sta2p101");
        oxima[2].setEtosKat(2002);
        oxima[2].eng.setKyvismos(1900);
        oxima[2].eng.setIppodynami(150);
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
