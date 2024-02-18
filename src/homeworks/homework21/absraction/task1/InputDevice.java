package homeworks.homework21.absraction.task1;


//Создайте абстрактный класс InputDevice, который включает абстрактные методы connect и disconnect, а также может
// содержать поля или неабстрактные методы, общие для всех устройств ввода. От этого абстрактного класса наследуйте
// классы Keyboard и Mouse, реализуя абстрактные методы.

abstract class InputDevice {
    private String model;
    private String type;

    public InputDevice(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    abstract void connect();
    abstract void disconnect();

    public void checkBattery(){
        System.out.println(getModel() + " - Full charged");

    }
}
