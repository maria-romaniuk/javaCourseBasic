package homeworks.homework04;


//Задача 5. Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?
//
// Покажите это на конкретных примерах.
public class Task5 {
    int num;
    int divis2;
    int divis3;

    public Task5(int num) {
        this.num = num;
    }

    public void division2Method(){
        divis2=num % 2;
        System.out.println("Число: " + num);
        System.out.println("Остатка от деления на 2: " + divis2);
    }
    public void division3Method(){
        divis3 = num % 3;
        System.out.println("Остатка от деления на 3: " + divis3);
    }
}
