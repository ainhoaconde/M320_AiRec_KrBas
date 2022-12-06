import java.util.InputMismatchException;
public class Program {
    // this is the main method of the program
    static Menu menu = new Menu();
    public static void main(String[] args) {
        try {
            menu.menu();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number between 1 and 4");
        }

    }}
