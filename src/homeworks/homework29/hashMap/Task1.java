package homeworks.homework29.hashMap;
//Словарь перевода слов:
//
//Создайте HashMap, где ключом является слово на английском языке, а значением - его перевод на другой язык.
//Добавьте в словарь пять пар слов.
//Выведите перевод слова, введенного пользователем.
//Удалите слово из словаря и выведите обновленный список слов.


import lessons.lesson6.scanner.UserInput;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    private static UserInput ui = new UserInput();
    public static void main(String[] args) {
        Map<String, String> dictionary  = new HashMap<>();

        dictionary.put("apple", "яблоко");
        dictionary.put("table", "стол");
        dictionary.put("plant", "растение");
        dictionary.put("lamp", "лампа");
        dictionary.put("pillow", "подушка");

//        System.out.println(dictionary);


        for (Map.Entry<String,String> entry: dictionary.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue()) ;
        }

        translate(dictionary);

        deleteWord(dictionary);

        for (Map.Entry<String,String> entry: dictionary.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue()) ;
        }

    }


    public static void translate (Map<String, String> list){
        String keyWord = ui.inputText("Enter your word for translate");
        String value = list.get(keyWord);

        if (!list.containsKey(keyWord)){
            System.out.println("There is no " + keyWord + " in our dictionary");
        } else {
            System.out.println(keyWord +" : " + value);
        }
    }

    public static void deleteWord(Map<String, String> list){
        String keyWord = ui.inputText("Enter your word for delete");
        if (list.containsKey(keyWord)){
            list.remove(keyWord);
        } else {
            System.out.println("Sorry, there is no " + keyWord + " in this dictionary");
        }
    }

}
