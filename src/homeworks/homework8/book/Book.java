package homeworks.homework8.book;

public class Book {

    private String authorName;
    private String bookName;
    private int pagesQuantity;
    private String catalogNumber;
    private String available;

    public Book(String authorName, String bookName, int pagesQuantity, String catalogNumber, String available) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.pagesQuantity = pagesQuantity;
        this.catalogNumber = catalogNumber;
        this.available = available;
    }

    public Book(String authorName, String bookName) {
        this.authorName = authorName;
        this.bookName = bookName;
    }

    public void BookInfo(int pagesQuantity, String catalogNumber, String available) {
        this.pagesQuantity = pagesQuantity;
        this.catalogNumber = catalogNumber;
        this.available = available;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public void setCatalogNumber(String catalogNumber) {
        this.catalogNumber = catalogNumber;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public void printFullBookInfo(){
        System.out.println("Author: " + authorName);
        System.out.println("Book: " + bookName);
        System.out.println("Pages: " + pagesQuantity);
        System.out.println("ID: " + catalogNumber);
        System.out.println("Available: " + available);
        System.out.println("======================");
    }
}
