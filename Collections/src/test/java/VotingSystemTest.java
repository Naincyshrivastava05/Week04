import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {
    @Test
    void testVotingSystem() {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        Map<String, Integer> sortedResults = votingSystem.getSortedResults();
        assertEquals(2, sortedResults.get("Alice"));
        assertEquals(1, sortedResults.get("Bob"));
    }
}