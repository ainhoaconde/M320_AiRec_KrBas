package ch.noseryoung.blj;
/**
 * This class represents a Tenis-tournament.
 * @author Krish & ainhoa
 * @version 1.0.0
 */

public class Tournament {
    // attributes
    private String name;
    private float prizeMoney;
    private Match match1;
    private Player player1;
    private Player player2;

    public Tournament(Player p1, Player p2, String name, float prizeMoney) {
        /**
         * This constructor creates a tournament.
         * it also shows a composition between tournament and match.
         * and a aggregation between tournament and player.
         * @param name
         * @param prizeMoney
         * @param match1
         * @param player1
         * @param player2
         */
        player1 = p1;
        player2 = p2;
        match1 = new Match(player1, player2, "Hard");
        player1.setName("Roger Federer");
        player1.setAge(38);
        player1.setSingleTitles(20);
        player1.setWins(103);
        player1.setTrainer(new Trainer("Paul Annacone", 1.83f));
        player1.setRacket(new Racket(0.68f, 0.68f, "Wilson"));

        player2.setName("Rafael Nadal");
        player2.setAge(34);
        player2.setSingleTitles(19);
        player2.setWins(86);
        player2.setTrainer(new Trainer("Carlos Moya", 1.83f));
        player2.setRacket(new Racket(0.68f, 0.68f, "Wilson"));


        this.name = name;
        this.prizeMoney = prizeMoney;



    }

    /**
     * This method gets the name of the tournament.
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * This method set the name of the tournament.
     * @return name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * This method gets the prize money of the tournament.
     * @return prizeMoney
     */
    public float getPrizeMoney() {
        return prizeMoney;
    }
    /**
     * This method set the prize money of the tournament.
     * @return prizeMoney
     */
    public void setPrizeMoney(float prizeMoney) {
        this.prizeMoney = prizeMoney;
    }
    /**
     * This method gets the match of the tournament.
     * @return match1
     */
    public Match getMatch1() {
        return match1;
    }
    /**
     * This method set the match of the tournament.
     * @return match1
     */
    public void setMatch1(Match match1) {
        this.match1 = match1;
    }
    /**
     * This method gets the first player of the tournament.
     * @return player1
     */
    public Player getPlayer1() {
        return player1;
    }
    /**
     * This method set the first player of the tournament.
     * @return player1
     */
    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }
    /**
     * This method gets the second player of the tournament.
     * @return player2
     */
    public Player getPlayer2() {
        return player2;
    }
    /**
     * This method set the second player of the tournament.
     * @return player2
     */
    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}

