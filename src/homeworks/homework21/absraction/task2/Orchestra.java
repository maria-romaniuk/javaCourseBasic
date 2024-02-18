package homeworks.homework21.absraction.task2;

public class Orchestra {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin();

        guitar.playNote();
        violin.playNote();
        piano.playNote();
    }
}
