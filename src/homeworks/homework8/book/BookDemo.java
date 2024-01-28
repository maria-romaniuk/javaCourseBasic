package homeworks.homework8.book;

public class BookDemo {
    public static void main(String[] args) {

        BookManager manager = new BookManager();

        Book book1 = manager.createBook();

        book1.printFullBookInfo();
    }
}
