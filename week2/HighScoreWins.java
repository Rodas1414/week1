package week2;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the game score
        System.out.println("Please enter a game score: ");
        String gameScore = scanner.nextLine().trim(); // Trim spaces just in case

        // Split the input string into team names and scores
        String[] parts = gameScore.split("\\|"); // Split at the pipe '|' symbol
        String teams = parts[0]; // The first part is the teams' names
        String scores = parts[1]; // The second part is the scores

        // Split the team names and scores using the colon ':'
        String[] teamNames = teams.split(":"); // Home and Visitor team names
        String[] scoreValues = scores.split(":"); // Scores for Home and Visitor

        // Extract team names and their respective scores
        String homeTeam = teamNames[0].trim();
        String visitorTeam = teamNames[1].trim();
        int homeScore = Integer.parseInt(scoreValues[0].trim());
        int visitorScore = Integer.parseInt(scoreValues[1].trim());

        // Determine the winner
        String winner = (homeScore > visitorScore) ? homeTeam : visitorTeam;

        // Output the winner
        System.out.println("Winner: " + winner);
    }
}

