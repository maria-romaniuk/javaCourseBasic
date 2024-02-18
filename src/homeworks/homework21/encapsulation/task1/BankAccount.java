package homeworks.homework21.encapsulation.task1;

import lessons.lesson6.scanner.UserInput;

//Создайте класс BankAccount, который инкапсулирует баланс счета. Баланс не должен быть доступен для прямого изменения
// извне, а изменяться только с помощью методов deposit (для внесения средств) и withdraw (для снятия средств).


public class BankAccount {

    private String name;
    private int balance;


    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int deposit(){
       UserInput ui = new UserInput();

       int sum= ui.inputIntiger("Enter your sum: ");
       balance = getBalance() + sum;

        return balance;
    }

    public int withdraw(){
        UserInput ui = new UserInput();
        int sum = ui.inputIntiger("How much would you like to withdraw?");
        if (sum <= balance){
            balance = getBalance() - sum;
            return balance;
        } else{
            System.out.println("Sorry, the amount is greater than available. please enter new sum");
            System.out.println("your balance is: " + getBalance());
            return withdraw();
        }
    }
}
