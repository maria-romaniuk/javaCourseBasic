package homeworks.homework21.inheritance.task1;


//Создайте базовый класс Vehicle с общими свойствами и методами для транспортных средств. Затем создайте
// производные классы Car и Bicycle, расширяющие класс Vehicle, добавляя специфические свойства и методы
// (например, количество дверей для автомобиля).


public class Vehicle {
    private String producer;
    private String model;
    int year;

    public Vehicle(String producer, String model, int year) {
        this.producer = producer;
        this.model = model;
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void printInfo(){
        System.out.println("================");
        System.out.println("This " + getProducer()+ " " + getModel() + " made in " + getYear());
    }
}
