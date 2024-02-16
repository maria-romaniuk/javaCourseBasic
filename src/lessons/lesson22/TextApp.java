package lessons.lesson22;

//Создать набор классов и методов, которые нужны для обработки текстовых данных
//
//Необходимо выполнять различные операции с текстом,
//такие как подсчёт количества вхождений слова,
//нахождение самого длинного слова и обратная сортировка слов по алфавиту.
//
//Требования:
//
//    *) Используйте интерфейсы для определения общих операций обработки текста.
//
//    Реализуйте различные классы, которые реализуют эти интерфейсы для
//    выполнения конкретных задач (например, классы ПодсчетСлов, ПоискМаксимальногоСлова).
//    Используйте массивы для хранения слов текста.
//    Примените циклы для итерации по словам и выполнения операций обработки.


import java.util.Arrays;

public class TextApp {
    public static void main(String[] args) {

        TextService service = new TextService();

        String[] array =  service.fillArray();
        System.out.println(Arrays.toString(array));
    }
}
