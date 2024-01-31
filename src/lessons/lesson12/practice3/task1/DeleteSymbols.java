package lessons.lesson12.practice3.task1;

import lessons.lesson6.scanner.UserInput;

public class DeleteSymbols {
    public static void main(String[] args) {

        UserInput ui = new UserInput();

//        String myText = ui.inputText("Enter your text:");
        String myText = " my short (text) with a few symbols@!!";



        for (int i = 0; i < myText.length(); i++){
            i= myText.indexOf("(");

            System.out.println(i);
        }


    }
}
