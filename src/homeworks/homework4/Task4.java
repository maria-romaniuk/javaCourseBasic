package homeworks.homework4;

public class Task4 {
    int meteo1;
    int meteo2;
    int meteo3;
    int meteo4;
    int meteo5;
    int meteo6;
    int meteo7;
    int sum;
    int average;

    public Task4(int m1, int m2, int m3, int m4, int m5, int m6, int m7) {
        this.meteo1 = m1;
        this.meteo2 = m2;
        this.meteo3 = m3;
        this.meteo4 = m4;
        this.meteo5 = m5;
        this.meteo6 = m6;
        this.meteo7 = m7;
        this.sum = m1+m2+m3+m4+m5+m6+m7;
    }

    public void averagemethod(){
        average = sum /7;
        System.out.println("Средняя температура в Берлине составляет " + average);
    }
}
