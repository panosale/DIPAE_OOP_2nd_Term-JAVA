public class ClassicHotelRoom extends HotelRoom {
    private double price;

    @Override
    public void setPrice(double price) {
        try {
            if (price < 30 || price > 120)
                throw new WrongRoomPrice();
            this.price = price;
        }
        catch (WrongRoomPrice s) {
            System.out.println("ClassicHotelRoom price is set to minimum.");
            this.price = 30;
        }
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ClassicHotelRoom.price: " + this.price;
    }
}
