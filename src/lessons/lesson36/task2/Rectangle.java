package lessons.lesson36.task2;

public class Rectangle <T extends Number, U extends Number> implements Figure {

    private T sideX;
    private U sideY;

    public Rectangle(T sideX, U sideY) {
        this.sideX = sideX;
        this.sideY = sideY;
    }

    public T getSideX() {
        return sideX;
    }

    public U getSideY() {
        return sideY;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideX=" + sideX +
                ", sideY=" + sideY +
                '}';
    }

    @Override
    public double calculatorArea() {
        return sideX.doubleValue() * sideY.doubleValue();
    }
}
