package extraHomework.extraHomework2.task2;

import lessons.lesson6.scanner.UserInput;

public class UserInfo {

    public void userInfo(){
        UserInput user = new UserInput();

        String userName = user.inputText("Enter your Name");
        System.out.println("Hello " + userName + "!");
    }
}
