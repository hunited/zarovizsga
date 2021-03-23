package hu.nive.ujratervezes.potvizsga.cleaning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CleaningService {

    private final List<Cleanable> cleanables = new ArrayList<>();

    public void add(Cleanable cleanable) {
        cleanables.add(cleanable);
    }

    public int cleanAll() {
        Iterator<Cleanable> iterator = cleanables.iterator();
        int result = 0;
        while (iterator.hasNext()) {
            result += iterator.next().clean();
            iterator.remove();
        }
        return result;
    }

    public int cleanOnlyOffices() {
        Iterator<Cleanable> iterator = cleanables.iterator();
        int result = 0;
        while (iterator.hasNext()) {
            Cleanable temp = iterator.next();
            if (temp instanceof Office) {
                result += temp.clean();
                iterator.remove();
            }
        }
        return result;
    }

    public List<Cleanable> findByAddressPart(String address) {
        List<Cleanable> result = new ArrayList<>();
        for (Cleanable cleanable : cleanables) {
            if (cleanable.getAddress().contains(address)) {
                result.add(cleanable);
            }
        }
        return result;
    }

    public String getAddresses() {
        StringBuilder sb = new StringBuilder();
        for (Cleanable cleanable : cleanables) {
            sb.append(cleanable.getAddress()).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    public List<Cleanable> getCleanables() {
        return new ArrayList<>(cleanables);
    }

}
