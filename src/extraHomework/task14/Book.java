package extraHomework.task14;

public class Book {
    String title; // missed ;

    Book(String bookTitle) {
        this.title = bookTitle; // name of string inside of constructor is different as variable and missed ;
    }

    String getTitle() {
        return this.title;
    }
}
