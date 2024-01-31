package extraHomework.extraHomework2.task17;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Viktor","Savoniin",12030000);
        String ownerFirstName = bankAccount.getOwnerFirstName();
//        String ownerFirstName = bankAccount.ownerFirstName;
        String ownerLastName = bankAccount.getOwnerLastName(); // wrong str name. we will rewrite previous info
        int moneyAmount = bankAccount.getMoneyAmount(); // must be int, not str

        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);

    }
}
