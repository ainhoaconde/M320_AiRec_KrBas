// imports the necessary libraries
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * This class is the main menu of the program
 * It contains the main method and the menu method
 * @author: Ainhoa&Krish
 * @version: 1.0
 * @since: 2020-12-09
 * @exception: InputMismatchException
 * @see: PlayerTeamManager
 * @see: Player
 */
public class Menu {
    // Create a new object from the PlayerTeamManager class
    static PlayerTeamManager PTM = new PlayerTeamManager();
    // The menu method contains the menu and the options
    public static void menu() throws InputMismatchException {
        PTM.DemoData();
        // The variable choiceentry is used to store the user input
        int antwort;
        int choiceentry = 0;
        // The do while loop is used to repeat the menu until the user enters a number between 1 and 4
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|\t[1]  - Create Team              |");
            System.out.println("|\t[2]  - Create Player            |");
            System.out.println("|\t[3]  - See Teams                |");
            System.out.println("|\t[4]  - See Players              |");
            System.out.println("+-----------------------------------+");
            Scanner scanchoice = new Scanner(System.in);
            choiceentry = scanchoice.nextInt();
            // If the user enters 1, the method inputAddTeam() from the PlayerTeamManager class is called
            if (choiceentry == 1) {
                do {
                    //The try catch block is used to catch the InputMismatchException
                    try {
                        PTM.inputAddTeam();
                        choiceentry = 0;
                        // If the user enters a number that is not between 1 and 4, the catch block is executed
                    } catch (InputMismatchException e) {
                        System.out.println("Geben Sie bitte eine Zahl ein");
                    }
                    // The while loop is used to repeat the try catch block until the user enters a number between 1 and 4
                } while (choiceentry == 1);
    // If the user enters 2, the method inputAddPlayer() from the PlayerTeamManager class is called
            } else if (choiceentry == 2) {
                do {
                    try {
                        PTM.inputAddPlayer();
                        choiceentry = 0;
                    } catch (InputMismatchException e) {
                        System.out.println("Geben Sie bitte eine Zahl ein");
                        PTM.inputAddPlayer();
                    }
                } while (choiceentry == 2);
                // If the user enters 3, the method inputSeeTeams() from the PlayerTeamManager class is called
            } else if (choiceentry == 3) {
                do {
                    try {
                        PTM.printTeam();
                        choiceentry = 0;
                    } catch (InputMismatchException e) {
                        System.out.println("Geben Sie bitte eine Zahl ein");
                        PTM.printTeam();
                    }
                } while (choiceentry == 3);
                // If the user enters 4, the method inputSeePlayers() from the PlayerTeamManager class is called
            } else if (choiceentry == 4) {
                do {
                    try {
                        PTM.printPlayer();
                        choiceentry = 0;
                    } catch (InputMismatchException e) {
                        System.out.println("Geben Sie bitte eine Zahl ein");
                        PTM.printPlayer();
                    }
                } while (choiceentry == 4);
            } else {
                /**
                 * @exception: InputMismatchException
                 * If the user enters a number that is not between 1 and 4, the program will print the following message
                 */
                throw new InputMismatchException("Please enter a number between 1 and 4");

            }
            System.out.println("----------------------------------------------");
            System.out.println("Wollen Sie weitermachen  1-ja  0-nein");
            antwort = scanchoice.nextInt();
        } while (antwort == 1);
    }

}
