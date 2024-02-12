package homeworks.homework14;

import java.util.Arrays;
import java.util.Objects;

public class Task8 {

    public static void main(String[] args) {
//        String text = "this is my text";
        String text= "Do geese see God?";

        boolean isPalindrome = false;

        String checkText= text.toLowerCase();
        checkText = checkText.replace(".", "");
        checkText = checkText.replace("!", "");
        checkText = checkText.replace("?", "");
        checkText = checkText.replace(")", "");
        checkText = checkText.replace("(", "");
        checkText = checkText.replace(",", "");
        checkText = checkText.replace(" ", "");
        String[] words = checkText.split("");

        System.out.println("text " + checkText);

//        String replaceChar = "";

//        char[] charArray = checkText.toCharArray();
//        String[] newArray;
        int newLength = 0;
        for (int i = 0; i< words.length; i++){
            if (!words[i].equals(" ")){
                newLength++;
            }
        }

        for (int i = 0; i < words.length/2; i++){
            if (Objects.equals(words[i], words[words.length - 1 - i])) {
                isPalindrome = true;
            } else{
               isPalindrome = false;
            }
        }


        if(isPalindrome){
            System.out.println("Good news! your text is palindrome");
        } else{
            System.out.println("sorry, this is not a palindrome ");
        }


//        System.out.println("новая длинна " + newLength);
//
////        System.out.println(Arrays.toString(charArray));
//        System.out.println("words " + Arrays.toString(words));
//        System.out.println(words[6]);
    }
}
