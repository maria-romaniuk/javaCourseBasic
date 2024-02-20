package lessons.lesson26.TVArrayList;

import java.util.ArrayList;

public class TVDemo {
    public static TV findByProducer(ArrayList<TV> arraysTV, String producer){
        for (int i = 0; i < arraysTV.size(); i++) {
            if(arraysTV.get(i).getProducer().equals(producer)){
                return arraysTV.get(i);
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TVCollection collection = new TVCollection();
        ArrayList<TV> arraysTV= new ArrayList<>();

        arraysTV.add(new TV("LG", 55));
        arraysTV.add(new TV("Samsung", 65));
        arraysTV.add(new TV("Sony", 75));

        String searchTVProducer = "Sony";

        TV TvForDelete = findByProducer(arraysTV, searchTVProducer);

        arraysTV.remove(TvForDelete);


    }

}
