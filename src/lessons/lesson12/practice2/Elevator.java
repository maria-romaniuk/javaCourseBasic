package lessons.lesson12.practice2;

import lessons.lesson6.scanner.UserInput;

public class Elevator {
    public static void main(String[] args) {
        UserInput ui = new UserInput();

        int up = 7;
        int down = 4;

        int currentFloor = 0;
        int iteration = 0;
        int finalFloor = ui.inputIntiger("Enter your number:");

        while (finalFloor >= currentFloor){
            iteration++;
            currentFloor+=up;
            if(currentFloor<finalFloor){
                currentFloor -= down;
            }
        }
            System.out.println(iteration);

    }

}
