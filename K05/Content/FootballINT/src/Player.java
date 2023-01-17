public class Player extends Person{
    private final int position;

    public Player(int position, String first_name, String last_name, int Age) {
        super(first_name, last_name, Age);
        this.position = position;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Position: " + position);
    }

}
