package ch.noseryoung.blj;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
   /* static PlayerTeamManager PTM = new PlayerTeamManager();

    public static void menu() throws InputMismatchException {
        PTM.DemoData();
        int antwort;
        int choiceentry = 0;
        do {
            System.out.println("+-----------------------------------+");
            System.out.println("|\t[1]  -  Show trounament details |");
            System.out.println("|\t[2]  -  Shotw Match details      |");
            System.out.println("|\t[3]  -  Show Player details     |");
            System.out.println("|\t[4]  - See Players              |");
            System.out.println("+-----------------------------------+");
            Scanner scanchoice = new Scanner(System.in);
                choiceentry = scanchoice.nextInt();

            if (choiceentry == 1) {
                do{
                    try {
                        PTM.inputAddTeam();
                        choiceentry = 0;
                    } catch (InputMismatchException e) {
                        System.out.println("Geben Sie bitte eine Zahl ein");
                    }
                }while (choiceentry ==1);

            } else if (choiceentry == 2) {
                do {
                    try {
                        PTM.inputAddPlayer();
                        choiceentry = 0;
                    } catch (InputMismatchException e) {
                        System.out.println("Geben Sie bitte eine Zahl ein");
                        PTM.inputAddPlayer();
                    }
                }while (choiceentry == 2);
            } else if (choiceentry == 3) {
                do {
                    try {
                        PTM.printTeam();
                        choiceentry = 0;
                    } catch (InputMismatchException e) {
                        System.out.println("Geben Sie bitte eine Zahl ein");
                        PTM.printTeam();
                    }
                }while (choiceentry == 3);
            } else if (choiceentry == 4) {
                do{
                try {
                    PTM.printPlayer();
                    choiceentry = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Geben Sie bitte eine Zahl ein");
                    PTM.printPlayer();
                }}while (choiceentry == 4);
                } else {
                throw new InputMismatchException("Please enter a number between 1 and 4");

            }
            System.out.println("----------------------------------------------");
            System.out.println("Wollen Sie weitermachen  1-ja  0-nein");
            antwort = scanchoice.nextInt();
        } while (antwort == 1);
    }*/

}
