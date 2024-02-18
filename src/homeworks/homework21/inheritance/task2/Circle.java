package homeworks.homework21.inheritance.task2;

public class Circle extends Shape{
    private double radius;

    public Circle(String geometricFigure, double radius) {
        super(geometricFigure);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculatorArea() {
        return Math.PI * radius * radius;
    }
}
