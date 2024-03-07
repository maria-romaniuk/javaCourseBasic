package lessons.lesson36.task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        Generics<String, Integer> generics1= new Generics<>("text", 1);
        System.out.println( generics1);


        Generics<Integer, List<String>> generics2= new Generics<>( 1, new ArrayList<>());
        System.out.println( generics2);




    }
}
