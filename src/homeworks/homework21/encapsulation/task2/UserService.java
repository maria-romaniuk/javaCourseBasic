package homeworks.homework21.encapsulation.task2;

// Пароль должен изменяться только если старый пароль
// введен верно и новый пароль соответствует определенным требованиям безопасности.

import lessons.lesson6.scanner.UserInput;

public class UserService {
    private User user;

    public User getUser() {
        return user;
    }

    public void printUserInfo(User user){
        System.out.println("E-mail: " + user.getEmail());
        System.out.println("Login: " + user.getLogin());
        System.out.println("Password: " + user.getPassword());
    }

    public void changePassword(User user){
        UserInput ui = new UserInput();
        String checkPassword = ui.inputText("You want to change the password. Enter your old password");
        if (checkPassword.equals(user.getPassword())){
            String newPassword = ui.inputText("Enter you new password: ");
            if (newPassword.length() >= 8 && newPassword.contains("!")){
                user.setPassword(newPassword);
                System.out.println("Your password was changed");
            }

        } else{
            System.out.println("Sorry, you entered wrong password");
        }

    }
}
