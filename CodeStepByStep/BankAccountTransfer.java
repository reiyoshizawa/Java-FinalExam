package CodeStepByStep;

public class BankAccountTransfer {   // BankAccount template for CodeStepByStep

    public static void main(String[] args) {
        BankAccountTransfer ben = new BankAccountTransfer("Benson");
        ben.deposit(90.00);
        BankAccountTransfer mar = new BankAccountTransfer("Marty");
        mar.deposit(25.00);

        ben.transfer(mar,20.00);
        ben.transfer(mar,10.00);
        ben.transfer(mar,-1);
        mar.transfer(ben,39.00);
        mar.transfer(ben,50.00);
        mar.transfer(ben,1.00);
        ben.transfer(mar,88.00);
        ben.transfer(mar,1.00);
    }

    private String id = "";
    private String name = "";
    private double balance = 0.00;
    private boolean allowNegativeBalance = false;
    private int transactions = 0;
    private String transactionText = "";

    public BankAccountTransfer() {
    }

    public BankAccountTransfer(String id) {
        this.id = id;
        this.name = id;
    }

    public BankAccountTransfer(String id, double balance) {
        this.id = id;
        this.name = id;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTransactionCount() {
        return transactions;
    }

    public String getTransactions() {
        return transactionText;
    }

    public void deposit(double amount) {
        if (0 <= amount) {
            balance += amount;
            transactionText += "deposit of $" + amount + "\n";
        }
        transactions++;
    }

    public void setAllowNegativeBalance(boolean allowNegativeBalance) {
        this.allowNegativeBalance = allowNegativeBalance;
    }

    public void setBalance(double balance) {
        if (balance >= 0 || allowNegativeBalance) {
            this.balance = balance;
        }
    }

    public void withdraw(double amount) {
        if (allowNegativeBalance || balance >= amount) {
            balance -= amount;
            transactionText += "withdrawal of $" + amount + "\n";
        }
        transactions++;
    }

    public String __toString() {
        return id;
    }

    public void transfer(BankAccountTransfer secondPerson ,double amountMoney) {

        if (amountMoney <= 0) {
            System.out.println("no effect; negative amount");
        } else if (this.balance == 0) {
            System.out.println("no effect; no money in amount");
        } else if (this.balance < 5) {
            System.out.println("no effect; can't afford fee");
        } else if (this.balance < amountMoney) {
            // amount 50
            // mar 11, ben 89

            // ben += 11 - 5 = 6
            // ben 89 + 6 = 95
            secondPerson.balance += this.balance - 5.00;

            // mar -= 11
            // mar 11 - 5 + 6 = 0
            this.balance -= 5.00 + (this.balance - 5.00);

            this.transactions += 1;
            secondPerson.transactions += 1;
        } else {
            this.balance -= amountMoney + 5.00;
            secondPerson.balance += amountMoney;
            long lose = Math.round(amountMoney + 5.00);
            long gain = Math.round(amountMoney);
            System.out.println( this.name + " loses $" +  lose +
                    ", " + secondPerson.name + " gains $" + gain);
            this.transactions += 1;
            secondPerson.transactions += 1;
        }

    }

}