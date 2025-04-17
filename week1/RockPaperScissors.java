package week1;//question12
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Ask for player's choice
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String playerChoice = scanner.nextLine().toLowerCase();

        // Generate random number: 1 = rock, 2 = paper, 3 = scissors
        int computerNumber = random.nextInt(3) + 1;
        String computerChoice = "";

        // Use if-else to assign computer choice
        if (computerNumber == 1) {
            computerChoice = "rock";
        } else if (computerNumber == 2) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }

        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
                (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                        (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                        (playerChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else if (
                playerChoice.equals("rock") ||
                        playerChoice.equals("paper") ||
                        playerChoice.equals("scissors")
        ) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid input. Please choose rock, paper, or scissors.");
        }

        scanner.close();
    }
}

// exercise 3
class DiceRoll {
    public static void main(String[] args) {
        // Generate a random number between 1 and 6
        int dice = (int)(Math.random() * 6) + 1;

        // Print the result
        System.out.println("You rolled a " + dice + "!");
    }
}
//exercise 4


class HeroStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the player's name
        System.out.print("Enter your hero's name: ");
        String name = scanner.nextLine();

        // Ask for strength
        System.out.print("Enter your hero's strength (number): ");
        int strength = scanner.nextInt();

        // Ask for agility
        System.out.print("Enter your hero's agility (number): ");
        int agility = scanner.nextInt();

        // Print the hero stats
        System.out.println("Hero: " + name + " | Strength: " + strength + " | Agility: " + agility);

        scanner.close();
    }
}


// exercise 5

class LevelUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for current level
        System.out.print("Enter your current level: ");
        int level = scanner.nextInt();

        // Level up
        level = level + 1;

        // Print new level
        System.out.println("You leveled up! You are now level " + level);

        scanner.close();
    }
}

// exercise 6

class CoinCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of gold coins
        System.out.print("How many gold coins did you find? ");
        int gold = scanner.nextInt();

        // Ask for number of silver coins
        System.out.print("How many silver coins did you find? ");
        int silver = scanner.nextInt();

        // Gold = 10 points, Silver = 1 point
        int totalScore = (gold * 10) + silver;

        // Print total score
        System.out.println("Total Score: " + totalScore);

        scanner.close();
    }
}
//exercise 7
class OddOrEvenDice {
    public static void main(String[] args) {
        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("You rolled a " + dice);
        if (dice % 2 == 0) {
            System.out.println("It's even!");
        } else {
            System.out.println("It's odd!");
        }
    }
}
//exercise 10
class MagicNumberGuess{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        System.out.print("Guess the magic number");
        int guess = scanner.nextInt();
        if (guess== secretNumber) {
            System.out.println("Correct!You guesses the magic number");
        }else {
            System.out.println("Wrong! The Magic number was"+secretNumber);
        }
        scanner.close();
    }
}
