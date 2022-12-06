/**
 * is the class that represents a player
 */
public class Player {
    private String name;
    private int number;
    private int age;
    private String position;
    private int goals;
    private int gamesPlayed;

    /**
     * Constructor for the Player class
     * that takes in the name, number, age, position, goals and games played
     * @param name
     * @param number
     * @param age
     * @param position
     * @param goals
     * @param gamesPlayed
     */
    public Player(String name, int number, int age, String position, int goals, int gamesPlayed) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.position = position;
        this.goals = goals;
        this.gamesPlayed = gamesPlayed;
    }

    /**
     * shows the name of the player
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     *  sets the name of the player
     * @param name the name of the player is set to this value
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * shows the number of the player
     * @return the number of the player
     */
    public int getNumber() {
        return number;
    }

    /**
     * sets the number of the player
     * @param number the number of the player is set to this value
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * shows the age of the player
     * @return the age of the player
     */
    public int getAge() {
        return age;
    }

    /**
     * sets the age of the player
     * @param age the age of the player is set to this value
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *  shwos the position of the player
     * @return the position of the player
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the position of the player
     * @param position the position of the player is set to this value
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Shows the goals of the player
     * @return the number of goals scored by the player
     */
    public int getGoals() {
        return goals;
    }

    /**
     * Sets the goals of the player
     * @param goals The goals of the player is set to this value
     */
    public void setGoals(int goals) {
        this.goals = goals;
    }

    /**
     * shwos the games played
     * @return the gamesPlayed
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * Sets the number of games played
     * @param gamesPlayed the games played is set to this value
     */
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
}
