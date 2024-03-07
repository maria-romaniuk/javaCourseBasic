package lessons.lesson36.task2;

public class Circle <R extends Number> implements Figure{

    private R radius;

    public Circle(R radius) {
        this.radius = radius;
    }

    public R getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double calculatorArea() {
        return Math.PI * (radius.doubleValue() * radius.doubleValue());
    }
}
