package homeworks.homework04;

public class Homework4 {
    public static void main(String[] args) {
        //task 1
        Task1 myFirstUser = new Task1("Maria", 33, "Berlin");

        myFirstUser.printUserInfo();
        System.out.println("==================");

        //task2

        Task2 myMath = new Task2(0,1,2,3,4,5,6,7,8,9);
        myMath.mathMetod();
        myMath.mathDataPrint();
        System.out.println("==================");

        //task 3

        Task3 myFistSale = new Task3(850,400);
        myFistSale.sale();
        myFistSale.saleSum();
        System.out.println("==================");

        //task 4

        Task4 myMeteo = new Task4(2,0,2,1,2,2,5);
        myMeteo.averagemethod();
        System.out.println("==================");

        //task 5
        Task5 myNum = new Task5(43);
        myNum.division2Method();
        myNum.division3Method();

        Task5 myNum2 = new Task5(12);
        myNum2.division2Method();
        myNum2.division3Method();

        Task5 myNum3 = new Task5(899);
        myNum3.division2Method();
        myNum3.division3Method();
    }

}
