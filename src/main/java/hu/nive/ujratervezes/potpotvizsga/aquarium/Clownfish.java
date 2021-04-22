package hu.nive.ujratervezes.potpotvizsga.aquarium;

public class Clownfish extends Fish {

    private final String name;
    private int weight;
    private final String color;
    private final boolean memoryLoss;

    public Clownfish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.memoryLoss = false;
    }

    @Override
    public String status() {
        return name + ", weight: " + weight + ", color: " + color + ", short term memory loss: " + memoryLoss;
    }

    @Override
    public void feed() {
        weight++;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

}
