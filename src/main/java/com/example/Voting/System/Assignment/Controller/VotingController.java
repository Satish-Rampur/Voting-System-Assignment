package com.example.Voting.System.Assignment.Controller;

import com.example.Voting.System.Assignment.Service.VotingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @GetMapping("/countvote")
    public String countVote(@RequestParam String name) {
        return votingService.countVote(name);
    }

    @GetMapping("/listvote")
    public Map<String, Integer> listVotes() {
        return votingService.listVotes();
    }

    @GetMapping("/getwinner")
    public String getWinner() {
        return votingService.getWinner();
    }
}
