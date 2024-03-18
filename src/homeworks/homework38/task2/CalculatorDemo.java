package homeworks.homework38.task2;

public class CalculatorDemo {
    public static void main(String[] args) {
//        SumCalculator<Integer> calculator = (a, b) -> a + b;
        SumCalculator<Integer> calculator = Integer::sum;


        int sum = calculator.calculateSum(4, 23);

        System.out.println(sum);
    }
}
