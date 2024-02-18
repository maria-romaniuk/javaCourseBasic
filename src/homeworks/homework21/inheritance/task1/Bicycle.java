package homeworks.homework21.inheritance.task1;

public class Bicycle extends Vehicle{

    private String type;

    public Bicycle(String producer, String model, int year, String type) {
        super(producer, model, year);
        this.type = type;
    }
}
