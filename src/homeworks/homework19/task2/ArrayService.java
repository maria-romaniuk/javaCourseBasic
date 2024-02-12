package homeworks.homework19.task2;


//  пробел сделать проверки
// while пройти проверку на пробел возвращает true/false через replace заменить все пробелы
import lessons.lesson6.scanner.UserInput;

public class ArrayService {

    private UserInput ui = new UserInput();

    public String[] fillArray(){
        String text = ui.inputText("enter your text, please: ");
        String [] array = text.split(" ");
        return array;
    }

    public int wordsCount(String[] array){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
        }
        return counter;
    }
}
