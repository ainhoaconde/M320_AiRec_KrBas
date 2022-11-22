package ch.noseryoung.blj;

import java.util.Scanner;

public class Menu {
    static Football football = new Football();
    private static boolean isRunning = true;

    public static void menu() {
        int antwort;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|\t[1]  - Enter team Name                |");
            System.out.println("|\t[2]  - Print Team Name                |");
            System.out.println("+-----------------------------------+");
            Scanner scanchoice = new Scanner(System.in);
            int choiceentry = scanchoice.nextInt();
            if (choiceentry == 1) {
                enterTeamName();
            } else if (choiceentry == 2) {
                printTeamName();
            } else {
                System.out.println("Invalid Input");
            }
            System.out.println("----------------------------------------------");
            System.out.println("Wollen Sie weitermachen  1-ja  0-nein");
            antwort = scanchoice.nextInt();
        } while (antwort == 1);
    }

    private static void enterTeamName() {
        football.setName("FC Zürich");
    }
    private static void printTeamName() {
        System.out.println("Name: " + football.getName());
    }




}
