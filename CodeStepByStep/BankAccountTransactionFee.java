package CodeStepByStep;

public class BankAccountTransactionFee  {   // BankAccount template for CodeStepByStep

//    public static void main(String[] args) {
//        BankAccountTransactionFee savings = new BankAccountTransactionFee("Jimmy");
//
//        savings.deposit(10.00);
//        savings.deposit(50.00);
//        savings.deposit(10.00);
//        savings.deposit(70.00);
//
//        System.out.println(savings.getBalance());
//        System.out.println(savings.transactions);
//
//    }

    private String id = "";
    private String name = "";
    private double balance = 0.00;
    private boolean allowNegativeBalance = false;
    private int transactions = 0;
    private String transactionText = "";

    public BankAccountTransactionFee() {
    }

    public BankAccountTransactionFee(String id) {
        this.id = id;
        this.name = id;
    }

    public BankAccountTransactionFee(String id, double balance) {
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

    public boolean transactionFee(double fee) {
        if (balance <= 0) {
            return false;
        } else {
            for (int i = 1; i <= transactions; i++) {
                this.balance -= fee * i;
                if (balance <= 0){
                    this.balance = 0;
                    return false;
                }
            }
            return true;
        }
    }

}