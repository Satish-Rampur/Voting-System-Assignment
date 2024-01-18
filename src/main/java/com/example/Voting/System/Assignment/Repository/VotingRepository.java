package com.example.Voting.System.Assignment.Repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class VotingRepository {

    private final Map<String, Integer> candidateVotes = new HashMap<>();

    public String enterCandidate(String name) {
        if (!candidateVotes.containsKey(name)) {
            candidateVotes.put(name, 0);
            return "Candidate " + name + " entered successfully!";
        } else {
            return "Candidate " + name + " already exists!";
        }
    }

    public String castVote(String name) {
        if (candidateVotes.containsKey(name)) {
            int currentVotes = candidateVotes.get(name);
            candidateVotes.put(name, currentVotes + 1);
            return "Vote cast successfully for candidate " + name + ". Total votes: " + (currentVotes + 1);
        } else {
            return "Invalid candidate name!";
        }
    }

    public String countVote(String name) {
        if (candidateVotes.containsKey(name)) {
            return "Current vote count for candidate " + name + ": " + candidateVotes.get(name);
        } else {
            return "Invalid candidate name!";
        }
    }
}
