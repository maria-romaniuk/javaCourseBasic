package lessons.lesson37;

public class LibraryDemo {
    public static void main(String[] args) {
        Genre<String> genre1 = new Genre<>("fantasy");
        Genre<String> genre2 = new Genre<>("history");
        Genre<String> genre3 = new Genre<>("science");


        Book book1 = new Book("Title1", genre1);
        Book book2 = new Book("Title2", genre2);
        Book book3 = new Book("Title3", genre3);

        Library library = new Library();
        library.addBookByGenre(book1);
        library.addBookByGenre(book2);
        library.addBookByGenre(book3);

        System.out.println(library);

        library.printLibrary();

    }
}
