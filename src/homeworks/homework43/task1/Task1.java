package homeworks.homework43.task1;

import homeworks.homework21.encapsulation.task1.BankAccount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Чтение данных из текстового файла и вывод на экран Описание: Написать программу на Java, которая будет читать
// данные из текстового файла, используя классы FileReader и BufferedReader, и выводить их на экран.
public class Task1 {
    public static void main(String[] args) {
        String fileName = "src/homeworks/homework43/task1/task.txt";

        try(FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File doesn't exist: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("File read error: " + ex.getMessage());
        }
    }
}
