package homeworks.homework40.task7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Store {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Macbook Air", "Laptop", 1229.99, 320));
        products.add(new Product("Macbook Pro", "Laptop", 2100.0, 400));
        products.add(new Product("Toshiba 2300", "Laptop", 499.99, 430));
        products.add(new Product("Lenovo s8", "Laptop", 870.5, 500));
        products.add(new Product("Iphone13 ", "Cellphone", 780.0, 100));
        products.add(new Product("Iphone15", "Cellphone", 1450.10, 150));
        products.add(new Product("Samsung Galaxy", "Cellphone", 1200.0, 230));
        products.add(new Product("Huawei SVR-900", "Cellphone", 543.99, 400));


        // Найти среднюю цену продуктов каждой категории, у которых количество превышает заданное значение
        Map<String, Double> averagePricesInCategory = products.stream()
                .filter(product -> product.getQuantityInStock() > 150)
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)));

        averagePricesInCategory.forEach((category, averagePrice) ->
                System.out.println("Category: " + category + " = Average Price: " + averagePrice));


        //отсортировать по убыванию цены
        Map<String, Double> sortedByPriceDescending = averagePricesInCategory.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        sortedByPriceDescending.forEach((category, averagePrice) ->
                System.out.println("Category: " + category + " sort by descending price = Average Price: " + averagePrice));
    }


}
