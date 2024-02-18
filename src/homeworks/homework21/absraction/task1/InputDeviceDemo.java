package homeworks.homework21.absraction.task1;

public class InputDeviceDemo {
    public static void main(String[] args) {

        Mouse mouse = new Mouse("LogiLink", "Bluetooth", "black");
        Keyboard keyboard = new Keyboard("Apple magic", "USB", 79);

        mouse.connect();
        keyboard.connect();

        mouse.disconnect();
        keyboard.disconnect();
    }
}
