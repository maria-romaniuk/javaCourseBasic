package homeworks.homework08.book;

public class BookDemo {
    public static void main(String[] args) {

        BookManager manager = new BookManager();

        Book book1 = manager.createFullBook();

        book1.printFullBookInfo();

        Book book2 = manager.createShortBook();

        book2.setPagesQuantity(234);
        book2.setCatalogNumber("DB-2139-9");
        book2.setAvailable("yes");
        book2.printFullBookInfo();


//        UserInput ui = new UserInput();
//
//        String str = ui.inputText("enter your text");
//
//        System.out.println(str);
//
//        if (str.isEmpty()){
//            System.out.println("nothing here");
//        } else{
//            System.out.println(str);
//        }

    }
}
