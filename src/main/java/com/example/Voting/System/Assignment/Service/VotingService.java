package com.example.Voting.System.Assignment.Service;

import com.example.Voting.System.Assignment.Repository.VotingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
