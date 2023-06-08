package hotel;

/**
 *
 * @author Panagiotis
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TwoBed twoBedRoom = new TwoBed(101, 1, 1);
        FourBed fourBedRoom = new FourBed(202, 2, 2, 2);
        Suite suite = new Suite(303, 3, 3, 3, "Panos");
        
        System.out.println("Two bed room\n" + twoBedRoom);
        System.out.println("Four bed room\n" + fourBedRoom);
        System.out.println("Suite\n" + suite);
        suite.startServing();
    }   
}
