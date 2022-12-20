
public class Team {
    // this is the team class
    private String name;
    private int points;
    private int goals;
    private int gamesPlayed;
    private int wins;
    private int draws;
    private int losses;

    /**
     * Constructor for the Team class
     * that takes in the name, points, goals, games played, wins, draws and losses
     *
     * @param name
     * Der Name des Teams
     * @param points
     * @param goals
     * @param gamesPlayed
     * @param wins
     * @param draws
     * @param losses
     */
    public Team(String name, int points, int goals, int gamesPlayed, int wins, int draws, int losses) {
        this.name = name;
        this.points = points;
        this.goals = goals;
        this.gamesPlayed = gamesPlayed;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }

    /**
     * gets the name of the player
     *
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * sets the name of the player
     *
     * @return the name of the player
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets the points of the player
     *
     * @return the points of the player
     */
    public int getPoints() {
        return points;
    }

    /**
     * sets the points of the player
     *
     * @return the points of the player
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * gets the goals of the player
     *
     * @return the goals of the player
     */
    public int getGoals() {
        return goals;
    }

    /**
     * sets the goals of the player
     *
     * @return the goals of the player
     */
    public void setGoals(int goals) {
        this.goals = goals;
    }

    /**
     * gets the games played of the player
     *
     * @return the games played of the player
     */
    public int getGamesPlayed() {
        return gamesPlayed;
    }

    /**
     * sets the games played of the player
     *
     * @return the games played of the player
     */
    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    /**
     * gets the wins of the player
     *
     * @return the wins of the player
     */
    public int getWins() {
        return wins;
    }

    /**
     * sets the wins of the player
     *
     * @return the wins of the player
     */
    public void setWins(int wins) {
        this.wins = wins;
    }


    /**
     * gets the draws of the player
     *
     * @return the draws of the player
     */
    public int getDraws() {
        return draws;
    }

    /**
     * sets the draws of the player
     *
     * @return the draws of the player
     */
    public void setDraws(int draws) {
        this.draws = draws;
    }

    /**
     * gets the losses of the player
     *
     * @return the losses of the player
     */
    public int getLosses() {
        return losses;
    }

    /**
     * sets the losses of the player
     *
     * @return the losses of the player
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }
}
