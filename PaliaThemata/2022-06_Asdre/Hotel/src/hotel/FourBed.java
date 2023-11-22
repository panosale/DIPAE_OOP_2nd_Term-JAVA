package hotel;

/**
 *
 * @author Panagiotis
 */
public class FourBed extends Room {
    private int floor;
    private int persons;
    public FourBed() {
        // Default constructor
        super();
        super.setNightCharge(super.getNightCharge() + 100);
    }       
    public FourBed(int new_roomNumber, int new_rentDays, int new_floor, int new_persons) {
        // Semi constructor
        super(new_roomNumber, new_rentDays);
        super.setNightCharge(super.getNightCharge() + 100);
        this.floor = new_floor;
        this.persons = new_persons;
    }
    public FourBed(int new_roomNumber, double new_nightCharge, int new_rentDays, int new_floor, int new_persons) {
        // Full constructor
        super(new_roomNumber, new_rentDays);
        this.floor = new_floor;
        this.persons = new_persons;
    }
    // Set-Get methods
    public void setFloor(int new_floor) {
        this.floor = new_floor;
    }
    public int getFloor() {
        return this.floor;
    }
    public void setPersons(int new_persons) {
        this.persons = new_persons;
    }
    public int getPersons() {
        return this.persons;
    }
    // toString method
    public String toString() {
        return super.toString() + ", Floor: " + this.floor + ", Persons to stay: " + this.persons;
    }
}
