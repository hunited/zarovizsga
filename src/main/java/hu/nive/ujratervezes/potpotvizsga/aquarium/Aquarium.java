package hu.nive.ujratervezes.potpotvizsga.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    List<Fish> pisces = new ArrayList<>();

    public void addFish(Fish fish) {
        pisces.add(fish);
    }

    public void feed() {
        for (Fish fish : pisces) {
            fish.feed();
        }
    }

    public void removeFish() {
        pisces.removeIf(fish -> fish.getWeight() >= 11);
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish fish : pisces) {
            result.add(fish.status());
        }
        return result;
    }

}
