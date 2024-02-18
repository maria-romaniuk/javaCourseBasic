package homeworks.homework21.inheritance.task2;

public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(String geometricFigure, double a, double b) {
        super(geometricFigure);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    double calculatorArea() {
        return a * b;
    }
}
