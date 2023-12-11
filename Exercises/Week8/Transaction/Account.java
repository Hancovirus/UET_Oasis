import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    public Account() {
        balance = 0;
    }

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        balance += amount;
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        balance -= amount;
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
            Transaction temp = new Transaction(operation, amount, balance);
            transitionList.add(temp);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
            Transaction temp = new Transaction(operation, amount, balance);
            transitionList.add(temp);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public void printTransaction() {
        int i = 1;
        for (Transaction tran : transitionList) {
            if (tran.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.print("Giao dich " + i + ": Nap tien $");
                System.out.printf("%.2f", tran.getAmount());
                System.out.print(". So du luc nay: $");
                System.out.printf("%.2f", tran.getBalance());
                System.out.print(".\n");
            } else {
                System.out.print("Giao dich " + i + ": Rut tien $");
                System.out.printf("%.2f", tran.getAmount());
                System.out.print(". So du luc nay: $");
                System.out.printf("%.2f", tran.getBalance());
                System.out.print(".\n");
            }
            i++;
        }
    }
}
