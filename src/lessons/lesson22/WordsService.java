package lessons.lesson22;

public class WordsService {

    public String wordsLength(String[] array){
        String count = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() >= count.length()){
                count = array[i];
            }
        }
        return count;
    }

    public String[] reverseText(String[] array){

        for (int i = 0; i < array.length/2; i++) {

        }

        return array;
    }
}
