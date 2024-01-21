package homeworks.homework2;

public class Homework1 {
    public static void main(String[] args) {
        //задача 2
        char xChar = 'B';
        char yChar = 'M';
        char zChar = 'W';
        System.out.println("Результат переменной char: " + xChar);
        System.out.println("Результат компляции трех переменых: " + (xChar + yChar + zChar));
        System.out.println("Результат компляции трех переменых: " + xChar + yChar + zChar);
        System.out.println();

        int xInt = 45;
        int yInt = 2;
        System.out.println("Переменная int: " + xInt);
        System.out.println("Результат сложения: " + xInt + yInt);
        System.out.println();

        byte xByte = 124;
        System.out.println("Переменная byte: " + xByte);
        System.out.println();


        double xDouble = 765.5;
        double yDouble = 145.2;
        double zDouble = 2.021;

        System.out.println("Переменная double: " + xDouble + ", " + "Переменная yDouble: " + yDouble);
        System.out.println("Результат более сложной формулы: " + (xDouble-yDouble)/zDouble);
        System.out.println();

        long xLong = 239872789;
        long yLong = 22038221;
        System.out.println("Переменная long: " + xLong);
        System.out.println("Результат остатка вычитания: " + xLong % yLong);
        System.out.println();


        double xResult = xDouble / yInt;
        System.out.println("Результат компиляции: " + xResult);
        System.out.println();


        // задача 3

        int varMart = 749;

        int varCount1 = varMart / 100;
        int varCount2 = (varMart - varCount1 * 100) /10;
        int varCont3 = varMart - varCount1 * 100 - varCount2 * 10;
        System.out.println("Вывод в консоль числа 749: " + varCount1 + "," + varCount2 + "," + varCont3);
    }
}
