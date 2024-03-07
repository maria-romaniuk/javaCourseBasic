package lessons.lesson37;


// **Задача на работу с коллекциями и generics:**
//   - **Задание:** Создайте класс `Library`, который хранит книги разных жанров. Используйте Generics для создания
//   типобезопасной библиотеки, где можно хранить книги различных жанров в соответствующих коллекциях.

//   - **Детали реализации:** Класс `Book` имеет поля `String title` и `String genre`. Класс `Library` должен содержать
//   метод `addBook(Book book)`, который добавляет книгу в соответствующую коллекцию по жанру. Также необходим метод
//   `List<Book> getBooksByGenre(String genre)`, который возвращает список книг заданного жанра.



//2. **Задача на использование Optional:**
//   - **Задание:** Реализуйте метод в классе `Library` из предыдущей задачи, который ищет книгу по названию и
//   возвращает объект `Optional<Book>`. Если книга найдена, возвращается `Optional` с книгой, в противном случае
//   — пустой `Optional`.
//   - **Детали реализации:** Метод `Optional<Book> findBookByTitle(String title)` должен перебирать все книги в
//   библиотеке и возвращать `Optional.of(book)`, если книга с таким названием есть, или `Optional.empty()`,
//   если такой книги нет.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library  {


    private Map<Genre, List<Book>> booksByGenre;

    public Library() {
        this.booksByGenre = new HashMap<>();
    }


    public void addBookByGenre(Book book) {
        Genre genre = book.getGenre();
        if (!booksByGenre.containsKey(genre)) {
            booksByGenre.put(genre, new ArrayList<>());
        }
        booksByGenre.get(genre).add(book);


//        if (booksByGenre.containsKey(genre)){
//            booksByGenre.get(genre).add(book);
//        } else{
//            booksByGenre.put(genre, new ArrayList<>());
//        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "booksByGenre=" + booksByGenre +
                '}';
    }

    public void printLibrary(){
        for (Map.Entry< Genre, List<Book>> entry: booksByGenre.entrySet()){
            System.out.println(entry.getKey()) ;

        }

    }
}
