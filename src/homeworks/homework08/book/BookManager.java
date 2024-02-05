package homeworks.homework08.book;

import lessons.lesson6.scanner.UserInput;

public class BookManager {
    private final UserInput ui = new UserInput();

    public Book createFullBook(){

        String author = ui.inputText("Enter Author name: ");
        String bookName = ui.inputText("Enter Book name: ");
        int quantity = ui.inputIntiger("Enter pages quantity: ");
        String catalogNum = ui.inputText("Enter catalog number: ");
        String available = ui.inputText("Is this book in the storage? ");
        if (catalogNum.isEmpty()){
            catalogNum = "undefined";
        }
        if(available.isEmpty()){
            available = "undefined";
        }

        return new Book(author, bookName, quantity, catalogNum, available);
    }

    public Book createShortBook(){
        String author = ui.inputText("Enter Author name: ");
        String bookName = ui.inputText("Enter Book name: ");

        return new Book(author,bookName);
    }
    // 1. add new info with scanner

//    public Book changeBookInfo(){
//        int quantity = ui.inputIntiger("Add pages quantity: ");
//        String catalogNum = ui.inputText("Add catalog number: ");
//        String available = ui.inputText("Is this book in the storage? ");
//        return new ;
//    }
}
