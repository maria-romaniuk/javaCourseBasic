package homeworks.homework14;

import java.util.Arrays;

//Создать массив типа String с размером 7.
//Записать в него значения дней недели.
//Вывести на консоль значение последнего элемента.
public class Task4 {
    public static void main(String[] args) {
//        String[] strArray = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] strArray = new String[7];
        strArray[0] = "Monday";
        strArray[1] = "Tuesday";
        strArray[2] = "Wednesday";
        strArray[3] = "Thursday";
        strArray[4] = "Friday";
        strArray[5] = "Saturday";
        strArray[6] = "Sunday";
        System.out.println(Arrays.toString(strArray));

        System.out.println("The last day of week: " + strArray[strArray.length - 1]);

    }
}
