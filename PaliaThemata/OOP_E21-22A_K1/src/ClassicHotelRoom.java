public class ClassicHotelRoom extends HotelRoom {
    @Override
    public void setPrice(double price) {
        try {
            if (price < 30 || price > 120)
                throw new WrongRoomPrice();
            super.setPrice(price);
        }
        catch (WrongRoomPrice s) {
            System.out.println("ClassicHotelRoom price is set to minimum.");
            super.setPrice(30);
        }
    }

    @Override
    public String toString() {
        return "ClassicHotelRoom.price: " + this.getPrice();
    }
}
