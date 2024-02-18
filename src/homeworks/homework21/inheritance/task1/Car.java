package homeworks.homework21.inheritance.task1;

public class Car extends Vehicle {
    private int speedLimit;

    public Car(String producer, String model, int year, int speedLimit) {
        super(producer, model, year);
        this.speedLimit = speedLimit;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("with maximum movement speed " + getSpeedLimit());
    }
}
