package ch.noseryoung.blj;

public class Football {

    private String name;
    private int age;
    private String position;
    private int number;
    private int goals;


    public Football(String name, int age, String position, int number, int goals) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.number = number;
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }


}
