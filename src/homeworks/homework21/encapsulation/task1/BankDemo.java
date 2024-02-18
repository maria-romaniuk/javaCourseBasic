package homeworks.homework21.encapsulation.task1;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Maria", 250);

        BankAccount bankAccount1 = new BankAccount("Mark", 3190);

        System.out.println("balance:" + bankAccount.getBalance());

        bankAccount.deposit();
        System.out.println("balance after deposit: " + bankAccount.getBalance());


        bankAccount.withdraw();
        System.out.println("balance after withdraw: " + bankAccount.getBalance());
    }
}
