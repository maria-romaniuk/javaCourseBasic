package homeworks.homework14.task5;


import java.util.Arrays;

public class PenDemo {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        Pen [] colorArray = new Pen[3];
        colorArray = new Pen[]{pen1, pen2, pen3};
        pen1.setColor("Green");
        pen2.setColor("Black");
        pen3.setColor("Red");
        System.out.println(Arrays.toString(colorArray));
    }
}
