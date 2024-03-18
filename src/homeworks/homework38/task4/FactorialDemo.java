package homeworks.homework38.task4;

//Напишите функциональный интерфейс для вычисления факториала числа.
public class FactorialDemo {
    public static void main(String[] args) {
        Factorial<Integer> factorialCalculator = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        int number = 5;
        int factorial = factorialCalculator.calculate(number);
        System.out.println("Factorial " + number + " = " + factorial);

    };
}
