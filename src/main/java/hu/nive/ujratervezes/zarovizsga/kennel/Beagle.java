package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog {

    private static final int FEED_VALUE = 2;
    private static final int HAPPINESS_MULTIPLIER = 2;

    public Beagle(String name) {
        super(name);
    }

    @Override
    void feed() {
        happiness = happiness + FEED_VALUE;
    }

    @Override
    void play(int hours) {
        happiness = happiness + HAPPINESS_MULTIPLIER * hours;
    }

}
