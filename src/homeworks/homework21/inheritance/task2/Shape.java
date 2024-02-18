package homeworks.homework21.inheritance.task2;


//Определите абстрактный класс Shape с методом для вычисления площади. Создайте классы Circle,
// Rectangle и Triangle, наследующие Shape и реализующие метод вычисления площади в соответствии
// с формой каждой фигуры.


abstract class Shape {
    private String geometricFigure;

    public Shape(String geometricFigure) {
        this.geometricFigure = geometricFigure;
    }

    public String getGeometricFigure() {
        return geometricFigure;
    }

    abstract double calculatorArea();
}
