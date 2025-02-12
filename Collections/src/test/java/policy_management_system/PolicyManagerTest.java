package policy_management_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Set;

public class PolicyManagerTest {
    private PolicyManager manager;

    @BeforeEach
    void setUp() {
        manager = new PolicyManager();
        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(20), "Health", 1500));
        manager.addPolicy(new Policy("P002", "Bob", LocalDate.now().plusDays(40), "Auto", 2000));
        manager.addPolicy(new Policy("P003", "Charlie", LocalDate.now().plusDays(10), "Home", 1800));
        manager.addPolicy(new Policy("P001", "Alice", LocalDate.now().plusDays(20), "Health", 1500)); // Duplicate
    }

    @Test
    void testAddPolicy() {
        Set<Policy> policies = manager.getAllPolicies();
        assertEquals(3, policies.size()); // Ensures duplicates are not added
    }

    @Test
    void testExpiringSoonPolicies() {
        Set<Policy> expiringSoon = manager.getExpiringSoonPolicies();
        assertEquals(2, expiringSoon.size()); // Should return 2 policies expiring in next 30 days
    }

    @Test
    void testGetPoliciesByCoverageType() {
        Set<Policy> autoPolicies = manager.getPoliciesByCoverageType("Auto");
        assertEquals(1, autoPolicies.size());
        assertTrue(autoPolicies.iterator().next().getCoverageType().equals("Auto"));
    }

    @Test
    void testGetDuplicatePolicies() {
        Set<Policy> duplicates = manager.getDuplicatePolicies();
        assertEquals(1, duplicates.size()); // Only "P001" was duplicated
    }

    @Test
    void testTreeSetSorting() {
        Policy[] policies = manager.getAllPolicies().toArray(new Policy[0]);
        assertTrue(policies[0].getExpiryDate().isBefore(policies[1].getExpiryDate()));
    }
}

