package homeworks.homework21.absraction.task1;

public class Keyboard extends InputDevice{
    private int buttonsQuantity;

    public Keyboard(String model, String type, int buttonsQuantity) {
        super(model, type);
        this.buttonsQuantity = buttonsQuantity;
    }

    public int getButtonsQuantity() {
        return buttonsQuantity;
    }

    @Override
    void connect() {
        System.out.println("Your device " + getModel()+" is connected with " + getType());
    }

    @Override
    void disconnect() {
        System.out.println("Your device is disconnected with " + getType());
    }
}
