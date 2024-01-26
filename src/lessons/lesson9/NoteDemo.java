package lessons.lesson9;

public class NoteDemo {
    public static void main(String[] args) {

        NoteManager myNote = new NoteManager();

        NoteInfo myNote1 = myNote.createNote();
        NoteInfo myNote2 = myNote.createNote();

        myNote1.noteInfoMethod();
        myNote2.noteInfoMethod();

    }
}