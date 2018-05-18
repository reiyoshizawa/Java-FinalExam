package CodeStepByStep;

import java.math.BigDecimal;

public class BankAccountToString {   // BankAccount template for CodeStepByStep

    public static void main(String[] args) {
        BankAccountTransfer ben = new BankAccountTransfer("Benson");
        ben.deposit(90.00);
        BankAccountTransfer mar = new BankAccountTransfer("Marty");
        mar.deposit(25.00);

        ben.transfer(mar,20.00);
        ben.transfer(mar,20.00);
        System.out.println(ben.getBalance());
        System.out.println(mar.getBalance());


    }

    private String id = "";
    private String name = "";
    private double balance = 0.00;
    private boolean allowNegativeBalance = false;
    private int transactions = 0;
    private String transactionText = "";

    public BankAccountToString() {
    }

    public BankAccountToString(String id) {
        this.id = id;
        this.name = id;
    }

    public BankAccountToString(String id, double balance) {
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


    public String toString() {
        double absBalance = Math.abs(balance);
        String balanceStr = String.valueOf(absBalance);
        BigDecimal bd = new BigDecimal(balanceStr);
        BigDecimal bd2 = bd.setScale(2, BigDecimal.ROUND_DOWN);

        if ( 0 < balance) {
            return name + ", $" + balance;
        } else if (balance == 0.00) {
            return name + ", $" + bd2;
        } else {
            return name + ", -$" + bd2;
        }
    }

}

