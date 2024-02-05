package homeworks.homework14.task5;

//Создайте класс ручка (Pen) a. Определите свойство color типа String с доступом private
// b. Создайте методы getColor(); setColor(String newColor);
//Создайте класс PenDemo (метод main)
//Создайте три объекта типа Pen
//Создайте массив L = 3
//Сохраните все объекты в массив
//Достаньте поочередно из массива ручки и измените цвет каждой на a. “Green” b. “Red” c. “Black”
//Распечатайте цвета ручек из массива


public class Pen {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                '}';
    }
}
