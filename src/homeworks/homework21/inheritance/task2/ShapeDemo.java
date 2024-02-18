package homeworks.homework21.inheritance.task2;

public class ShapeDemo {
    public static void main(String[] args) {

        Circle circle = new Circle("Circle", 13);
        Rectangle rectangle = new Rectangle("Rectangle", 7,5);
        Triangle triangle = new Triangle("Triangle", 23,18);


        circle.calculatorArea();
        rectangle.calculatorArea();
        triangle.calculatorArea();

        System.out.println("circle " + circle.calculatorArea());
        System.out.println("rectangle " + rectangle.calculatorArea());
        System.out.println("triangle " + triangle.calculatorArea() );


    }
}
