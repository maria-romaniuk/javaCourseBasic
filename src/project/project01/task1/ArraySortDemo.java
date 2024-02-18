package project.project01.task1;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        CreateArrayFromUserInput create = new CreateArrayFromUserInput();
        ArrayService service = new ArrayService();

        int[] array= create.fillArrayFromUserInput();
        System.out.println(Arrays.toString(array));

        service.sortArray(array);
        service.printArray("Your sorted array:",array);

        int[] reverseArray = service.reverceArray(array);
        service.printArray("Your reverse array:",reverseArray);

    }
}
