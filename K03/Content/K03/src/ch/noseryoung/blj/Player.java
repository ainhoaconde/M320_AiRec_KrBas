package ch.noseryoung.blj;

public class Player {
    private String name;
    private int number;
    private int age;
    private String position;
    private int goals;
    private int gamesPlayed;

    public Player(String name, int number, int age, String position, int goals, int gamesPlayed) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.position = position;
        this.goals = goals;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
}
