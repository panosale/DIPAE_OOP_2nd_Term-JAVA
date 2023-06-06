// Packages
// ergastirio 11.2
public class TestNetwork {
    public static void main(String[] args) {
        Computer.Network computerNetwork = new Computer.Network();
        System.out.println(computerNetwork.toString());
        System.out.println();
        Traffic.Network trafficNetwork = new Traffic.Network();
        System.out.println(trafficNetwork.toString());
    }
}