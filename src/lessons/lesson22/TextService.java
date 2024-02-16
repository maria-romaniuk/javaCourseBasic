package lessons.lesson22;

import lessons.lesson6.scanner.UserInput;

public class TextService {

    private UserInput ui = new UserInput();


    public String [] fillArray(){
        String text = ui.inputText("Enter your text:");

        String changedText = text.toLowerCase();
        String [] array = changedText.split(" ");

        boolean textChecker =false;
        int i = 0;
        while (!textChecker) {
            array[i].replace(" ", "");
            i++;

            System.out.println("i " + i );
        }
        return array;
    }


}
