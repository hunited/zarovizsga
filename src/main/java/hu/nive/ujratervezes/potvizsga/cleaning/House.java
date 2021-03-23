package hu.nive.ujratervezes.potvizsga.cleaning;

public class House implements Cleanable {

    private static final int PRICE = 80;

    private final String address;
    private final int size;

    public House(String address, int size) {
        this.address = address;
        this.size = size;
    }

    @Override
    public int clean() {
        return size * PRICE;
    }

    @Override
    public String getAddress() {
        return address;
    }

}
