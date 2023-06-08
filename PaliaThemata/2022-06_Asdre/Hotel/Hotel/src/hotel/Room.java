package hotel;

/**
 *
 * @author Panagiotis
 */
public class Room {
    private int roomNumber;
    private double nightCharge;
    private int rentDays;
    
    public Room() {
        // Default constructor
        this.nightCharge = 50.0;
    }
    public Room(double new_nightCharge) {
        // Semi constructor
        this(0, 0);
        this.nightCharge = new_nightCharge;
    }
    public Room(int new_roomNumber, int new_rentDays) { //, double new_nightCharge
        // Full constructor
        this.roomNumber = new_roomNumber;
        this.nightCharge = 50;
        this.rentDays = new_rentDays;
    }
    // Set-Get methods
    public void setRoomNumber(int new_roomNumber) {
        this.roomNumber = new_roomNumber;
    }
    public int getRoomNumber() {
        return this.roomNumber;
    }
    public void setNightCharge(double new_nightCharge) {
        this.nightCharge = new_nightCharge;
    }
    public double getNightCharge() {
        return this.nightCharge;
    }
    public void setRentDays(int new_rentDays) {
        this.rentDays = new_rentDays;
    }
    public int getRentDays() {
        return this.rentDays;
    }
    // toString method
    public String toString() {
        return "Room number: " + this.roomNumber + ", Room's night charge: " + this.nightCharge + ", Rent days: " + this.rentDays;
    }
}
