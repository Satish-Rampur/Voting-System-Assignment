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
}
