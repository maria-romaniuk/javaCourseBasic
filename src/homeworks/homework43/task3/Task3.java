package homeworks.homework43.task3;
//Чтение данных из CSV файла и обработка их Описание: Написать программу на Java, которая будет читать данные из
// CSV (Comma-Separated Values) файла, используя классы FileReader и BufferedReader, и обрабатывать их.
// Программа должна способна разбирать строки из файла на поля, разделенные запятыми, и выполнять определенные
// операции на данных, такие как суммирование, поиск определенных значений и т.д.


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {
        String path = "homeworks/homework43/task3/task.csv";
        String line = "";



        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path)){

            };
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
