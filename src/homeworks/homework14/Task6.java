package homeworks.homework14;

//Дан массив слов. Создать два массива:
//
//один из слов в котором нечетное количество букв
//второй в котором четное


import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] wordsArray = {"plant", "carpet", "table", "paint", "bed", "laptop", "lamp", "box", "door", "shelf", "candle"};

        int evenLength = 0;
        int oddLength = 0;

        String[] oddArray = new String[oddLength];
        String[] evenArray = new String[evenLength];


        for (int i = 0; i < wordsArray.length; i++) {
            int arrayNum = wordsArray[i].length();
//        System.out.println(arrayNum);
            if (arrayNum % 2 == 0) {
//                evenArray[i] = wordsArray[i];
                evenLength++;
            } else {
//                oddArray[i] = wordsArray[i];
                oddLength++;
            }

        }



        System.out.println(Arrays.toString(evenArray));
        System.out.println(evenLength);

    }
}
