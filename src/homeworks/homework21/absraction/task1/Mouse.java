package homeworks.homework21.absraction.task1;

public class Mouse extends InputDevice{
    private String color;

    public Mouse(String model, String type, String color) {
        super(model, type);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    void connect() {
        System.out.println("Your "+ getColor()+" mouse " + getModel() + " connected");
    }

    @Override
    void disconnect() {
        System.out.println("Your "+ getColor()+" mouse " + getModel() + " disconnected");
    }
}
