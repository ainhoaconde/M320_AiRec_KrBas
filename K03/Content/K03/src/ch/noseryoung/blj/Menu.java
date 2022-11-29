package ch.noseryoung.blj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    static PlayerTeamManager PTM = new PlayerTeamManager();

    public static void menu() throws InputMismatchException {
        PTM.DemoData();
        int antwort;
        int choiceentry = 0;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|\t[1]  - Create Team              |");
            System.out.println("|\t[2]  - Create Player            |");
            System.out.println("|\t[3]  - See Teams                |");
            System.out.println("|\t[4]  - See Players              |");
            System.out.println("+-----------------------------------+");
            Scanner scanchoice = new Scanner(System.in);
                 choiceentry = scanchoice.nextInt();
            if (choiceentry == 1) {
                PTM.inputAddTeam();
            } else if (choiceentry == 2) {
                PTM.inputAddPlayer();
            } else if (choiceentry == 3) {
                PTM.printTeam();
            } else if (choiceentry == 4) {
                PTM.printPlayer();
            }
            System.out.println("----------------------------------------------");
            System.out.println("Wollen Sie weitermachen  1-ja  0-nein");
            antwort = scanchoice.nextInt();
        } while (antwort == 1);
    }

}
