package ch.noseryoung.blj;

public class Player {
    private String name;
    private int singlesTitles;
    private int age;

    private int wins;

    public Player(String name, int singlesTitles, int age, int wins) {
        this.name = name;
        this.age = age;
       this.singlesTitles = singlesTitles;
       this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSinglesTitles() {
        return singlesTitles;
    }

    public void setSinglesTitles(int singlesTitles) {
        this.singlesTitles = singlesTitles;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
