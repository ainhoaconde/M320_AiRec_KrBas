
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * This class is used to create a team
 */
public class PlayerTeamManager {
    ArrayList<Team> TeamArray = new ArrayList<>();
    ArrayList<Player> PlayerArray = new ArrayList<>();

    public void DemoData() {
        addPlayer(new Player("Krish", 10, 18, "ST", 6969, 69));
        addTeam(new Team("FC Zürich", 69, 1896, 36, 30, 3, 3));
    }

    /**
     * This method thorws an exception if the user enters a plaryer that already exists
     * @param player
     * @throws IllegalArgumentException
     */
    public void addPlayer(Player Player) throws IllegalArgumentException {
        if (PlayerArray.contains(Player)) {
            System.out.println(Player.getName() + " existiert schon");
        } else {
            PlayerArray.add(Player);
        }
    }
    /**
     * This method thorws an exception if the user enters a team that already exists
     * @param team
     * @throws IllegalArgumentException
     */
    public void addTeam(Team Team) throws IllegalArgumentException {
        if (TeamArray.contains(Team)) {
            System.out.println(Team.getName() + " existiert schon");
        } else {
            TeamArray.add(Team);
        }
    }
    /**
     * This method is used to add a player
     */
    public void inputAddPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Position:");
        String position = sc.nextLine();
        System.out.println("Number:");
        int number = sc.nextInt();
        System.out.println("Age:");
        int age = sc.nextInt();
        System.out.println("Goals:");
        int goals = sc.nextInt();
        System.out.println("Games Played:");
        int gamesPlayed = sc.nextInt();

        /**
         * This method is used to add players to the array
         */
        PlayerArray.add(new Player(name, number, age, position, goals, gamesPlayed));
        PlayerArray.sort(Comparator.comparing(Player::getName));
        for (int i = 0; i < PlayerArray.size(); i++) {
            if (PlayerArray.get(i).getName().equals(name)) {
                System.out.println("Willkommen zu FIFA");
                System.out.println("-----------------------------");
                System.out.println("Name: " + PlayerArray.get(i).getName());
                System.out.println("Number: " + PlayerArray.get(i).getNumber());
                System.out.println("Age: " + PlayerArray.get(i).getAge());
                System.out.println("Position: " + PlayerArray.get(i).getPosition());
                System.out.println("Goals: " + PlayerArray.get(i).getGoals());
                System.out.println("Games Played: " + PlayerArray.get(i).getGamesPlayed());
            }
        }
    }
    /**
     * This method is used to add teams
     */

    public void inputAddTeam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Points:");
        int points = sc.nextInt();
        System.out.println("Goals:");
        int goals = sc.nextInt();
        System.out.println("Games Played:");
        int gamesPlayed = sc.nextInt();
        System.out.println("Wins:");
        int wins = sc.nextInt();
        System.out.println("Draws:");
        int draws = sc.nextInt();
        System.out.println("Losses:");
        int losses = sc.nextInt();

        /**
         * This method is used to add teams to the array
         */

        TeamArray.add(new Team(name, points, goals, gamesPlayed, wins, draws, losses));
        TeamArray.sort(Comparator.comparing(Team::getName));
        for (int i = 0; i < TeamArray.size(); i++) {
            if (TeamArray.get(i).getName().equals(name)) {
                System.out.println("Willkommen zu FIFA");
                System.out.println("-----------------------------");
                System.out.println("Name: " + TeamArray.get(i).getName());
                System.out.println("Points: " + TeamArray.get(i).getPoints());
                System.out.println("Goals: " + TeamArray.get(i).getGoals());
                System.out.println("Games Played: " + TeamArray.get(i).getGamesPlayed());
                System.out.println("Wins: " + TeamArray.get(i).getWins());
                System.out.println("Draws: " + TeamArray.get(i).getDraws());
                System.out.println("Losses: " + TeamArray.get(i).getLosses());
            }
        }
    }
    /**
     * This method is used to printed a player
     */
    public void printPlayer() {
        System.out.println("**********************************************");
        System.out.println("                   Players");
        System.out.println("**********************************************");
        PlayerArray.sort(Comparator.comparing(Player::getName));
        for (int i = 0; i < PlayerArray.size(); i++) {
            System.out.println("Name : " + PlayerArray.get(i).getName());
            System.out.println("Number : " + PlayerArray.get(i).getNumber());
            System.out.println("Age : " + PlayerArray.get(i).getAge());
            System.out.println("Position : " + PlayerArray.get(i).getPosition());
            System.out.println("Goals : " + PlayerArray.get(i).getGoals());
            System.out.println("Games Played : " + PlayerArray.get(i).getGamesPlayed());
            System.out.println("----------------------------------------------");
        }
    }
    /**
     * This method is used to printed a team
     */
    public void printTeam() {
        System.out.println("**********************************************");
        System.out.println("                    Teams");
        System.out.println("**********************************************");
        TeamArray.sort(Comparator.comparing(Team::getName));
        for (int i = 0; i < TeamArray.size(); i++) {
            System.out.println("Name : " + TeamArray.get(i).getName());
            System.out.println("Points : " + TeamArray.get(i).getPoints());
            System.out.println("Goals : " + TeamArray.get(i).getGoals());
            System.out.println("Games Played : " + TeamArray.get(i).getGamesPlayed());
            System.out.println("Wins : " + TeamArray.get(i).getWins());
            System.out.println("Draws : " + TeamArray.get(i).getDraws());
            System.out.println("Losses : " + TeamArray.get(i).getLosses());
            System.out.println("----------------------------------------------");
        }
    }

}