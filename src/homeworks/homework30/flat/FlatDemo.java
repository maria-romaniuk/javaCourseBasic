package homeworks.homework30.flat;

import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {
        Set<Flat> flats = new TreeSet<>();
        flats.add(new Flat(2,56.2));
        flats.add(new Flat(3,86.23));
        flats.add(new Flat(1,35.7));
        flats.add(new Flat(3,79.93));


        System.out.println(flats);
    }
}
