package com.example.Voting.System.Assignment.Service;

import com.example.Voting.System.Assignment.Controller.VotingController;
import com.example.Voting.System.Assignment.Repository.VotingRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
class VotingServiceTest {
    @Mock
    private VotingRepository votingRepository;

    @InjectMocks
    private VotingService votingService;

    @InjectMocks
    private VotingController votingController;
    @BeforeEach
    public void setup() {
        votingController = new VotingController(votingService);
    }

    @Test
    void enterCandidate() {
        when(votingRepository.enterCandidate("John")).thenReturn("Candidate John entered successfully!");
        String result = votingController.enterCandidate("John");
        assertEquals("Candidate John entered successfully!", result);
    }

    @Test
    void castVote() {
        when(votingRepository.castVote("John")).thenReturn("Vote cast successfully for candidate John. Total votes: 1");
        String result = votingController.castVote("John");
        assertEquals("Vote cast successfully for candidate John. Total votes: 1", result);
    }

    @Test
    void countVote() {
        when(votingRepository.countVote("John")).thenReturn("Current vote count for candidate John: 2");
        String result = votingController.countVote("John");
        assertEquals("Current vote count for candidate John: 2", result);
    }

    @Test
    void listVotes() {
        when(votingRepository.listVotes()).thenReturn(Map.of("John", 2, "Jane", 1));
        Map<String, Integer> result = votingController.listVotes();
        assertEquals(Map.of("John", 2, "Jane", 1), result);
    }

    @Test
    void getWinner() {
        when(votingRepository.getWinner()).thenReturn("Winner: John");
        String result = votingController.getWinner();
        assertEquals("Winner: John", result);
    }
}