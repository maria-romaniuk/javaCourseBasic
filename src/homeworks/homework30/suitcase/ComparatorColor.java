package homeworks.homework30.suitcase;

import java.util.Comparator;

public class ComparatorColor implements Comparator<Suitcase> {

    @Override
    public int compare(Suitcase suitcase1, Suitcase suitcase2) {
        return suitcase1.getColor().compareTo(suitcase2.getColor());

    }

}
