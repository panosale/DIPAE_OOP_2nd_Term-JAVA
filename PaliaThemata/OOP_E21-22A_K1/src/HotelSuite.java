public class HotelSuite extends HotelRoom {
    private double spaceYpodoxis;

    public double getSpaceYpodoxis() {
        return spaceYpodoxis;
    }

    public void setSpaceYpodoxis(double spaceYpodoxis) {
        this.spaceYpodoxis = spaceYpodoxis;
    }

    @Override
    public void setSpace(double space) {
        super.setSpace(space);
    }

    @Override
    public double getSpace() {
        return super.getSpace();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        try {
            if (price < 100 || price > 400)
                throw new WrongRoomPrice();
            super.setPrice(price);
        }
        catch (WrongRoomPrice s) {
            System.out.println("HotelSuite price is set to minimum.");
            super.setPrice(100);
        }
    }

    @Override
    public String toString() {
        return "HotelSuite.spaceYpodoxis: " + this.spaceYpodoxis + ", HotelSuite.getSpace: " + super.getSpace() + ", HotelSuite.getPrice: " + super.getPrice();
    }
}
