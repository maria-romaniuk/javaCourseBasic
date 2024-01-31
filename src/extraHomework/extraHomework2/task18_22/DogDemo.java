package extraHomework.extraHomework2.task18_22;

public class DogDemo {
    public static void main(String[] args) {
       Dog myDog = new Dog("Loki", 4, "gold");
        myDog.voice();
        System.out.println("=======================");

        Dog mySecondDog = new Dog("Manson",10, "white");
        mySecondDog.voice();
        mySecondDog.dogAge = mySecondDog.dogAge + 1;
        mySecondDog.voice();

        mySecondDog.changeColor("black");

    }
}
