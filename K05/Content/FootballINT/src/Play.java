import java.util.ArrayList;

public class Play implements Match{
    private String referee;
    private String ball;
    private  String Stadium;

    @Override
    public void addMatch(String team1, String team2, int score1, int score2) {
        System.out.println("Team 1: " + team1);
        System.out.println("Team 2: " + team2);
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);

}

    public Play(String referee, String ball, String stadium) {
        this.referee = referee;
        this.ball = ball;
        Stadium = stadium;
    }
}
