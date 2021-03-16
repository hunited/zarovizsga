package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {

    public int getCountOfDigits(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        return getSetWithNumbers(s).size();
    }

    private Set<Integer> getSetWithNumbers(String s) {
        Set<Integer> numbers = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(Character.getNumericValue(c));
            }
        }
        return numbers;
    }

}
