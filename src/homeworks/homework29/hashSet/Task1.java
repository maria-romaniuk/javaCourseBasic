package homeworks.homework29.hashSet;

//Уникальный набор имен:
//
//Создайте HashSet для хранения имен.
//Добавьте в набор десять имен, некоторые из которых могут повторяться.
//Выведите количество уникальных имен в наборе.
//Проверьте, содержит ли набор определенное имя.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>(Arrays.asList("Lara", "Nick", "Paul", "Maria","Paul", "Phillip",
                "Karim","Violetta", "Daria","Nick", "Opheli", "Renata"));

//        names.add("Lara");
//        names.add("Nick");
//        names.add("Paul");
//        names.add("Maria");
//        names.add("Violetta");
//        names.add("Paul");
//        names.add("Phillip");
//        names.add("Alex");
//        names.add("Nick");
//        names.add("Karim");
//        names.add("Deja");

        Set<String> uniqSet = new HashSet<>(names);
        System.out.println(uniqSet);

        System.out.println("There are " + uniqSet.size() + " uniq names in Collection");

        checkName(uniqSet, "Lara");



    }

    public static void checkName(Set<String> names, String checkName){
        if (names.contains(checkName)){
            System.out.println("You was looking for this name: " + checkName);
        }else{
            System.out.println("There is no " + checkName + " in this collection");
        }
    }


    public static void printData(Set<String> names){
        System.out.println("==============");

    }
}
