import bank_transaction_system.BankAccount;
import bank_transaction_system.InsufficientBalanceException;
import  org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BankTransactionTest {
    BankAccount ba = new BankAccount(5000);
    @Test
    public void illegalArgument(){
        assertThrows(IllegalArgumentException.class, ()-> BankAccount.withdraw(-2));
    }
    @Test
    public void insufficiantBalance(){
        assertThrows(InsufficientBalanceException.class, ()->BankAccount.withdraw(10000));
    }
}
