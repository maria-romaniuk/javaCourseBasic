package lessons.lesson36.task2;

public class FigureDemo {
    public static void main(String[] args) {
        Circle<Integer> circle1 = new Circle<>(12);
        System.out.println("Circle integer " + circle1.calculatorArea());


        Circle<Double> circle2 = new Circle<>(3.323);
        System.out.println("Circle double " + circle2.calculatorArea());


        Rectangle<Integer, Integer> rectangle1 = new Rectangle<>(2,5);
        System.out.println("Rectangle integer " + rectangle1.calculatorArea());


        Rectangle<Double, Double> rectangle2 = new Rectangle<>(7.31,59.28);
        System.out.println("Rectangle double " + rectangle2.calculatorArea());


        Rectangle<Float, Float> rectangle3 = new Rectangle<>(5.99f,1.43f);
        System.out.println("Rectangle Float " + rectangle3.calculatorArea());
    }
}
