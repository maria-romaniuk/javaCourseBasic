package homeworks.homework41.task3;

//Задача 3: Преобразование списка объектов и агрегация
//
//Задание: Дан список объектов заказов (Order), где каждый заказ содержит список покупок (List) и дату заказа.
// Каждая покупка содержит название товара и его стоимость. Необходимо рассчитать общую сумму стоимости всех покупок, сделанных в текущем месяце.

import java.time.LocalDate;
import java.util.List;

public class Order {
    private List<Product> products;
    private LocalDate orderDate;

    public Order(List<Product> products, LocalDate orderDate) {
        this.products = products;
        this.orderDate = orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", orderDate=" + orderDate +
                '}';
    }
}
