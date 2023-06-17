public class Hotel {
    private String hotelName;
    Room[][] rooms;
    public String getHotelName() {
        return hotelName;
    }
    public Hotel() {
        // Default constructor
        int rentbles = (int)((Constants.X * Constants.Y) * 0.9);
        int classics = (int)(rentbles * 0.8);
        int rentblsFound = 0, classicsFound = 0;
        System.out.println("rentbles: " + rentbles);
        System.out.println("classics: " + classics);
        rooms = new Room[Constants.X][Constants.Y];
        for (int i = 0; i < Constants.X; i++)
            for (int j = 0; j < Constants.Y; j++) {
                if (rentblsFound < rentbles) {
                    System.out.print("Όροφος : " + i + ", Δωμάτιο: " + j + ".... ");
                    if (classicsFound < classics) {
                        rooms[i][j] = new ClassicHotelRoom();
                        rooms[i][j].setSpace(10);
                        rooms[i][j].setPrice(500);
                        classicsFound++;
                    } else {
                        rooms[i][j] = new HotelSuite();
                        rooms[i][j].setPrice(500);
                        rooms[i][j].setSpaceYpodoxis(5);
                    }
                    rentblsFound++;
                } else {
                    rooms[i][j] = new HouseRoom();
                    rooms[i][j].setSpace(11);
                    rooms[i][j].setPrice(22);
                }
            }


    }
    public double dailyFullRentAmmoun() {
        double sum = 0;
        for (int i = 0; i < rooms.length; i++)
            for (int j = 0; j <rooms[i].length; j++)
                sum+=rooms[i][j].getPrice();
        return sum;
    }
    public double totalSuiteHallSpace() {
        double sum = 0;
        for (int i = 0; i < rooms.length; i++)
            for (int j = 0; j <rooms[i].length; j++)
                if (rooms[i][j] instanceof HotelSuite)
                    sum+=rooms[i][j].getSpaceYpodoxis();
        return sum;
    }
    public double totalRoomArea() {
        double sum = 0;
        for (int i = 0; i < rooms.length; i++)
            for (int j = 0; j <rooms[i].length; j++)
                sum+=rooms[i][j].getSpace();
        return sum + this.totalSuiteHallSpace();
    }
    public void setName(String n) {
        this.hotelName = n;
    }

    @Override
    public String toString() {
        return this.hotelName;
    }
}
