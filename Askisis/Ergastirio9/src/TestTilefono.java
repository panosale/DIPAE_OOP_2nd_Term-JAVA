// Genikefsi - Polymorfismos #2
// ergastirio 9

public class TestTilefono {
    public static void main(String[] args) {
        Kinito kin1 = new Kinito();
        Stathero stath1 = new Stathero();
        kin1.setPhoneNumber("6997452834");
        stath1.setPhoneNumber("2310854962");
        Kinito kin2 = new Kinito("6946285741"); // Diaforetiki arxikopoiisi
        Stathero stath2 = new Stathero("2392302473"); // Diaforetiki arxikopoiisi
        System.out.println("Stathero 1: " + stath1);
        System.out.println("Stathero 2: " + stath2);
        System.out.println("Kinito 1: " + kin1);
        System.out.println("Kinito 2: " + kin2);
        System.out.println("Stahero 1:");
        stath1.dial("2621111333");
        stath1.dial("6921111125");
        System.out.println("Stahero 2:");
        stath2.dial("2622222233");
        stath2.dial("6922222225");
        System.out.println("Kinito 1:");
        kin1.dial("2621111333");
        kin1.dial("6921111125");
        System.out.println("Kinito 2:");
        kin2.dial("2622222233");
        kin2.dial("6922222225");
        System.out.println("Stathero 1: " + stath1);
        System.out.println("Stathero 2: " + stath2);
        System.out.println("Kinito 1: " + kin1);
        System.out.println("Kinito 2: " + kin2);
    }
}
