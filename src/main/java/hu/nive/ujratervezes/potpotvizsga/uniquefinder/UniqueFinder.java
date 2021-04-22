package hu.nive.ujratervezes.potpotvizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {

    public List<Character> uniqueChars(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Null not allowed");
        }
        List<Character> result = new ArrayList<>();
        for (Character c : s.toCharArray()) {
            if (!result.contains(c)) {
                result.add(c);
            }
        }
        return result;
    }

}
