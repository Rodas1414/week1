package week5.Soccer;

import java.util.ArrayList;
import java.util.List;

public class Round {
    private List<Match> matches;

    public Round(List<Match> matches) {
        this.matches = matches;
    }

    public List<Team> playRound() {
        System.out.println("=== Starting Round ===");
        List<Team> winners = new ArrayList<>();
        for (Match match : matches) {
            match.play();
            winners.add(match.getWinner());
        }
        System.out.println("=== Round complete ===\n");
        return winners;
    }

    public List<Match> getMatches() {
        return matches;
    }
}

