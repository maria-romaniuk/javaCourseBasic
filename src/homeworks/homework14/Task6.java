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




        for (int i = 0; i < wordsArray.length; i++) {
//            int arrayNum = wordsArray[i].length();
//        System.out.println(arrayNum);
            if (wordsArray[i].length() % 2 == 0) {
//                evenArray[evenLength] = wordsArray[i];
                evenLength++;
            } else {
//                oddArray[oddLength] = wordsArray[i];
                oddLength++;
            }

        }
        System.out.println(oddLength);
        System.out.println(evenLength);
        System.out.println(Arrays.toString(wordsArray));

        String[] evenArray = new String[evenLength];
        String[] oddArray = new String[oddLength];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            if ((wordsArray[i].length()) % 2 == 0){
                evenArray[evenIndex] = wordsArray[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = wordsArray[i];
                oddIndex++;
            }
        }
        System.out.println("Even array " + Arrays.toString(evenArray));
        System.out.println("Odd array  " + Arrays.toString(oddArray));





    }



}
