package com.example.Voting.System.Assignment.Controller;

import com.example.Voting.System.Assignment.Service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voting")
public class VotingController {

@Autowired
    private final VotingService votingService;

    public VotingController(VotingService votingService) {
        this.votingService = votingService;
    }

    @PostMapping("/entercandidate")
    public String enterCandidate(@RequestParam String name) {
        return votingService.enterCandidate(name);
    }

    @PostMapping("/castvote")
    public String castVote(@RequestParam String name) {
        return votingService.castVote(name);
    }
}
