package homeworks.homework06.task3;

//Напишите программу, которая вычисляет, сколько лишних калорий будет, если вместо пиццы диаметром 24 см вы купите
// пиццу диаметром 28 см. Чтобы решить эту проблему, предположим, что каждый квадратный сантиметр пиццы содержит 40 калорий.



public class PizzaCounterMethod {
    int firstDiameter;
    int secondDiameter;
    int caloriesCm = 40;

    public int getFirstDiameter() {
        return firstDiameter;
    }

    public void setFirstDiameter(int firstDiameter) {
        this.firstDiameter = firstDiameter;
    }

    public int getSecondDiameter() {
        return secondDiameter;
    }

    public void setSecondDiameter(int secondDiameter) {
        this.secondDiameter = secondDiameter;
    }

    double extraCalories;

   public double extraCalories(){

       double caloriesFist = caloriesCm * Math.PI * (firstDiameter * firstDiameter)/4;
       double caloriesSecond = caloriesCm * Math.PI * (secondDiameter * secondDiameter)/4;

       extraCalories = caloriesSecond - caloriesFist;
       return extraCalories;

    }
}
