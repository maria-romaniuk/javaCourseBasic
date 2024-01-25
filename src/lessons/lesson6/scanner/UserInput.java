package lessons.lesson6.scanner;

import java.util.Scanner;

public class UserInput {
    public String inputText(String message){
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        String inputText = scanner.nextLine();
        return inputText;
    }

    public int inputIntiger(){
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        return inputInt;
    }

    public double inputDouble(String messege){
        Scanner scanner = new Scanner(System.in);
        System.out.println(messege);
        double inputDouble = scanner.nextDouble();
        return inputDouble;
    }


}
