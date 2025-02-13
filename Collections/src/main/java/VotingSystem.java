import java.util.*;

class VotingSystem {
    private final Map<String, Integer> voteCount;
    private final TreeMap<String, Integer> sortedResults;
    private final LinkedHashMap<String, Integer> voteOrder;

    public VotingSystem() {
        this.voteCount = new HashMap<>();
        this.sortedResults = new TreeMap<>();
        this.voteOrder = new LinkedHashMap<>();
    }

    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        sortedResults.put(candidate, voteCount.get(candidate));
        voteOrder.put(candidate, voteCount.get(candidate));
    }

    public Map<String, Integer> getSortedResults() {
        return new TreeMap<>(sortedResults);
    }

    public Map<String, Integer> getVoteOrder() {
        return new LinkedHashMap<>(voteOrder);
    }

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        System.out.println("Sorted Results: " + votingSystem.getSortedResults());
        System.out.println("Vote Order: " + votingSystem.getVoteOrder());
    }
}

