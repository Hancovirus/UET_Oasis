public class InvalidFundingAmountException extends BankException {

    public InvalidFundingAmountException(String message) {
        super(message);
    }

    public InvalidFundingAmountException(double amount) {
        super("Số tiền không hợp lệ: $" + String.format("%.2f", amount));
    }
    
}
