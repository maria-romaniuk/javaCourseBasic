package homeworks.homework4;

public class Task2 {

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int j;
    int k;
    int sum;
    int aver;
    int fraction;


    public Task2(int a, int b, int c, int d, int e, int f, int g, int h, int j, int k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
        this.k = k;
        this.sum = a+b+c+d+e+f+g+h+j+k;
    }

    public void mathMetod(){
        aver = sum / 10;
        fraction = sum % 10;
    }
    public void mathDataPrint(){
        System.out.println("Среднее арифметическое: " + aver);
        System.out.println("Дробная часть: " + fraction);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int h = 7;
        int j = 8;
        int k = 9;

        int sum = (a+b+c+d+e+f+g+h+j+k);
        int aver = sum / 10;
        int fraction = sum % 10;

        System.out.println("Среднее арифметическое: " + aver);
        System.out.println("Среднее арифметическое: " + fraction);

    }
}
