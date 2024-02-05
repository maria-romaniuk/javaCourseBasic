package homeworks.homework04;

//Задача 3. Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб. Если клиент покупает товары
// вместе, то на них действует скидка 100 руб на всю покупку.
// Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму
// скидки от этой покупки.


public class Task3 {
    int price1;
    int price2;
    int sum;
    int sumWithSale;
    int sumSale;

    public Task3(int p1, int p2) {
        this.price1 = p1;
        this.price2 = p2;
        this.sum = p1+p2;
    }
    public void sale(){
        sumWithSale = sum - 100;
        System.out.println("Сумма со скидкой: " + sumWithSale);
    }

    public void saleSum(){
        sumSale = sum - sumWithSale;
        System.out.println("Сумма cкидки: " + sumSale);
    }

}
