package extraHomework.task17;

public class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    public BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) { //public was missed
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount; // another name of variable and parameter's name
    }

    public String getOwnerFirstName() { //public missed and bracket not closed
        return ownerFirstName;
    }

    public String getOwnerLastName() { //public
        return ownerLastName;
    }

    public int getMoneyAmount() { //void can't return parameter
        return moneyAmount;
    }
}

