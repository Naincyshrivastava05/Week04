package insurance_policy_management_system;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PolicyManager {
    private final Map<String, Policy> policies = new HashMap<>();

    public void addPolicy(Policy policy) {
        policies.put(policy.policyNumber, policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return policies.get(policyNumber);
    }

    public List<Policy> getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);
        return policies.values().stream()
                .filter(policy -> policy.expiryDate.isAfter(today) && policy.expiryDate.isBefore(threshold))
                .collect(Collectors.toList());
    }

    public List<Policy> getPoliciesByHolder(String policyHolder) {
        return policies.values().stream()
                .filter(policy -> policy.policyHolder.equals(policyHolder))
                .collect(Collectors.toList());
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        policies.values().removeIf(policy -> policy.expiryDate.isBefore(today));
    }

    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        manager.addPolicy(new Policy("P123", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P124", "Bob", LocalDate.now().minusDays(5)));
        manager.addPolicy(new Policy("P125", "Alice", LocalDate.now().plusDays(40)));

        System.out.println("Policy P123: " + manager.getPolicyByNumber("P123"));
        System.out.println("Policies expiring soon: " + manager.getPoliciesExpiringSoon());
        System.out.println("Policies for Alice: " + manager.getPoliciesByHolder("Alice"));
        manager.removeExpiredPolicies();
        System.out.println("Policies after removing expired: " + manager.policies);
    }
}
