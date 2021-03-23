package hu.nive.ujratervezes.potvizsga.cleaning;

public class Office implements Cleanable {

    private static final int PRICE = 100;

    private final String address;
    private final int size;
    private final int floor;

    public Office(String address, int size, int floor) {
        this.address = address;
        this.size = size;
        this.floor = floor;
    }

    @Override
    public int clean() {
        return size * floor * PRICE;
    }

    @Override
    public String getAddress() {
        return address;
    }

}
