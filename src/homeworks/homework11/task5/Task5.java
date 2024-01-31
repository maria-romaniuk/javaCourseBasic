package homeworks.homework11.task5;

import lessons.lesson6.scanner.UserInput;

public class Task5 {
    static UserInput ui= new UserInput();

    public static void main(String[] args) {
        int count = 0;
        int even = 0;
        int odd = 0;

        int number = ui.inputIntiger("Enter your number :");


        for (int i=0; i<=number; i++){

            while (i%2 ==0){
                even++;
            }
            while (i%2 == 1){
                odd++;
            }

//            if ((number%2) == 0){
//                even++;
////                System.out.print(i);
//            }else {
//                odd++;
//            }
        }
        System.out.println("even" + even);
        System.out.println("odd" + odd);


//        if ((number%2) == 0){
//            for (int i=0; i <= number; i++){
//                System.out.println(i);
//            }
//        } else{
//            for (int i=0; i<=number; i++){
//            }
//                System.out.println("notjing here");
//        }
    }
}
