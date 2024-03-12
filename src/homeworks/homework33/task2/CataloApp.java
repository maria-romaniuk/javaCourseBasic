package homeworks.homework33.task2;

public class CataloApp {
    public static void main(String[] args) {

        Product product1= new Product("LG TV-700", 1700.0);
        Product product2= new Product("PlayStation 5", 500.5);
        Product product3= new Product("PlayStation 4", 300.2);
        Product product4= new Product("LG TV-120Rt", 2999.99);
        Product product5= new Product("X-Box 3", 100.23);
        Product product6= new Product("Huawei TV-44BB02", 1340.8);
        Product product7= new Product("LG OLED-12", 4505.0);


        ProductCatalog catalog = new ProductCatalog();

        catalog.addProduct(1,product1);
        catalog.addProduct(2,product2);
        catalog.addProduct(3,product3);
        catalog.addProduct(4,product4);
        catalog.addProduct(5,product5);
        catalog.addProduct(6,product6);
        catalog.addProduct(7,product7);

        catalog.printCatalog();

        catalog.deleteProduct(5);
        catalog.printCatalog();

        catalog.findById(5);


    }
}
