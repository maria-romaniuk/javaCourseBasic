package homeworks.homework41.task3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Product> productsList1 = new ArrayList<>();
        productsList1.add(new Product("milk", 1.15));
        productsList1.add(new Product("fish", 12.75));
        productsList1.add(new Product("oil", 5.1));
        productsList1.add(new Product("melon", 2.59));
        productsList1.add(new Product("chia", 1.86));
        productsList1.add(new Product("home-plants", 23.56));

        List<Product> productsList2 = new ArrayList<>();
        productsList2.add(new Product("lemon", 0.78));
        productsList2.add(new Product("mussels", 4.45));
        productsList2.add(new Product("rice", 2.25));
        productsList2.add(new Product("bananas", 3.20));
        productsList2.add(new Product("kohlrabi", 3.06));

        List<Product> productsList3 = new ArrayList<>();
        productsList3.add(new Product("apple", 3.13));
        productsList3.add(new Product("seafood", 14.45));
        productsList3.add(new Product("salat", 1.85));
        productsList3.add(new Product("potato", 5.20));
        productsList3.add(new Product("avocado", 4.0));
        productsList3.add(new Product("grill", 45.0));

        List<Product> productsList4 = new ArrayList<>();
        productsList4.add(new Product("ananas", 2.42));
        productsList4.add(new Product("asian food", 34.45));
        productsList4.add(new Product("avocado", 3.0));
        productsList4.add(new Product("pepper", 1.20));
        productsList4.add(new Product("salat", 3.3));
        productsList4.add(new Product("build", 145.0));


        LocalDate date1 = LocalDate.of(2023, 3, 15); // Заказ на 15 марта 2023 года
        LocalDate date2 = LocalDate.of(2023, 2, 20);
        LocalDate date3 = LocalDate.of(2023, 3, 2);




        List<Order> orders = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();

        orders.add(new Order(productsList1,currentDate));
        orders.add(new Order(productsList2,date1));
        orders.add(new Order(productsList3,date2));
        orders.add(new Order(productsList4,date3));


        //для проверки суммы в месяц
        double monthAmount = orders.stream()
                .filter(order -> new HashSet<>(order.getProducts()).containsAll(productsList1)) //преобразует список во множество, удаляя все дубликаты и
                                                                                                // упорядочивая элементы (если это возможно). containsAll(), сравнение двух множеств
                                                                                                // выполняется намного быстрее, чем сравнение каждого элемента отдельно
                //  .filter(order -> order.getProducts().containsAll(productsList1))
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println(monthAmount);


        double totalAmount = orders.stream()
                .filter(order -> order.getOrderDate().getMonth() == currentDate.getMonth())
                .flatMap(order -> order.getProducts().stream())//. Метод getPurchases() возвращает список покупок для каждого заказа.
                                                                // flatMap() используется здесь, потому что список покупок может содержать несколько элементов,
                                                                //  и мы хотим преобразовать каждый список в отдельный поток элементов.
                .mapToDouble(Product::getPrice) //mapToDouble() используется для преобразования элементов потока в тип double.
                .sum();

        System.out.println("Total amount this month " + totalAmount);
    }


}
