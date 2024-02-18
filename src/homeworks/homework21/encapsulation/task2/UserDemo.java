package homeworks.homework21.encapsulation.task2;

public class UserDemo {
    public static void main(String[] args) {
        UserService service = new UserService();

        User user1 = new User("mavka","qwerty1","email@gmail.com");
        User user2 = new User("king","12345!","newemail@gmail.com");

        service.printUserInfo(user1);

        service.changePassword(user1);
        service.printUserInfo(user1);
    }
}
