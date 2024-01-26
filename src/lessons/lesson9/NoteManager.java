package lessons.lesson9;

import lessons.lesson6.scanner.UserInput;

public class NoteManager {
    private UserInput userInput;
    private UserInput user = new UserInput();

    public NoteInfo createNote(){
        int number = user.inputIntiger("Number:");
        String message = user.inputText("Description: ");
        NoteInfo newNote = new NoteInfo(number,message);
        return newNote;
    }

}
