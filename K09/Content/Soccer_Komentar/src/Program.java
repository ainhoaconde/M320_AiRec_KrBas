import java.util.InputMismatchException;  //imports the exception inputmismatchexception from the java.util package
public class Program {
    // this is the main method of the program
    static Menu menu = new Menu();
    /**
     * This is the main method of the program
     * @param args
     * @throws InputMismatchException
     */
    public static void main(String[] args) {
        try {
            menu.menu();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number between 1 and 4");
        }

    }}
