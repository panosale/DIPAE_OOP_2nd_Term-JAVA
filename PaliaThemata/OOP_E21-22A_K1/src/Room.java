abstract class Room {
    private double space;
    private double price;
    private double spaceYpodoxis;
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getSpaceYpodoxis() {
        return spaceYpodoxis;
    }

    public void setSpaceYpodoxis(double spaceYpodoxis) {
        this.spaceYpodoxis = spaceYpodoxis;
    }

    public double getSpace() {
        return space;
    }

    public void setSpace(double space) {
        this.space = space;
    }

    public String toString() {
        return "Room.space: " + this.space;
    }
}
