public abstract class House {
    private int price;
    private int squareMeters;
    private int numberOfRooms;
    private int numberOfLivingRooms;

    public House(int price, int squareMeters, int numberOfRooms, int numberOfLivingRooms) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public int getPrice() {
        return price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                " [price=" + price +
                ", sqm=" + squareMeters +
                ", rooms=" + numberOfRooms +
                ", living rooms=" + numberOfLivingRooms + "]";
    }
}
