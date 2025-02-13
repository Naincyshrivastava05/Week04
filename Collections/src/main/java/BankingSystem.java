import java.util.*;

class BankingSystem{
    private final Map<Integer, Double> accounts;
    private final TreeMap<Double, Integer> sortedAccounts;
    private final Queue<Integer> withdrawalQueue;

    public BankingSystem() {
        this.accounts = new HashMap<>();
        this.sortedAccounts = new TreeMap<>();
        this.withdrawalQueue = new LinkedList<>();
    }

    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
        }
    }

    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
        }
    }

    public Queue<Integer> getWithdrawalQueue() {
        return new LinkedList<>(withdrawalQueue);
    }

    public Map<Integer, Double> getAccounts() {
        return new HashMap<>(accounts);
    }
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for account: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(1001, 500.0);
        bank.addAccount(1002, 1500.0);
        bank.deposit(1001, 200.0);
        bank.requestWithdrawal(1001);
        bank.processWithdrawals();
    }
}
