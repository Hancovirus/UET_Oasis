import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList = new ArrayList<>();

    public Account() {}

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        this.balance += amount;
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public void doWithdrawing(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        } else if (amount > this.balance) {
            throw new InsufficientFundsException(amount);
        }
        this.balance -= amount;
    }

    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public String getTransactionHistory() {
        String history = "Lịch sử giao dịch của tài khoản " + this.accountNumber + ":";
        for (Transaction transaction : this.transactionList) {
            history += "\n- " + transaction.getTransactionSummary();
        }
        return history;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return this.accountNumber == account.accountNumber;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}
