package lessons.lesson5;

public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorClass myCalculator = new CalculatorClass();

        int sumResult = myCalculator.sum(23,43);
        System.out.println("Результат сложения: " + sumResult);

        int devisionResult= myCalculator.division(76,5);
        System.out.println("Результат деленя: " + devisionResult);

        int subResult = myCalculator.subtrac(9,1);
        System.out.println("Результат вычтания: " + subResult);

        int multiplResult = myCalculator.multipl(3,5);
        System.out.println("Результат умножения: " + multiplResult);


    }
}
