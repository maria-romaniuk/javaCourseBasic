package homeworks.homework14;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
//        String text = "this is my text";
        String text= "Do geese see God?";

        String checkText= text.toLowerCase();
        String[] words = checkText.split("");


//        String replaceChar = "";

//        char[] charArray = checkText.toCharArray();
        for (int i = 0; i<= words.length; i++){
            if (words[i].equals(" ")){

            }
        }

//        System.out.println(Arrays.toString(charArray));
        System.out.println("words " + Arrays.toString(words));
        System.out.println(words[6]);
    }
}