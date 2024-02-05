package homeworks.homework06.task3;

public class Pizza {

    public static void main(String[] args) {
//
//        int firstDiameter =24;
//        int secondDiameter = 28;
//        int caloriesCm = 40;
//
//        double extra = caloriesCm * Math.PI * (firstDiameter * firstDiameter) /4;
//        double extra2 = caloriesCm * Math.PI * (secondDiameter * secondDiameter) /4;
//
//        double extraCalories = extra2 - extra;
//
//        System.out.println(extra);
//        System.out.println(extra2);
//        System.out.println(extraCalories);

        PizzaCounterMethod pizzas = new PizzaCounterMethod();

        pizzas.setFirstDiameter(24);
        pizzas.setSecondDiameter(28);

        pizzas.extraCalories();

        System.out.println("You have more " + pizzas.extraCalories() + " calories");
    }
}
