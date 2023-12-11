import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {

    private List<Customer> customerList = new ArrayList<>();

    /**
     * Hello, I am a JavaDoc.
     */
    public void readCustomerList(InputStream inputStream) {
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        try {
            while ((line = br.readLine()) != null) {
                if (!line.contains(Account.CHECKING) && !line.contains(Account.SAVINGS)) {
                    int lastIndx = line.lastIndexOf(" ");
                    String name = line.substring(0, lastIndx);
                    Long id = Long.parseLong(line.substring(lastIndx + 1));
                    Customer c = new Customer(id, name);
                    customerList.add(c);
                } else {
                    Customer c = customerList.get(customerList.size() - 1);
                    if (line.contains(Account.SAVINGS)) {
                        int index = line.indexOf(" ");
                        Long accNum =  Long.parseLong(line.substring(0, index));
                        index = line.lastIndexOf(" ");
                        Double amount = Double.parseDouble(line.substring(index + 1));
                        c.addAccount(new SavingsAccount(accNum, amount));
                    } else {
                        int index = line.indexOf(" ");
                        Long accNum =  Long.parseLong(line.substring(0, index));
                        index = line.lastIndexOf(" ");
                        Double amount = Double.parseDouble(line.substring(index + 1));
                        c.addAccount(new CheckingAccount(accNum, amount));
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public String getCustomersInfoByIdOrder() {
        List<Customer> customerList = this.customerList;
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return Long.compare(o1.getIdNumber(), o2.getIdNumber());
            }
        });
        String info = "";
        for (int i = 0; i < customerList.size(); i++) {
            if (i == customerList.size() - 1) {
                info += customerList.get(i).getCustomerInfo();
            } else {
                info += customerList.get(i).getCustomerInfo() + "\n";
            }
        }
        return info;
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public String getCustomersInfoByNameOrder() {
        List<Customer> customerList = this.customerList;
        Collections.sort(customerList, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getFullName().compareTo(o2.getFullName());
            }
        });
        String info = "";
        for (int i = 0; i < customerList.size(); i++) {
            if (i == customerList.size() - 1) {
                info += customerList.get(i).getCustomerInfo();
            } else {
                info += customerList.get(i).getCustomerInfo() + "\n";
            }
        }
        return info;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }
}