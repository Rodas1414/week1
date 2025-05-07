package Soccer;

import java.util.Random;

public class Match {
    private Team team1;
    private Team team2;
    private Team winner;

    public Match(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public void play() {
        Random random = new Random();
        winner = random.nextBoolean() ? team1 : team2;
        System.out.println("Match: " + team1.getName() + " vs " + team2.getName()
                + " — Winner: " + winner.getName());
    }

    public Team getWinner() {
        return winner;
    }
}
