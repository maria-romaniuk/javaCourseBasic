package homeworks.homework8.book;

import lessons.lesson6.scanner.UserInput;

public class BookManager {
    private UserInput ui = new UserInput();

    public Book createBook(){

        String author = ui.inputText("Enter Author name:");
        String bookName = ui.inputText("Enter Book name: ");
        int quantity = ui.inputIntiger("Enter pages quantity: ");
        String catalogNum = ui.inputText("Enter catalog number: ");
        String available = ui.inputText("Is this book in storage?");

        return new Book(author, bookName, quantity, catalogNum, available);
    }
}
