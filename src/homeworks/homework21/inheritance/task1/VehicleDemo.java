package homeworks.homework21.inheritance.task1;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "GT535", 2015, 280);
        Car car2 = new Car("Citroen", "C4", 2022, 260);

        Bicycle bike1 = new Bicycle("Decathlon", "BB23", 2012, "City" );
        Bicycle bike2 = new Bicycle("Trek", "WW45", 2023, "Sport" );
        Bicycle bike3 = new Bicycle("Merida", "CV22", 2012, "Fix" );


        car1.printInfo();

        car2.printInfo();

        bike1.printInfo();
    }
}
