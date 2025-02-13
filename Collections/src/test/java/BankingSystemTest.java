import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class BankingSystemTest {
    @Test
    void testAddAccount() {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(1001, 500.0);
        bank.addAccount(1002, 1500.0);

        assertEquals(500.0, bank.getAccounts().get(1001));
        assertEquals(1500.0, bank.getAccounts().get(1002));
    }

    @Test
    void testDeposit() {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(1001, 500.0);
        bank.deposit(1001, 200.0);

        assertEquals(700.0, bank.getAccounts().get(1001));
    }

    @Test
    void testWithdrawalRequest() {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(1001, 500.0);
        bank.requestWithdrawal(1001);

        Queue<Integer> withdrawalQueue = bank.getWithdrawalQueue();
        assertEquals(1001, withdrawalQueue.poll());
    }
}
