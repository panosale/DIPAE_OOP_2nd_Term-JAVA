public class HouseRoom extends Room {
    private double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getSpace() {
        return super.getSpace();
    }

    @Override
    public void setSpace(double space) {
        super.setSpace(space);
    }

    @Override
    public String toString() {
        return "HotelRoom.price: " + this.price;
    }
}
