public class Transaction {
    public static final int TYPE_DEPOSIT_CHECKING = 11;
    public static final int TYPE_WITHDRAW_CHECKING = 12;
    public static final int TYPE_DEPOSIT_SAVINGS = 21;
    public static final int TYPE_WITHDRAW_SAVINGS = 22;

    private int type;
    private double amount;
    private double initialBalance;
    private double finalBalance;

    /**
     * Hello, I am a JavaDoc.
     */
    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    private String getTransactionTypeString() {
        switch (type) {
            case TYPE_DEPOSIT_CHECKING:
                return "Nạp tiền vãng lai";
            case TYPE_WITHDRAW_CHECKING:
                return "Rút tiền vãng lai";
            case TYPE_DEPOSIT_SAVINGS:
                return "Nạp tiền tiết kiệm";
            case TYPE_WITHDRAW_SAVINGS:
                return "Rút tiền tiết kiệm";
            default:
                return "Unknown";
        }
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public String getTransactionSummary() {
        String summary = "Kiểu giao dịch: ";
        summary += getTransactionTypeString() + ". ";
        summary += "Số dư ban đầu: " + "$" + String.format("%.2f", initialBalance) + ". ";
        summary += "Số tiền: " + "$" + String.format("%.2f", amount) + ". ";
        summary += "Số dư cuối: " + "$" + String.format("%.2f", finalBalance) + ".";
        return summary;
    }
}
