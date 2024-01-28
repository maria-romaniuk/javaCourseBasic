package homeworks.homework9.task5;

import lessons.lesson6.scanner.UserInput;

public class Task5 {

    private static UserInput ui = new UserInput();
    public static void main(String[] args) {
        String numSrt = ui.inputText("Enter your 4 numbers: ");


        int y = Integer.parseInt(numSrt);
        int num1 = y / 1000;
        int num2 = (y - num1 * 1000) / 100;
        int num3 = (y - (num1 * 1000) - (num2 * 100)) / 10;
        int num4 = y - num1 * 1000 - num2 * 100 - num3 * 10;

//        System.out.println(numSrt.length());

        if (numSrt.length() == 4){
            if((num1 + num2) == (num3 + num4)){
                System.out.println("Congratulations! It's the lucky ticket");
            } else{
                System.out.println("Sorry. Next time");
            }
        } else {
            System.out.println("Sorry. Your ticket must have 4 numbers. Try again");
        }

    }
}
