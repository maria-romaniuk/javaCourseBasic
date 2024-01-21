package homeworks.homework4;

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
