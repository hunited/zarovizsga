package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog {

    private static final int FEED_VALUE = 4;
    private static final int HAPPINESS_MULTIPLIER = 3;

    public Husky(String name) {
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
