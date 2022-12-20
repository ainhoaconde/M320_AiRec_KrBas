package ch.noseryoung.blj;
/**
 * This class represents a match between two players.
 * @author Krish & ainhoa
 * @version 1.0.0
 */

public class Match {
    // attributes
    private Player player1;
    private Player player2;
    private String stage;
    /**
     * This constructor creates a match between two players.
     * @param player1
     * @param player2
     * @param stage
     */
    public Match(Player player1, Player player2, String stage) {
        this.player1 = player1;
        this.player2 = player2;
        this.stage = stage;
    }
    /**
     * This method returns the first player.
     * @return player1
     */
    public Player getPlayer1() {
        return player1;
    }
    /**
     * This method sets the seconde player.
     * @param player2
     */
    public Player getPlayer2() {
        return player2;
    }
    /**
     * This method returns the stage of the match.
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    /**
     * This method prints the match details.
     * @return match details
     */
    public void printInfo() {
        System.out.println("Match between " + player1.getName() + " and " + player2.getName() + " on " + stage);
    }
}
