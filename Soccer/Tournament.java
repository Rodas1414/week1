package Soccer;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    private String name;
    private List<Team> teams;
    private List<Round> rounds;
    private Team winner;

    public Tournament(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
        this.rounds = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public void startTournament() {
        List<Team> currentTeams = new ArrayList<>(teams);

        for (int roundNum = 1; currentTeams.size() > 1; roundNum++) {
            List<Match> matches = new ArrayList<>();
            for (int i = 0; i < currentTeams.size(); i += 2) {
                matches.add(new Match(currentTeams.get(i), currentTeams.get(i + 1)));
            }

            Round round = new Round(matches);
            rounds.add(round);
            currentTeams = round.playRound();
        }

        if (!currentTeams.isEmpty()) {
            winner = currentTeams.get(0);
            System.out.println("🏆 The winner of the tournament is: " + winner.getName());
        }
    }

    public Team getWinner() {
        return winner;
    }
}
