package homeworks.homework21.encapsulation.task2;

//Создайте класс User, который инкапсулирует данные пользователя: логин, пароль и email. Обеспечьте безопасное
// изменение и доступ к этим полям через геттеры и сеттеры. Пароль должен изменяться только если старый пароль
// введен верно и новый пароль соответствует определенным требованиям безопасности.

public class User {

    private String login;
    private String password;
    private String email;

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
