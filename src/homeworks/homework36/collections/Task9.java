package homeworks.homework36.collections;

//   9 Создать TreeMap, где ключом является число типа Integer, а значением - его факториал.
//   Вывести на экран все элементы TreeMap.

import java.util.TreeMap;

public class Task9 {
    public static int factorial(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void printData(TreeMap<Integer,Integer> list){
        for (Integer key : list.keySet()) {
            System.out.println("Number: " + key + " -> Factorial: " + list.get(key));
        }
    }

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(5, factorial(5));
        treeMap.put(2, factorial(2));
        treeMap.put(4, factorial(4));

        printData(treeMap);

    }
}
