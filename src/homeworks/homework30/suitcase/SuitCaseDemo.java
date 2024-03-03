package homeworks.homework30.suitcase;
//Чемодан - 3 параметра материал (пластик или ткань), размер - M, L, XL и цвет.
// Создать две коллекции - TreeSet и LinkedList и отсортировать по трем параметрам - размеру и материалу и цвету


import java.util.*;

public class SuitCaseDemo {
    public static void main(String[] args) {

        ComparatorMaterial material = new ComparatorMaterial();
        ComparatorSize size = new ComparatorSize();
        ComparatorColor color = new ComparatorColor();

        Comparator<Suitcase> comparatorSuitcase = material.thenComparing(color).thenComparing(size);


        Suitcase suitCase = new Suitcase(Material.Plastic, Color.White,  Size.M);
        Suitcase suitCase2 = new Suitcase( Material.Plastic, Color.Blue, Size.S);
        Suitcase suitCase3 = new Suitcase(Material.Fabric,Color.Grey, Size.XL);
        Suitcase suitCase4 = new Suitcase(Material.Fabric, Color.Grey,Size.M);
        Suitcase suitCase5 = new Suitcase(Material.Plastic, Color.Black, Size.S);

        Set<Suitcase> suitcaseSet = new TreeSet<>(comparatorSuitcase);

        suitcaseSet.add(suitCase);
        suitcaseSet.add(suitCase2);
        suitcaseSet.add(suitCase3);
        suitcaseSet.add(suitCase4);
        suitcaseSet.add(suitCase5);
        suitcaseSet.add(new Suitcase(Material.Fabric, Color.Blue, Size.L));

        System.out.println("Set sorted: " + suitcaseSet);


        List<Suitcase> suitcaseList = new ArrayList<>();
        suitcaseList.add(suitCase3);
        suitcaseList.add(suitCase2);
        suitcaseList.add(suitCase);
        suitcaseList.add(suitCase4);
        suitcaseList.add(suitCase5);
        suitcaseList.add(new Suitcase(Material.Plastic, Color.White, Size.XL));

        System.out.println("ArrayList unsorted: " + suitcaseList);
        suitcaseList.sort(material.thenComparing(size).thenComparing(color));
        System.out.println("Sorted arrayList: " + suitcaseList);

    }
}
