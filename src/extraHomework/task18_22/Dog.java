package extraHomework.task18_22;

public class Dog {
    private final String dogName;

    int dogAge;

    String dogColor;

    public Dog(String dogName, int age, String color) {
        this.dogName = dogName;
        this.dogAge = age;
        this.dogColor = color;
    }

    public void voice() {
        System.out.println(dogName + " " + dogName + " " + dogName);
        System.out.println("I'm " + dogAge + " years old!");
    }

    public void changeColor(String newColor){
        System.out.println("Usually I have " + dogColor + " coat");
        System.out.println("But after rain I'm " + newColor);
    }


}
