package com.example.Voting.System.Assignment.Service;

import com.example.Voting.System.Assignment.Repository.VotingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class VotingService {
    @Autowired
    private final VotingRepository votingRepository;

    public VotingService(VotingRepository votingRepository) {
        this.votingRepository = votingRepository;
    }

    public String enterCandidate(String name) {
        return votingRepository.enterCandidate(name);
    }

    public String castVote(String name) {
        return votingRepository.castVote(name);
    }

    public String countVote(String name) {
        return votingRepository.countVote(name);
    }

    public Map<String, Integer> listVotes() {
        return votingRepository.listVotes();
    }

    public String getWinner() {
        return votingRepository.getWinner();
    }
}
