package lessons.lesson26.phoneArrayList;

import java.util.ArrayList;

public class PhoneCollectionDemo {
    public static void main(String[] args) {
        /*
        создать коллекцию телефонов
        показать что она создана и пустая
        добавить в нее один элемент
        показать что элемент добавлен
        добавить до 5 элементов
        показать коллекцию
        удалить один из элементов по индексу
        удалить один из элементов по объекту

         показать коллекцию

         */


        ArrayList<Phone> phones = new ArrayList<>();

        System.out.println("Empty arrayList: " + phones);
        System.out.println("============");

        phones.add(new Phone (1,"Iphone 15 Pro", "Apple", 1000.0));
        System.out.println("Added element: " + phones);
        System.out.println("============");

        phones.add(new Phone (2,"Iphone 14 Pro Max", "Apple", 1520.0));
        phones.add(new Phone (3,"Iphone 11", "Apple", 1320.0));
        phones.add(new Phone (4,"Iphone 12 Max", "Apple", 1221.0));
        phones.add(new Phone (5,"Iphone 10 Pro Max", "Apple", 143.0));
        phones.add(new Phone (6,"Iphone XS", "Apple", 1300.0));
        System.out.println("Added 5 more elements: "+ phones);
        System.out.println("============");


        phones.remove(3);
        System.out.println("Removed index 3: " + phones);
        System.out.println("============");


        Phone phone = new Phone(5,"Iphone 10 Pro Max", "Apple", 143.0);
        phones.remove(phone);
        System.out.println("Removed obj 5: " + phones);
    }
}
