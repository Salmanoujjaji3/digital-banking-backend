package ma.mundia.ebankingbackend.exceptions;

public class BankAccountNotSufficientException extends Exception {
    public BankAccountNotSufficientException(String message) {
        super(message);
    }
}
