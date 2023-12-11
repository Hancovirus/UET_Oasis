import java.util.ArrayList;
import java.util.List;

public class Customer {
    
    private long idNumber;
    private String fullName;
    private List<Account> accountList = new ArrayList<>();

    public Customer() {
        
    }

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public String getCustomerInfo() {
        String info = "Số CMND: " + idNumber + ". ";
        info += "Họ tên: " + fullName + ".";
        return info;
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public void addAccount(Account account) {
        for (Account a : accountList) {
            if (account.equals(a)) {
                return;
            }
        }
        accountList.add(account);
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public void removeAccount(Account account) {
        for (Account a : accountList) {
            if (account.equals(a)) {
                accountList.remove(a);
                break;
            }
        }
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Account> getAccountList() {
        return accountList;
    }
}
