import insurance_policy_management_system.PolicyManager;
import org.junit.jupiter.api.Test;
import policy_management_system.Policy;
import java.time.LocalDate;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class PolicyManagerTest {
    @Test
    void testGetPolicyByNumber() {
        PolicyManager manager = new PolicyManager();
        Policy policy = new Policy("P123", "Alice", LocalDate.now().plusDays(10));
        manager.addPolicy(policy);

        assertEquals(policy, manager.getPolicyByNumber("P123"));
        assertNull(manager.getPolicyByNumber("P999"));
    }

    @Test
    void testGetPoliciesExpiringSoon() {
        PolicyManager manager = new PolicyManager();
        Policy policy1 = new Policy("P123", "Alice", LocalDate.now().plusDays(10));
        Policy policy2 = new Policy("P124", "Bob", LocalDate.now().plusDays(31));
        manager.addPolicy(policy1);
        manager.addPolicy(policy2);

        List<Policy> expiringSoon = manager.getPoliciesExpiringSoon();
        assertEquals(1, expiringSoon.size());
        assertTrue(expiringSoon.contains(policy1));
    }

    @Test
    void testGetPoliciesByHolder() {
        PolicyManager manager = new PolicyManager();
        Policy policy1 = new Policy("P123", "Alice", LocalDate.now().plusDays(10));
        Policy policy2 = new Policy("P124", "Alice", LocalDate.now().plusDays(15));
        Policy policy3 = new Policy("P125", "Bob", LocalDate.now().plusDays(20));
        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);

        List<Policy> alicePolicies = manager.getPoliciesByHolder("Alice");
        assertEquals(2, alicePolicies.size());
        assertTrue(alicePolicies.contains(policy1));
        assertTrue(alicePolicies.contains(policy2));
    }

    @Test
    void testRemoveExpiredPolicies() {
        PolicyManager manager = new PolicyManager();
        Policy policy1 = new Policy("P123", "Alice", LocalDate.now().minusDays(1));
        Policy policy2 = new Policy("P124", "Bob", LocalDate.now().plusDays(10));
        manager.addPolicy(policy1);
        manager.addPolicy(policy2);

        manager.removeExpiredPolicies();
        assertNull(manager.getPolicyByNumber("P123"));
        assertNotNull(manager.getPolicyByNumber("P124"));
    }
}
