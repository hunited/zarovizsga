package hu.nive.ujratervezes.potpotvizsga.aquarium;

public abstract class Fish {

    String name;
    int weight;
    String color;
    boolean memoryLoss;

    abstract String status();
    abstract void feed();

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean isMemoryLoss() {
        return memoryLoss;
    }

}
