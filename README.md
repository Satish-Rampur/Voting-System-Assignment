# Voting System

This is a simple Spring Boot application for a voting system. It allows users to enter candidates, cast votes, and view voting statistics.

# Prerequisites

- Java 11 or later
- Maven or Gradle for building the project

API Endpoints
POST /voting/entercandidate: Enter a new candidate.
POST /voting/castvote: Cast a vote for a candidate.
GET /voting/countvote: Get the vote count for a specific candidate.
GET /voting/listvote: Get a list of all candidates and their vote counts.
GET /voting/getwinner: Get the name of the candidate with the highest votes.
