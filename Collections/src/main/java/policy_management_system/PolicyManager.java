package policy_management_system;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {
    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>();

    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }

    public Set<Policy> getAllPolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public Set<Policy> getExpiringSoonPolicies() {
        Set<Policy> expiringSoon = new HashSet<>();
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        for (Policy policy : treeSetPolicies) {
            if (policy.getExpiryDate().isBefore(next30Days)) {
                expiringSoon.add(policy);
            } else {
                break;
            }
        }
        return expiringSoon;
    }

    public Set<Policy> getPoliciesByCoverageType(String coverageType) {
        Set<Policy> result = new HashSet<>();
        for (Policy policy : hashSetPolicies) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                result.add(policy);
            }
        }
        return result;
    }

    public Set<Policy> getDuplicatePolicies() {
        Set<String> seenPolicyNumbers = new HashSet<>();
        Set<Policy> duplicates = new HashSet<>();
        for (Policy policy : hashSetPolicies) {
            if (!seenPolicyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }

    public void comparePerformance() {
        int size = 100000;
        List<Policy> testPolicies = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            testPolicies.add(new Policy("P" + i, "Holder" + i, LocalDate.now().plusDays(i), "Auto", 1000 + i));
        }

        long start, end;

        // HashSet Performance
        Set<Policy> hashSet = new HashSet<>();
        start = System.nanoTime();
        hashSet.addAll(testPolicies);
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSet.contains(testPolicies.get(size / 2));
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        hashSet.remove(testPolicies.get(size / 2));
        end = System.nanoTime();
        System.out.println("HashSet Remove Time: " + (end - start) + " ns");

        // LinkedHashSet Performance
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        start = System.nanoTime();
        linkedHashSet.addAll(testPolicies);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(testPolicies.get(size / 2));
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.remove(testPolicies.get(size / 2));
        end = System.nanoTime();
        System.out.println("LinkedHashSet Remove Time: " + (end - start) + " ns");

        // TreeSet Performance
        Set<Policy> treeSet = new TreeSet<>();
        start = System.nanoTime();
        treeSet.addAll(testPolicies);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(testPolicies.get(size / 2));
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.remove(testPolicies.get(size / 2));
        end = System.nanoTime();
        System.out.println("TreeSet Remove Time: " + (end - start) + " ns");
    }

    public static void main(String[] args) {
        PolicyManager manager = new PolicyManager();
        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(20), "Health", 1500));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 2000));
        manager.addPolicy(new Policy("P003", "Charlie", LocalDate.now().plusDays(10), "Home", 1800));
        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(20), "Health", 1500)); // Duplicate

        System.out.println("All Policies: " + manager.getAllPolicies());
        System.out.println("Expiring Soon: " + manager.getExpiringSoonPolicies());
        System.out.println("Auto Policies: " + manager.getPoliciesByCoverageType("Auto"));
        System.out.println("Duplicate Policies: " + manager.getDuplicatePolicies());

        System.out.println("\nPerformance Comparison:");
        manager.comparePerformance();
    }
}
