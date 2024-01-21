package homeworks.homework4;

public class Task1 {
    String userName;
    int userAge;
    String userTown;

    public Task1(String userN, int userA, String userT) {
        this.userName = userN;
        this.userAge = userA;
        this.userTown = userT;
    }

    public void printUserInfo(){
        System.out.println("Инфомация о пользователе");
        System.out.println("Имя пользователя: " + userName);
        System.out.println("Возраст пользователя: " + userAge);
        System.out.println("Город пользователя: " + userTown);
    }

}
