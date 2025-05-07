package week5.Soccer;

public class Main {
    public static void main(String[] args) {
        Tournament tournament = new Tournament("Champions Cup");

        for (int i = 1; i <= 8; i++) {
            Team team = new Team("Team " + i);
            team.addPlayer(new Player("PlayerA" + i, "Forward", 9));
            team.addPlayer(new Player("PlayerB" + i, "Midfielder", 10));
            team.addPlayer(new Player("PlayerC" + i, "Defender", 5));
            tournament.addTeam(team);
        }

        tournament.startTournament();
    }
}
