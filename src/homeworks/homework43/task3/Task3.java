package homeworks.homework43.task3;
//Чтение данных из CSV файла и обработка их Описание: Написать программу на Java, которая будет читать данные из
// CSV (Comma-Separated Values) файла, используя классы FileReader и BufferedReader, и обрабатывать их.
// Программа должна способна разбирать строки из файла на поля, разделенные запятыми, и выполнять определенные
// операции на данных, такие как суммирование, поиск определенных значений и т.д.


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        String path = "homeworks/homework43/task3/task.csv";
        String line = "";
        Map<Integer, List<String>> dataMap = new HashMap<>();
        List<String> valuesList = new ArrayList<>();
        int lineNumber = 1;


        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");

                for (String value : values) {
                    valuesList.add(value.trim());
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
