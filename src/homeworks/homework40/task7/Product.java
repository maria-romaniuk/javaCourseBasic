package homeworks.homework40.task7;

//Дана коллекция Product - название, категория, цена, количество на складе.
// Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение
// и отсортировать по убыванию цены


public class Product {
    private String name;
    private String category;
    private double price;
    private int quantityInStock;

    public Product(String name, String category, double price, int quantityInStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}
