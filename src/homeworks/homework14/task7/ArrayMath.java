package homeworks.homework14.task7;

public class ArrayMath {

    int sum;
    ArrayInfo newArray = new ArrayInfo();


    public int biggestNumberInArray(int [] array){
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]){
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }
}
