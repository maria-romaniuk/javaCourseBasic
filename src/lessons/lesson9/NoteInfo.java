package lessons.lesson9;

public class NoteInfo {
   private int number;

    private String messageNote;



    public NoteInfo(int number, String messageNote) {
        this.number = number;
        this.messageNote = messageNote;
    }

    public void noteInfoMethod(){
        System.out.println("Your note: " + number + " " + messageNote);
    }
}
